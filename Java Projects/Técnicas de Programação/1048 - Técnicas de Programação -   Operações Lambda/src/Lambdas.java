/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.NoSuchElementException;
import java.util.stream.IntStream;

/**
 *
 * @author japa
 */
public class Lambdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] valores = {3,10,6,1,4,8,2,5,2,7};
       
      /* for (int i=0;i<valores.length;i++)
            System.out.printf("%d ", valores[i]);
        System.out.println(""); */
      
      IntStream.of(valores).forEach(valor->System.out.printf("%d ", valor));
      System.out.println("");
      System.out.printf("Quantidade de elementos: %d\n", IntStream.of(valores).count());
      System.out.printf("Min: %d\n", IntStream.of(valores).min().getAsInt());
      System.out.printf("Max: %d\n", IntStream.of(valores).max().getAsInt());
      System.out.println("Soma dos elementos: " + IntStream.of(valores).sum());
      System.out.println("Média dos elentos : " + IntStream.of(valores).average().getAsDouble());
      System.out.printf("Soma dos quadrados via reduce: %d\n", IntStream.of(valores).reduce(0,(x,y)->x+y*y));
      System.out.println("Produto dos elementos via reduce: " + IntStream.of(valores).reduce(1,(x,y)->x*y));
      
      //valores impares multiplicados por 10 e exiba-os em ordem crescente.
      IntStream.of(valores).filter(valor->valor%2!=0).map(valor->valor*10).sorted().forEach(valor->System.out.printf("%d ", valor));
      System.out.println("");
      
      System.out.println("Soma dos inteiros de 1 a 9: " + IntStream.range(1, 10).sum());
      System.out.println("Soma dos inteiros de 1 a 10: " + IntStream.rangeClosed(1, 10).sum());
      System.out.printf("Primeiro: %d\n", IntStream.of(valores).findFirst().getAsInt());
      
      try
      {
          System.out.println("\n Num -1: " + IntStream.of(valores).filter(valor->valor==-1).findAny().getAsInt());
      }
      catch (NoSuchElementException e)
      {
          System.err.println("Valor -1 inexistente."); 
      }
      
    }
    
}
