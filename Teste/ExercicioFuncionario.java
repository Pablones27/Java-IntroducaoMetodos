package IntroducaoMetodos.Teste;
import java.util.Scanner;

import IntroducaoMetodos.Dominio.Funcionario;

public class ExercicioFuncionario {
    public double calcularMedia(Funcionario[] funcionarios, int quantfun){
        double soma = 0;

        for (int i = 0; i < funcionarios.length; i++) {
            soma += funcionarios[i].salario;
        }

        double result = soma / quantfun;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ExercicioFuncionario r = new ExercicioFuncionario();

        System.out.println("Quantos funcionários deseja cadastrar? ");
        int quantfun = sc.nextInt();
        sc.nextLine();
        
        Funcionario[] funcionarios = new Funcionario[quantfun];
        
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("\n------/Dados " + (i+1) + "º funcionário/------");

            System.out.println("Digite o nome do " + (i+1) + "º funcionário: ");
            String nome = sc.nextLine();

            System.out.println("Digite a idade do " + (i+1) + "º funcionário: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o salário do " + (i+1) + "º funcionário: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            funcionarios[i] = new Funcionario(nome, idade, salario);
        }

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("\n--------------/Dados " + (i+1) + "º funcionário/---------");

            funcionarios[i].exibirInfo3();
        }

        System.out.println("A média dos salários dos " + quantfun + " funcionários é igual a: " + r.calcularMedia(funcionarios, quantfun));

        sc.close();
    }
}