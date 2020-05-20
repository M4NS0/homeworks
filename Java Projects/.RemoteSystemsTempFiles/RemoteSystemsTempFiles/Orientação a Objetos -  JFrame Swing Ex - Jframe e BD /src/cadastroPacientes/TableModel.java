/**
 *
 * Classe de construção do modelo da tabela de apresentação dos dados
 * 
 * @author barcelosluan
 */

package cadastroPacientes;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel{
    
    private ArrayList linhas = null;
    private String [] colunas = null;
    
    public TableModel(ArrayList l, String[] c) {
        this.linhas = l;
        this.colunas = c;
    }
    
    public ArrayList getLinhas() {
        return linhas;
    }
    
    public String[] getColunas() {
        return colunas;
    }
    
    // Retorna o tamanho das linhas
    public int getRowCount() {
        return linhas.size();
    }
    
    // Retorna o tamanho das colunas
    public int getColumnCount() {
        return colunas.length;
    }
    
    // Nomeia as Colunas na tabela
    @Override
    public String getColumnName(int numCol) {
        return colunas[numCol];
    }

    // Retornas os dados na tabela
    public Object getValueAt(int numLinhas, int numColunas) {

        Object[] linha = (Object[]) getLinhas().get(numLinhas);

        return linha[numColunas];
    }
    
}
