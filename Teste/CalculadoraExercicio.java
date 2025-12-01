package IntroducaoMetodos.Teste;
import java.util.Scanner;

import IntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("\n-------/Função/------");
        System.out.println("Se deseja somar digite 1");
        System.out.println("Se deseja subtrair digite 2");
        System.out.println("Se deseja multiplicar digite 3");
        System.out.println("Se deseja dividir digite 4");
        int r = sc.nextInt();

        Calculadora calc = new Calculadora(num1, num2);

        if (r == 1){
            System.out.println("Resultado: " + calc.somarDoisNumeros());
        }else if (r == 2){
            System.out.println("Resultado: " + calc.subtrairDoisNumeros());
        }else if (r == 3){
            System.out.println("Resultado: " + calc.multiplicarDoisNumeros());
        }else if (r == 4){
            System.out.println("Resultado: " + calc.dividirDoisNumeros());
        }else{
            System.out.println("Opção inválida");
        }

        sc.close();
    }
}