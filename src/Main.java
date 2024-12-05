import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean proceed = true;

        System.out.println("Bem-vindo ao Autômato de Pilha para L = {0^n1^n | n >= 0}");

        while (proceed) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Realizar testes predefinidos!");
            System.out.println("2 - Inserir e testar a cadeia manualmente!");
            System.out.println("0 - Sair");

            System.out.print("Sua escolha: ");
            int choice;

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Entrada inválida! Digite um número correspondente às opções.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("\nIniciando testes com cadeias predefinidas...");
                    AutomatonPilha.predefinidaTeste();
                    break;
                case 2:
                    System.out.println("\nDigite uma cadeia para testar (apenas 0 e 1):");
                    AutomatonPilha.testWithScanner();
                    break;
                case 0:
                    proceed = false;
                    System.out.println("\nEncerrando o programa. Obrigado por usar o autômato!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Por favor, escolha uma das opções listadas.");
            }
        }

        scanner.close();
    }
}
