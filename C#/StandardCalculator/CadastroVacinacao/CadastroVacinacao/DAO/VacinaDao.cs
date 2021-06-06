using CadastroVacinacao.Entidades;
using MySql.Data.MySqlClient;
using System;
using System.Data;
using System.Windows.Forms;

namespace CadastroVacinacao.DAO
{
    class VacinaDao
    {
        MySqlCommand sql;
        String sqlStr = "";
        Conexao conexao = new Conexao();



        public void Salvar(Vacina objeto)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "INSERT INTO vacina (nome, fabricante, dose, origem) VALUES (@NOME, @FABRICANTE, @DOSE, @ORIGEM)";
                sql = new MySqlCommand(sqlStr, conexao.con);
                sql.Parameters.AddWithValue("@NOME", objeto.Nome);
                sql.Parameters.AddWithValue("@FABRICANTE", objeto.Fabricante);
                sql.Parameters.AddWithValue("@DOSE", objeto.Dose);
                sql.Parameters.AddWithValue("@ORIGEM", objeto.Origem);
                sql.ExecuteNonQuery();
                conexao.FecharConexao();

            } catch (Exception)
            {
                throw;
            }
        }
   

        public void Excluir (Vacina objeto)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "DELETE FROM vacina WHERE id=@ID";
                sql = new MySqlCommand(sqlStr, conexao.con);
                sql.Parameters.AddWithValue("@ID", objeto.Id);
                sql.ExecuteNonQuery();
                conexao.FecharConexao();

            } catch (Exception)
            {
                MessageBox.Show("Id não existe");
            }
        }

        public DataTable Listar()
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "SELECT * FROM vacina";
                sql = new MySqlCommand(sqlStr, conexao.con);
                MySqlDataAdapter da = new MySqlDataAdapter();
                da.SelectCommand = sql;
                DataTable dt = new DataTable();
                da.Fill(dt);
                return dt;


            }
            catch (Exception)
            {
                throw;
            }
        }
        public DataTable BuscarDosagem(Vacina objeto)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "SELECT dose FROM vacina WHERE fabricante='" + objeto.Fabricante + "'";
                sql = new MySqlCommand(sqlStr, conexao.con);
                MySqlDataAdapter da = new MySqlDataAdapter();
                da.SelectCommand = sql;
                DataTable dt = new DataTable();
                da.Fill(dt);
                return dt;

            }
            catch (Exception)
            {
                throw;
            }
        }

        public DataTable BuscarIdVacina(Vacina objeto)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "SELECT id FROM vacina WHERE fabricante='" + objeto.Fabricante + "'";
                sql = new MySqlCommand(sqlStr, conexao.con);
                MySqlDataAdapter da = new MySqlDataAdapter();
                da.SelectCommand = sql;
                DataTable dt = new DataTable();
                da.Fill(dt);
                return dt;

            }
            catch (Exception)
            {
                throw;
            }
        }

    }
}
