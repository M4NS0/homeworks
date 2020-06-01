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
public class Bicicleta extends Veiculo implements EmissaoCO2 {
    private double Quilometragem;
    private double indice;

    public Bicicleta(String Tipo, String Motor, double Quilometragem, double indice ) {
        super(Tipo, Motor);
        this.Quilometragem = Quilometragem;
        this.indice = indice;
    }

    public double getQuilometragem()
    {
        return Quilometragem;
    }    
    
    @Override
     public double calculaCO2 ()
     {
         return 0.0;
     }

}
