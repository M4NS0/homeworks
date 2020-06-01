/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corrigido;

import java.util.Scanner;


import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author anibal.jukemura
 * @category Casting
 * @implNote Exemplo de como fazer casting *.class.isInstance
 * 
 */
public class JavaApplication43 {

    public static void imprimeDados(List L)
    {
        int i;
        for (i=0; i<L.size();i++)
        {
            if (Carro.class.isInstance(L.get(i)))
            {
                Carro c = (Carro)L.get(i);
                System.out.println((i+1) + " - Carro:");
                System.out.println("Tipo  :" + c.getTipo() );
                System.out.println("Motor :" + c.getMotor() );
                System.out.println("KM    :" + c.getQuilometragem() );
                System.out.println("Emissão de CO2: " + c.calculaCO2() +  " KG/mes");
            }
            else if (Barco.class.isInstance(L.get(i)))
            {
                Barco b = (Barco)L.get(i);
                System.out.println((i+1) + " - Barco:");
                System.out.println("Tipo  :" + b.getTipo() );
                System.out.println("Motor :" + b.getMotor() );
                System.out.println("KM    :" + b.getQuilometragem() );
                System.out.println("Emissão de CO2: " + b.calculaCO2() +  " KG/mes");
            } 
            else if (Bicicleta.class.isInstance(L.get(i)))
            {
                Bicicleta b = (Bicicleta)L.get(i);
                System.out.println((i+1) + " - Bicicleta:");
                System.out.println("Tipo  :" + b.getTipo() );
                System.out.println("Motor :" + b.getMotor() );
                System.out.println("KM    :" + b.getQuilometragem() );
                System.out.println("Emissão de CO2: " + b.calculaCO2() +  " KG/mes");
            }               
        }
    }
            

    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        int n,i;
        String opcao,tipo,motor;
        double quilometragem;
        System.out.println("Quantos veiculos deseja cadastrar?");
        n=ler.nextInt();
        
        List<Veiculo> lista = new ArrayList(n);
        for (i=1;i<=n;i++)
        {
            System.out.print("Selecione (C)arro, (B)arco ou Bicicle(t)a: ");
            opcao=ler.next().toUpperCase();
            switch (opcao)
            {
                case "C": 
                    System.out.println("Forneça o tipo de carro: Gasolina, Diesel, Alcool: ");
                    tipo=ler.next();
                    System.out.println("Forneça o motor do carro: 1.0 ou 1.4: ");
                    motor=ler.next();
                    System.out.println("Forneça a KM do carro: ");
                    quilometragem=ler.nextDouble();
                    Veiculo c = new Carro (tipo,motor,quilometragem,1.24);
                    lista.add(c);
                    break;
                case "B": 
                    System.out.println("Forneça o tipo de Barco: Gasolina, Diesel, Alcool: ");
                    tipo=ler.next();
                    System.out.println("Forneça o motor do carro: 600 ou 800: ");
                    motor=ler.next();
                    System.out.println("Forneça a KM do barco: ");
                    quilometragem=ler.nextDouble();
                    Veiculo b = new Barco (tipo,motor,quilometragem,0.23);
                    lista.add(b);                    
                    break;
                case "T": 
                    System.out.println("Forneça o tipo de biclicleta: Elétrica ou Normal ");
                    tipo=ler.next();
                    System.out.println("Forneça o motor: 50 cc ou 0 cc ");
                    motor=ler.next();
                    System.out.println("Forneça a KM da bicicleta: ");
                    quilometragem=ler.nextDouble();
                    Veiculo t = new Bicicleta (tipo,motor,quilometragem,0.0);
                    lista.add(t);                      
                    break;
            }
            
        }
        
        imprimeDados(lista);
               
        
    }
    
}
