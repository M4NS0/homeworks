package servicos;

import models.*;

public class Fabrica {
    public static Carro getCarro() {
        return new Carro();
    }
    public static Cliente getCliente() {
        return new Cliente( );
    }
    public static Vendedor getVendedor() {
        return new Vendedor();
    }
    public static Motorista getMotorista() {
        return new Motorista();
    }
    public static Patio getPatio() {
        return new Patio();
    }

}
