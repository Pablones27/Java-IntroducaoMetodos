package IntroducaoMetodos.Teste;
import java.util.Scanner;

import IntroducaoMetodos.Dominio.cadastroCarro;

import java.util.ArrayList;

public class exercicioCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<cadastroCarro> lista = new ArrayList<>();

        int escolha = 0;

        while (escolha != 6) {
            System.out.println("--------- Menu ---------");
            System.out.println("[1] Cadastrar veículo");
            System.out.println("[2] Listar todos os veículos");
            System.out.println("[3] Buscar por modelo");
            System.out.println("[4] Listar carros acima de R$150.000");
            System.out.println("[5] Atualizar preço de um carro específico");
            System.out.println("[6] Sair");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Digite a marca do veículo: ");
                    String marca = sc.nextLine();

                    System.out.println("Digite o modelo do veículo: ");
                    String modelo = sc.nextLine();

                    System.out.println("Digite o ano do veículo: ");
                    int ano = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o preço do veículo: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    cadastroCarro cadastro = new cadastroCarro(marca, modelo, ano, preco);
                    lista.add(cadastro);

                    System.out.println("Carro cadastrado com sucesso!");
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum carro cadastrado");
                    }else {
                        for (cadastroCarro carro : lista) {
                            carro.mostrarInfo();
                            System.out.println("------------------");
                        }
                    }

                    break;

                case 3:
                    System.out.println("Digite qual modelo deseja procurar: ");
                    String buscaModelo = sc.nextLine();

                    boolean achado = false;

                    for (cadastroCarro carro : lista) {
                        if (carro.getModelo().equalsIgnoreCase(buscaModelo)) {
                            System.out.println("Modelo encontrado!");
                            carro.mostrarInfo();
                            System.out.println("----------------------");

                            achado = true;
                        }
                    }

                    if (!achado){
                        System.out.println("Modelo não encontrado");
                    }

                    break;

                case 4: 
                    for (cadastroCarro carro : lista){
                        carro.listarCarrosCaros();
                    }
                    
                    break;

                case 5:
                    System.out.println("Digite qual o modelo do carro que deseja alterar o preço: ");
                    String nomeProcura = sc.nextLine();

                    boolean procuraPreco = false;

                    for (cadastroCarro carro : lista){
                        if (carro.getModelo().equalsIgnoreCase(nomeProcura)){
                            System.out.println("Modelo encontrado!");
                            carro.mostrarInfo();
                            System.out.println("---------------");

                            System.out.println("Digite o valor para atualizar: ");
                            double novoPreco = sc.nextDouble();

                            carro.alterarValor(novoPreco);

                            System.out.println("Preço atualizado com sucesso!");

                            procuraPreco = true;
                        }
                    }

                    if (!procuraPreco){
                        System.out.println("Modelo não encontrado!");
                    }

                    break;

                case 6:
                    System.out.println("Encerrando....");

                    break;
            
                default:
                    System.out.println("Valor inválido");

                    break;
            }
        }

        sc.close();
    }
}