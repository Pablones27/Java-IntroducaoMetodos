package IntroducaoMetodos.Dominio;

public class Aluno2 {
    public String nome;
    public String curso;
    public int idade;
    public double nota;

    public Aluno2 (String nome, String curso, int idade, double nota){
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.nota = nota;
    }

    public void exibirInfo2(){
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
    }

    public void verificarAprovação(){
        if(nota >= 7){
            System.out.println("Aluno aprovado com média: " + nota);
        }else{
            System.out.println("Aluno reprovado com a média: " + nota);
        }
    }
}
