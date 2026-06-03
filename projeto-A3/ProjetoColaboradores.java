import java.util.Scanner;
import java.util.ArrayList;

public class ProjetoColaboradores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // As listas para armazenar os dados
        ArrayList<String> listaNomes = new ArrayList<>();
        ArrayList<Integer> listaIds = new ArrayList<>();
        ArrayList<Double> listaComissoes = new ArrayList<>();
        ArrayList<Integer> listaPecas = new ArrayList<>();
        ArrayList<Double> listaValorPeca = new ArrayList<>();

        // Laço de repetição para cadastrar quantos quiser
        int proximoId = 1;
        int opcao = -1;
        // Enquanto a opção não for 0, o menu reaparece
        while (opcao != 0) {
            System.out.println("\n--- CADASTRO DE COLABORADORES ---");
            System.out.println("1 - Cadastrar Colaborador Padrão");
            System.out.println("2 - Cadastrar Comissionado");
            System.out.println("3 - Cadastrar Produtor");
            System.out.println("4 - Gerar Folha de Pagamento");
            System.out.println("0 - Finalizar Cadastro");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine(); // Limpa o "Enter" do teclado

            switch (opcao) {
                case 1:
                    System.out.println("Iniciando Etapa 1...");

                    String continuar = "s";
                    while (continuar.equalsIgnoreCase("s")) {

                        System.out.println("Digite o nome do colaborador: ");
                        String nome = entrada.nextLine();

                        // O while "prende" o usuário enquanto ele não digitar algo real
                        while (nome.trim().isEmpty()) {
                            System.out.print("Campo obrigatório! Digite o nome: ");
                            nome = entrada.nextLine();
                        }
                        listaNomes.add(nome);
                        listaIds.add(proximoId);
                        listaComissoes.add(0.0);
                        listaPecas.add(0);
                        listaValorPeca.add(0.0);
                        System.out.println("Funcionário Padrão cadastrado com sucesso!");
                        System.out.printf("Funcionário Padrão %s, ID do funcionário: %05d\n", nome, proximoId);
                        System.out.println("Salário base R$ 2.000,00.");
                        proximoId++;
                        System.out.print("Deseja cadastrar outro funcionário? (s/n): ");
                        continuar = entrada.nextLine();
                        System.out.println("---------------------------");
                    }
                    System.out.println("=== SISTEMA DE GESTÃO RH ===");

                    break;
                case 2:
                    System.out.println("Iniciando Etapa 2...");
                    System.out.println("Digite o nome do funcionario comissionado: ");
                    String nomeC = entrada.nextLine();
                    while (nomeC.trim().isEmpty()) {
                        System.out.print("Campo obrigatório! Digite o nome: ");
                        nomeC = entrada.nextLine();

                    }

                    double comissao = 0;
                    try {
                        System.out.print("Digite o valor da comissão: ");
                        comissao = Double.parseDouble(entrada.nextLine());
                        listaComissoes.add(comissao);
                    } catch (Exception e) {
                        System.out.println("Valor inválido! Digite uma informação válida");
                        comissao = 0;
                    }
                    listaNomes.add(nomeC);
                    listaIds.add(proximoId);
                    listaComissoes.add(comissao);
                    listaPecas.add(0);
                    listaValorPeca.add(0.0);
                    System.out.println("Funcionário Comissionado cadastrado com sucesso!");
                    System.out.printf("Funcionário de Produção %s, ID do funcionário: %05d\n", nomeC, proximoId);

                    proximoId++;
                    break;

                case 3:
                    System.out.println("Iniciando Etapa 3...");
                    System.out.println("Digite o nome do funcionario de produção: ");
                    String nomeP = entrada.nextLine();
                    while (nomeP.trim().isEmpty()) {
                        System.out.println("Campo obrigatório! Digite o nome: ");
                        nomeP = entrada.nextLine();

                    }
                    int pecas = 0;
                    try {
                        System.out.println("Digite a quantidade de peças: ");
                        pecas = Integer.parseInt(entrada.nextLine());
                    } catch (Exception e) {
                        System.out.println("Valor inválido!");
                        pecas = 0;
                    }
                    double valorPeca = 0;
                    try {
                        System.out.println("Informe valor da peça: R$ ");
                        valorPeca = Double.parseDouble(entrada.nextLine());
                    } catch (Exception e) {
                        System.out.println("Valor inválido! Definido como R$ 0.00");
                        valorPeca = 0;
                    }
                    listaNomes.add(nomeP);
                    listaIds.add(proximoId);
                    listaComissoes.add(0.0);
                    listaPecas.add(pecas);
                    listaValorPeca.add(valorPeca);
                    System.out.println("Funcionário de Produção cadastrado com sucesso!");
                    System.out.printf("Funcionário de Produção %s, ID do funcionário: %05d\n", nomeP, proximoId);

                    proximoId++;
                    break;
                case 4:
                    System.out.print("\033[H\033[2J");
                    System.out.println("--- FOLHA DE PAGAMENTO ---");
                    System.out.println("Total de pessoas cadastradas: " + listaNomes.size());
                    System.out.println("----------------------------------------");
                    for (int i = 0; i < listaNomes.size(); i++) {
                        String nome = listaNomes.get(i);
                        int id = listaIds.get(i);
                        double comissaoAtual = listaComissoes.get(i);
                        int pecasAtual = listaPecas.get(i);
                        double valorPecaAtual = listaValorPeca.get(i);
                        double salarioBase = 2000.0;
                        double extras = 0.0;
                        double salarioFinal = 0.0;

                        if (pecasAtual > 0) {

                            extras = pecasAtual * valorPecaAtual;
                            salarioFinal = salarioBase + extras;

                        } else if (comissaoAtual > 0 && pecasAtual == 0) {

                            extras = comissaoAtual;
                            salarioFinal = salarioBase + extras;

                        } else {

                            extras = 0.0;
                            salarioFinal = salarioBase;
                        }
                        System.out.printf("Nome: %s\n", nome);
                        System.out.printf("Matrícula: %05d\n", id);
                        System.out.printf("Salário Fixo: %.2f\n", salarioBase);
                        System.out.printf("Extras/Comissão: %.2f\n", extras);
                        System.out.printf("Salário final: %.2f\n", salarioFinal);
                        System.out.println("----------------------------------------");
                    }

                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        // Exibição simples apenas para conferir se guardou
        if (!listaNomes.isEmpty()) {
            System.out.println("\nResumo do Cadastro:");
            for (int i = 0; i < listaNomes.size(); i++) {
                System.out.println("Funcionario: " + listaNomes.get(i) + " | Matrícula: " + listaIds.get(i));
            }
        }
        System.out.println("Sucesso!");
        entrada.close();
    }
}
