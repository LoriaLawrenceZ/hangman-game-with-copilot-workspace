import java.util.Scanner;

public class Player {
    private Scanner scanner;

    public Player() {
        this.scanner = new Scanner(System.in);
    }

    public char getGuess() {
        System.out.print("Digite uma letra: ");
        String input = scanner.nextLine();
        while (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.print("Entrada inválida. Por favor, digite uma única letra: ");
            input = scanner.nextLine();
        }
        return Character.toLowerCase(input.charAt(0));
    }
}
