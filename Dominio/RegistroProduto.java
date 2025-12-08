package IntroducaoMetodos.Dominio;

public class RegistroProduto {
    private String nome;
    private double preco;
    private int quantidade;

    public RegistroProduto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        if (preco > 0){
            this.preco = preco;
        }else{
            System.out.println("Preço inválido!");
        }
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void listarProdutos(){
        System.out.println("Produto: " + nome);
        System.out.println("R$" + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("-------------------------");
    }

    public void listarProdutosCaros(){
        if (preco > 50) {
            listarProdutos();
        }
    }

    public boolean procurarProduto (String nomeProduto){
        return this.nome.equalsIgnoreCase(nomeProduto);
    }

    public boolean procurarProdutoPreco (String nomePreco){
        return this.nome.equalsIgnoreCase(nomePreco);
    }

    public void alterarPreco (double novoPreco){
        this.preco = novoPreco;
    }
}