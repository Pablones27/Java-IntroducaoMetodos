package IntroducaoMetodos.Teste; 
import java.util.Scanner;

import IntroducaoMetodos.Dominio.Aluno;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o curso do aluno: ");
        String curso = sc.nextLine();

        System.out.println("----------------------------");

        Aluno aluno = new Aluno(nome, idade, curso);

        aluno.exibirInfo();
        aluno.calcularIdade();

        sc.close();
    }
}