/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author japa
 */
public class ExcecaoExemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            int[] numero = new int[5];
            
            for(int i=0;i<=10;i++)
            {
                numero[i]=i;
                System.out.println(i);
            }    
               
        }
        catch(ArrayIndexOutOfBoundsException erro)
        {
            System.err.println("Fora dos limites!" );
            erro.printStackTrace();
        }
              
    }
    
}
