import java.util.Scanner;

public class CaixaRapido {
    public static void main(String[] args) {
        Scanner caixa = new Scanner(System.in);
        double ValorTotalCompra = 0.0;
        int opcao = 0;
        while (opcao != 2) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar Item");
            System.out.println("2. Fechar Conta e Sair");
            System.out.print("Escolha uma opção: ");
            opcao = caixa.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o Nome do Produto:");
                String nome = caixa.next();
                System.out.println("O seu produto é: " + nome);

                System.out.println("Preço do Produto");
                Double preco = caixa.nextDouble();
                System.out.println("O preço é: " + preco);
                System.out.println("Quantidade de Produtos:");
                int quantidade = caixa.nextInt();
                System.out.println("A quantidade é: " + quantidade);
                ValorTotalCompra += (preco * quantidade);
            }

            if (opcao == 2) {
                System.out.println("O valor total das suas compras é, exatamente: " + ValorTotalCompra);

            }
        }
    }
}
