package servicos;

import model.ObjFuncionario;

public class Fabrica {
    public static ObjFuncionario getFuncionario() {
        return new ObjFuncionario();
    }
}
