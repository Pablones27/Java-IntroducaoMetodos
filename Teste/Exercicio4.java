package IntroducaoMetodos.Teste;
import java.util.Scanner;

import IntroducaoMetodos.Dominio.Aluno;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno[] lista = new Aluno[3];

        for (int i = 0; i < lista.length; i++) {

            System.out.println("----/" + (i+1) + "º Aluno/----");
            
            System.out.println("Digite o nome do " + (i+1) + "º aluno: ");
            String nome = sc.nextLine();

            System.out.println("Digite a idade do " + (i+1) + "º aluno: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o curso do " + (i+1) + "º aluno: ");
            String curso = sc.nextLine();

            lista[i] = new Aluno(nome, idade, curso);
        }

        for (int i = 0; i < lista.length; i++) {
            lista[i].exibirInfo();
        }

        sc.close();
    }
}