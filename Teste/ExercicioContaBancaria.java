package IntroducaoMetodos.Teste;
import java.util.Scanner;

import IntroducaoMetodos.Dominio.ContaBancaria;

public class ExercicioContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ExercicioContaBancaria c = new ExercicioContaBancaria();

        System.out.println("Quantas contas deseja cadastrar?");
        int quantCont = sc.nextInt();

        ContaBancaria[] contaBancarias = new ContaBancaria[quantCont];

        for (int i = 0; i < contaBancarias.length; i++) {
            System.out.println("Digite o número da " + (i+1) + "º Conta");
            int numeroConta = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o nome do titular da conta " + (i+1));
            String titular = sc.nextLine();

            System.out.println("Digite o saldo da conta");
            int saldo = sc.nextInt();
            sc.nextLine();

            contaBancarias[i] = new ContaBancaria(numeroConta, titular, saldo);
        }

        for (int i = 0; i < contaBancarias.length; i++) {
            contaBancarias[i].mostrarConta();
        }

        sc.close();
    }
}
