public static void main(String[] args) {
    System.out.println("Bem-vindo à recepção do hospital!");
    System.out.println("Por favor, selecione o tipo de atendimento:");
    System.out.println("1. Emergência");
    System.out.println("2. Consulta de Rotina");
    System.out.println("3. Retirada de Exames");

    int escolhaPaciente = new java.util.Scanner(System.in).nextInt();
    switch (escolhaPaciente) {
        case 1:
            System.out.println("Você selecionou Emergência.");
            break;
        case 2:
            System.out.println("Você selecionou Consulta de Rotina.");
            break;
        case 3:
            System.out.println("Você selecionou Retirada de Exames.");
            break;
        default:
            System.out.println("Opção inválida.");
    }
}