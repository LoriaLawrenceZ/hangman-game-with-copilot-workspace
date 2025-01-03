import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Game {
    private String word;
    private Set<Character> guessedLetters;
    private int remainingAttempts;

    public Game() {
        WordList wordList = new WordList();
        this.word = wordList.getRandomWord();
        this.guessedLetters = new HashSet<>();
        this.remainingAttempts = 6;
    }

    public void start() {
        Player player = new Player();
        while (remainingAttempts > 0 && !isWordGuessed()) {
            displayGameState();
            char guess = player.getGuess();
            if (guessedLetters.contains(guess)) {
                System.out.println("Você já adivinhou essa letra. Tente novamente.");
            } else {
                guessedLetters.add(guess);
                if (!word.contains(String.valueOf(guess))) {
                    remainingAttempts--;
                }
            }
        }
        displayGameState();
        if (isWordGuessed()) {
            System.out.println("Parabéns! Você adivinhou a palavra.");
        } else {
            System.out.println("Fim de jogo! A palavra era: " + word);
        }
    }

    private void displayGameState() {
        StringBuilder displayWord = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (guessedLetters.contains(c)) {
                displayWord.append(c);
            } else {
                displayWord.append('_');
            }
            displayWord.append(' ');
        }
        System.out.println("Palavra: " + displayWord.toString().trim());
        System.out.println("Tentativas restantes: " + remainingAttempts);
    }

    private boolean isWordGuessed() {
        for (char c : word.toCharArray()) {
            if (!guessedLetters.contains(c)) {
                return false;
            }
        }
        return true;
    }
}
