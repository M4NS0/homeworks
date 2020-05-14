/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author japa
 */
public class Mestres extends Pessoas {
    private String materia;

    public Mestres(String materia, String nome, int idade) {
        super(nome, idade);
        this.materia = materia;
    }
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
