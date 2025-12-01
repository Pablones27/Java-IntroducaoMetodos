package IntroducaoMetodos.Teste;
import java.util.Scanner;

import IntroducaoMetodos.Dominio.Metodo;

public class Exercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Metodo calculadora = new Metodo();

        System.out.println("Digite o primeiro número: ");
        calculadora.numero1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        calculadora.numero2 = sc.nextInt();

        calculadora.somaDoisNumeros();

        sc.close();
    }
}
