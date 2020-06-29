package correcao;
public class Livro extends Produto {
    
    private String autor;
    private int paginas;

    public Livro(String autor, int paginas, String nome, double preco, String status) {
        super(nome, preco, status);
        this.autor = autor;
        this.paginas = paginas;
    }
    
	protected void getLivro()
    {
        System.out.println("Nome         : " + super.getNome() );
        System.out.println("Autor        : " + this.autor );
        System.out.println("Qtde de Pags : " + this.paginas );
        System.out.printf("Preço        : R$ %.2f\n" , super.getPreco() );
        System.out.println("Status       : " + super.getStatus() + "\n" );
    }
    
}
