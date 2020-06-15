package radioRelogio;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author japa
 */
public class RadioRelogio implements Radio, Relogio {
    protected double emissora;
    protected String hora;

    public RadioRelogio(double emissora, String hora) {
        this.emissora = emissora;
        this.hora = hora;
    }
    
    @Override
    public void setEmissora(double emissora) {
        this.emissora=emissora;
    }

    @Override
    public double getEmissora() {
        return this.emissora;
    }

    @Override
    public void setHora(String hora) {
        this.hora=hora;
    }

    @Override
    public String getHora() {
        return this.hora;
    }
    
}
