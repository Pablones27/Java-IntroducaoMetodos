package IntroducaoMetodos.Teste;
import java.util.Scanner;

import IntroducaoMetodos.Dominio.RegistroProduto;

public class ExercicioProduto {
    public static void main(String[] args) {

        int escolha = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos deseja cadastrar?");
        int quantProduto = sc.nextInt();
        sc.nextLine();

        RegistroProduto[] listaProdutos = new RegistroProduto[quantProduto];

        for (int i = 0; i < listaProdutos.length; i++) {
            System.out.println("------ Cadastro de produtos ------");

            System.out.println("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            System.out.println("Digite a quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine();

            listaProdutos[i] = new RegistroProduto(nome, preco, quantidade);
        }

        while (escolha != 5) {
            System.out.println("------ Menu -------");
            System.out.println("[1] Listar todos os produtos");
            System.out.println("[2] Listar produtos acima de R$50");
            System.out.println("[3] Buscar produto pelo nome");
            System.out.println("[4] Atualizar preço");
            System.out.println("[5] Sair");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    for (int i = 0; i < listaProdutos.length; i++) {
                        listaProdutos[i].listarProdutos();
                    }
                    break;
                
                case 2:
                    for (int i = 0; i < listaProdutos.length; i++) {
                        listaProdutos[i].listarProdutosCaros();
                    }
                    break;

                case 3:
                    System.out.println("Digite o produto que deseja pesquisar: ");
                    String nomeProduto = sc.nextLine();

                    boolean achou = false;

                    for (int i = 0; i < listaProdutos.length; i++) {
                        if (listaProdutos[i].procurarProduto(nomeProduto)) {
                            System.out.println("Item encontrado!");

                            listaProdutos[i].listarProdutos();
                            achou = true;

                            break;

                        }
                    }

                    if (!achou) {
                        System.out.println("Produto não encontrado!");

                        break;
                    }

                    break;

                case 4:
                    System.out.println("Qual produto deseja alterar o preço?: ");
                    String nomePreco = sc.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < listaProdutos.length; i++) {
                        if (listaProdutos[i].procurarProdutoPreco(nomePreco)) {
                            System.out.println("Produto encontrado!");
                            System.out.println("-------------------");
                            listaProdutos[i].listarProdutos();
                            System.out.println("Digite o preço atualizado: ");
                            double novoPreco = sc.nextDouble();
                            sc.nextLine();

                            listaProdutos[i].alterarPreco(novoPreco);

                            encontrado = true;

                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado!");

                        break;
                    }

                    break;
                        
                    case 5:
                        System.out.println("Programa sendo encerrado!");
                        escolha = 5;

                        break;

                default:
                    System.out.println("Número inválido!");

                    break;
            }
        }

        sc.close();

    }
}
