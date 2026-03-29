// Algoritmo para calcular o preço final com taxa fixa

ALGORITMO "Preco_Final"

VAR
   base, taxa, final : REAL

INICIO
   // Define a taxa fixa
   taxa <- 10

   // Entrada de dados
   ESCREVA("Digite o preço base: ")
   LEIA(base)

   // Processamento: soma do preço base com a taxa
   final <- base + taxa

   // Saída
   ESCREVA("O preço final é: ", final)


FIMALGORITMO
