package IntroducaoMetodos.Teste;
import java.util.Scanner;

import IntroducaoMetodos.Dominio.Metodo;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int num2 = sc.nextInt();

        Metodo multiplicacao = new Metodo();

        System.out.println("------------------");
        multiplicacao.multiplicarDoisNumeros(num1, num2);

        sc.close();
    }
}
