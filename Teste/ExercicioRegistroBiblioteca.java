package IntroducaoMetodos.Teste;
import java.util.Scanner;

import IntroducaoMetodos.Dominio.ExercicioBiblioteca;

public class ExercicioRegistroBiblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos livros deseja cadastrar? ");
        int quantLivro = sc.nextInt();
        sc.nextLine();

        ExercicioBiblioteca[] livrosRegistrados = new ExercicioBiblioteca[quantLivro];

        for (int i = 0; i < livrosRegistrados.length; i++) {
            System.out.println("Digite os dados do " + (i+1) + "º livro");
            System.out.println("------------------------");

            System.out.println("Digite o nome do " + (i+1) + "º livro: ");
            String nome = sc.nextLine();

            System.out.println("Digite o nome do autor: ");
            String autor = sc.nextLine();

            System.out.println("Digite o ano de publicação do livro: ");
            int ano = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o valor do livro: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            livrosRegistrados[i] = new ExercicioBiblioteca(nome, autor, ano, preco);
        }

        System.out.println("------- Menu --------");
        System.out.println("[1] Mostrar todos os livros.");
        System.out.println("[2] Mostrar apenas os livros mais caros.");
        System.out.println("[3] Mostrar apenas os livros mais baratos.");
        System.out.println("Digite a sua escolha: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                for (int i = 0; i < livrosRegistrados.length; i++) {
                    livrosRegistrados[i].ExibirInfo();
                    livrosRegistrados[i].verificarValor();
                }
                break;

            case 2:
                for (int i = 0; i < livrosRegistrados.length; i++) {
                    livrosRegistrados[i].mostrarCaros();
                }
                break;

            case 3:
                for (int i = 0; i < livrosRegistrados.length; i++) {
                    livrosRegistrados[i].mostrarBaratos();
                }
                break;
        
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
