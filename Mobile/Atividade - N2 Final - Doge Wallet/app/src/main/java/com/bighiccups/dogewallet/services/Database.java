package com.bighiccups.dogewallet.services;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.bighiccups.dogewallet.model.ApiObjectFromDb;
import com.bighiccups.dogewallet.model.ApiObjectToDb;

import java.util.ArrayList;
import java.util.List;


public class Database extends SQLiteOpenHelper {
    private static final int versao = 1;
    private static final String nomeDB = "bd_details";

    private static final String details_table = "coin_details";
    private static final String details_id = "id";
    private static final String details_date = "date";
    private static final String details_price = "price";
    private static final String details_owned = "owned";
    private static final String details_value = "value";
    private static final String details_gain = "gain";
    private static final String details_variation = "variation";
    public Context context;

    public Database(@Nullable Context context) {
        super(context, nomeDB, null, versao);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + details_table + "(" +
                details_id + " INTEGER PRIMARY KEY, " +
                details_date + " TEXT, " +
                details_price + " TEXT, " +
                details_owned + " TEXT, " +
                details_value + " TEXT, " +
                details_gain + " TEXT, " +
                details_variation + " TEXT)";

        db.execSQL(query);
    }

    public void addCoin(ApiObjectToDb newCoin) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(details_date,newCoin.getDate());
        values.put(details_price, newCoin.getCoinPrice());
        values.put(details_owned, newCoin.getTotalOfCoinsOwned());
        values.put(details_value, newCoin.getTotalValue());
        values.put(details_gain, newCoin.getGainFromLastValue());
        values.put(details_variation, newCoin.getPercentOfGainFromLastValue());

        db.insert(details_table,null,values);
        ApiObjectFromDb d = selectData(1);

        Toast.makeText(context, "Transaction added to Database", Toast.LENGTH_SHORT).show();
        db.close();
    }

    public void removeTransaction(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(details_table, details_id+" = ?",
                new String[]{String.valueOf(id)});

        db.close();

    }

    public void clearList() {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "DELETE FROM " + details_table;

        db.execSQL(query);
    }

    public ApiObjectFromDb selectData(int i) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(
                details_table,
                new String[]{details_id,details_date,details_price,details_owned,details_value,details_gain,details_variation},
                details_id+" = ?",
                new String[]{String.valueOf(i)},
                null,null,null);

        if (cursor != null)cursor.moveToFirst();
        else return null;

        ApiObjectFromDb coinDetails = new ApiObjectFromDb(
                cursor.getInt(0),
                cursor.getString(1),
                cursor.getString(2),
                cursor.getString(3),
                cursor.getString(4),
                cursor.getString(5),
                cursor.getString(6));
        return coinDetails;

    }

    public List<ApiObjectFromDb> listTransactions() {
        SQLiteDatabase db = this.getReadableDatabase();
        List<ApiObjectFromDb> transactionList = new ArrayList<>();
        String query = "SELECT * FROM " + details_table;

        Cursor cursor = db.rawQuery(query, null);
        if (cursor.moveToFirst()) {
            do {
                ApiObjectFromDb coinDetails = new ApiObjectFromDb();
                coinDetails.setId(Integer.parseInt(cursor.getString(0)));
                coinDetails.setDate(cursor.getString(1));
                coinDetails.setPrice(cursor.getString(2));
                coinDetails.setOwned(cursor.getString(3));
                coinDetails.setValue(cursor.getString(4));
                coinDetails.setGain(cursor.getString(5));
                coinDetails.setVariation(cursor.getString(6));
                transactionList.add(coinDetails);
            } while (cursor.moveToNext());
        }
        return transactionList;
    }
    public void updateDetails(ApiObjectFromDb details) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(details_date, details.getDate());
        values.put(details_price, details.getPrice());
        values.put(details_owned, details.getOwned());
        values.put(details_value, details.getValue());
        values.put(details_gain, details.getGain());
        values.put(details_variation, details.getVariation());

        db.update(details_table, values, details_id+" = ?",
                new String[]{String.valueOf(details.getId())});
        db.close();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
