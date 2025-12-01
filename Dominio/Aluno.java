package IntroducaoMetodos.Dominio;

public class Aluno {

    public String nome;
    public int idade;
    public String curso;

    public Aluno (String nome, int idade, String curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("-------------------");
    }

    public void calcularIdade(){
        System.out.println("Ano de nascimento: " + (2025 - idade));
    }
}
