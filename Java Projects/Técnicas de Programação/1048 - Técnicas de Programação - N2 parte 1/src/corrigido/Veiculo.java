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
public abstract class Veiculo {
    private String Tipo;
    private String Motor;

    public Veiculo(String Tipo, String Motor) {
        this.Tipo = Tipo;
        this.Motor = Motor;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getMotor() {
        return Motor;
    }
    
    
    
    
}
