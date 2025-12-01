package IntroducaoMetodos.Dominio;

public class ExercicioBiblioteca {
    public String nome;
    public String autor;
    public int ano;
    public double preco;

    public ExercicioBiblioteca (String nome, String autor, int ano, double preco){
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
    }

    public void ExibirInfo (){
        System.out.println("Nome do livro: " + nome);
        System.out.println("Autor do livro: " + autor);
        System.out.println("Ano de publicação do livro: " + ano);
        System.out.println("Valor do livro: " + preco);
    }

    public void verificarValor(){
        if (preco >= 50){
            System.out.println("O livro " + nome + " é caro!");
        }else{
            System.out.println("O livro " + nome + " é barato!");
        }
    }

    public void mostrarCaros (){
        if (preco >= 50){
            ExibirInfo();
            verificarValor();
        }
    }

    public void mostrarBaratos(){
        if (preco < 50){
            ExibirInfo();
            verificarValor();
        }
    }
}
