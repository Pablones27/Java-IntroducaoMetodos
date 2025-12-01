package IntroducaoMetodos.Dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario;

    public Funcionario (String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void exibirInfo3(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
    }
}
