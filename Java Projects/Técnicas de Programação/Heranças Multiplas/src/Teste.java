/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author japa
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RadioRelogio philips = new RadioRelogio(98.1, "12:00h");
        
        System.out.println("Informações do Radio Relogio:");
        System.out.println("Emissora: " + philips.getEmissora());
        System.out.println("Hora: " + philips.getHora());
        System.out.println("Ajustando Radio Relogio");
        philips.setHora("14:00h");
        philips.setEmissora(99.5);
        System.out.println("Informações do Radio Relógio:");
        System.out.println("Emissora: " + philips.getEmissora());
        System.out.println("Hora: " + philips.getHora());                
                
        
        
    }
    
}
