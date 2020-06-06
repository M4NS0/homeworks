/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corrigido;

import java.util.Scanner;

/**
 *
 * @author anibal.jukemura
 */
public class Projeto01 {

    public static final int IDINICIAL = 1000;
    public static final double MEIA = 10.00;
    public static final double NORMAL = 20.00;
    
    public static void menu(String nome)
    {
        System.out.println("\n\nCinema: " + nome);
        System.out.println("---------------------------");
        System.out.println("- [1]-Vende Ingresso      -");
        System.out.println("- [2]-Ver Saldo           -");
        System.out.println("- [0]-Sair                -");
        System.out.println("---------------------------");
        System.out.print("Opção: ");
    }

    public static void imprimeSaldo(Cinema cine)
    {
        System.out.println("\n\nCinema: " + cine.getNome());
        System.out.println("------------------------------");
        System.out.println("- Qtde de Ingressos: [" + cine.getQuantidade() + "]");
        System.out.println("- Vendidos/Total (R$):              ");
        System.out.println("- Meia  : [" + cine.calcula(MEIA) + "] - R$ " + cine.calcula(MEIA)*MEIA );
        System.out.println("- Normal: [" + cine.calcula(NORMAL) + "] - R$ " +cine.calcula(NORMAL)*NORMAL );
        System.out.println("------------------------------");
    }
   
    public static void vender(Cinema cine, int ID)
    {
        Scanner in = new Scanner (System.in);
        String opcao;
        if (cine.getQuantidade()!=0)
        {
            System.out.print("Meia [M] ou Normal [N]? Opção:  ");
            opcao=in.next();
            if (opcao.equals("M") || opcao.equals("m"))
            {
                Ingresso e = new Meia();
                e.setId(ID);
                e.setValor(MEIA);
                cine.venderIngresso(e);
            }
            else if (opcao.equals("N") || opcao.equals("n"))
            {
                Ingresso e = new Normal();                
                e.setId(ID);
                e.setValor(NORMAL);
                cine.venderIngresso(e);
            }
            
        }
        else
            System.out.println("Ingressos esgotados!");
    }
    
    
    public static void main(String[] args) {
        Cinema cine = new Cinema ("Jupiter",20);
        Scanner in = new Scanner(System.in);
        int opcao=-1;
        int primeiro = IDINICIAL;
        while (opcao!=0)
        {
            menu(cine.getNome());
            opcao=in.nextInt();
            switch (opcao)
            {
                case 1: vender(cine,primeiro);
                    break;
                case 2: imprimeSaldo(cine);
                    break;
            }
            primeiro++;
        }
    }
    
} 
