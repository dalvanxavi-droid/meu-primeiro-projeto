import java.util.Scanner; // Aqui é onde chamo a ferramenta que irá permitir que o usuário escreva.

public class caixasupermercado { // Aqui é o arquivo onde é armazenado todo o programa.
    public static void main(String[] args) { // É onde o programa vai começar a rodar.
        Scanner caixa = new Scanner(System.in); // Atribuir um nome para meu usuário e pedir para o algoritmo ler do
                                                // teclado.
        double valorItem = 0.0; // Variável representada por "double" por se tratar de numeros reais. Onde serão
                                // atribuidos os valores dos itens digitados pelo usuario.
        int itens = 0; // contador, representada por "int" pois trata-se de numeros inteiros. Essa
                       // variével irá corresponder a quantidade de valores de item inseridos pelo
                       // usuário.
        double valorTotalItens = 0.0;// Variável representada por "double" por se tratar de numeros reais. Variável
                                     // responsavel pela soma do total de itens inseridos no programa.

        System.out.println("Digite o valor de cada item. Digite 0 Para Encerrar."); // Mostrar na tela o que o usuário
                                                                                    // precisará digitar e as
                                                                                    // alternativas.

        valorItem = caixa.nextDouble();// Lê o primeiro valor antes do while, porque o while precisa testar o valorItem
                                       // logo de cara, e ele precisa ter um valor pra isso,
                                       // o programa não trava, mas quando finalizar vai dar "VALOR INVALIDO".
        while (valorItem != 0.0) { // Início do laço. Enquanto o valor do item for diferente de 0.0 repete o laço.
            if (valorItem > 0.0) {// Aqui é, praticamente, se o valor do item for maior que 0.0 vai pra próxima
                                  // linha, se não, pula pro "else".
                valorTotalItens += valorItem; // Todos os valores dos itens são somados e armazenados na variável
                                              // "valorTotalItens", aqui ocorre a mudança no laço.
                itens++; // Soma sempre de um por um, ou seja, vai pedir o próximo item até chegar no
                         // comando fara fechar o laço.
            }

            valorItem = caixa.nextDouble(); // Como se trata de um loop, o sistema vai lê o próximo valor digitado pelo
                                            // usuário para o while testar na próxima volta. Sem essa linha o loop
                                            // repetiria o mesmo valor pra sempre".
        }
        if (itens == 0) { // Se não houver itens e finalizar o programa, irá aparecer na tela a mensagm da
                          // linha 38.

            System.out.println("Nenhum item registrado!"); // Mensagem mostrada no caso de não haver items e o programa
                                                           // ser finalizado.
        }
        if (itens > 0) { // Sendo digitado a partir de 1 item o programa avança para as próximas linhas.

            System.out.println("Quantidade de itens: " + itens); // O programa irá pedir ao usuário o valor dos itens, a
                                                                 // quantidade de valores inseridos será a quantidade de
                                                                 // itens da compra.
            System.out.println("Soma total de itens: " + valorTotalItens); // Aqui é o resultado da linha 16, o valor
                                                                           // armazenado na variávlel "valorTotalItens"
                                                                           // aparece aqui.

        } 
    }
}
