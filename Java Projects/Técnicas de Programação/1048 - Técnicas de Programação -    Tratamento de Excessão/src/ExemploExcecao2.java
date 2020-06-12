/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author japa
 */
public class ExemploExcecao2 {

    public static void metodo() throws Exception
    {   int a=1;
        try
        {
            System.out.println("Metodo throwException");
            if (a==0)
              throw new Exception();
        }
       catch (Exception e)
       {
          System.err.println("Excecao gerada no metodo. a=0");
       }
       finally
       {
            System.out.println("Finally sem erros.");
       }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        try
        {
           metodo();
           throw new Exception();          
        } 
       catch (Exception e)
       {
           System.err.println("Erro no programa principal (MAIN).");
           
       }
       finally 
        {
            System.err.println("Executado de qualquer forma.");
        }
    }
    
}
