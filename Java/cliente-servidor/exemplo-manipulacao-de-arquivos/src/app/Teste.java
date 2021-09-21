package app;

import java.io.*;

public class Teste {

    public static void main(String[] args) {
        String arquivo = "src/assets/PessoaFisica.csv";
        System.out.println(new File(arquivo).getAbsolutePath());

        try {
            FileReader arq = new FileReader(arquivo);
            BufferedReader leitor = new BufferedReader(arq);
            String linha = leitor.readLine();

            do {
                System.out.println(linha);
                linha = leitor.readLine();
            } while (linha != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
