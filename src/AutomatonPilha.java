import java.util.Scanner;
import java.util.Stack;

public class AutomatonPilha {

    public static boolean aceitaLanguage(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '0') {
                stack.push('Z');
            } else if (c == '1') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void predefinidaTeste() {
        String[] entradas = {"", "01", "0011", "000111", "001", "011", "101", "0110", "0101", "000111010"};

        System.out.println("Testando as entradas predefinidas:");
        for (String entre : entradas) {
            boolean aceita = aceitaLanguage(entre);
            System.out.println("Entrada: \"" + entre + "\" - " + (aceita ? "Aceita" : "Rejeitada"));
        }
    }

    public static void testWithScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma cadeia para testar (apenas 0 e 1, ou 'sair' para encerrar):");
        while (true) {
            System.out.print("Entrada: ");
            String entre = scanner.nextLine();

            if (entre.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando os testes.");
                break;
            }

            boolean aceita = aceitaLanguage(entre);
            System.out.println("Entrada: \"" + entre + "\" - " + (aceita ? "Aceita" : "Rejeitada"));
        }

        scanner.close();
    }
}

