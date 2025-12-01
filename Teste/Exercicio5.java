package IntroducaoMetodos.Teste;
import java.util.Scanner;

import IntroducaoMetodos.Dominio.Aluno2;

public class Exercicio5 {

    public void mostrarAprovados(Aluno2[] alunos){
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i].nota >= 7){
                alunos[i].exibirInfo2();
                alunos[i].verificarAprovação();
            }
        }
    }

    public void mostrarReprovados(Aluno2[] alunos){
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i].nota < 7){
                alunos[i].exibirInfo2();
                alunos[i].verificarAprovação();
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos deseja registrar? ");
        int n = sc.nextInt();
        sc.nextLine();

        Aluno2[] alunos = new Aluno2[n];

        Exercicio5 ex = new Exercicio5();

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("\n-----/Coleta de dados " + (i+1) + "º aluno/------");

            System.out.println("Digite o nome do " + (i+1) + "º aluno: ");
            String nome = sc.nextLine();

            System.out.println("Digite o curso do " + (i+1) + "º aluno: ");
            String curso = sc.nextLine();

            System.out.println("Digite a idade do " + (i+1) + "º aluno: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite a nota do " + (i+1) + "º aluno: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            alunos[i] = new Aluno2(nome, curso, idade, nota);
        }

        System.out.println("Se deseja ver todos os alunos digite 1, se deseja ver apenas os aprovados digite 2, se apenas os reprovados digite 3: ");
        int r = sc.nextInt();

        if (r == 1) {
            for (int i = 0; i < alunos.length; i++) {
                System.out.println("\n------/Dados " + (i+1) + "º aluno/------");
                    alunos[i].exibirInfo2();
                    alunos[i].verificarAprovação();
            }
        }else if (r == 2){
            ex.mostrarAprovados(alunos);
        }else if (r == 3) {
            ex.mostrarReprovados(alunos);
        }else {
            System.out.println("Opção inválida");
        }
            sc.close();
    }
}