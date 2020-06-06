/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corrigido;

/**
 *
 * @author anibal.jukemura
 */
public abstract class Ingresso {
    private int Id;
    private double Valor;
    
    public  int getId() {
        return Id;
    }

    public  void setId(int Id) {
        this.Id = Id;
    }

    public  double getValor() {
        return Valor;
    }

    public  void setValor(double Valor) {
        this.Valor = Valor;
    }
    
    
    
}
