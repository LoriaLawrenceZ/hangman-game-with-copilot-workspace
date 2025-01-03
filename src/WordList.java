import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WordList {
    private List<String> words;

    public WordList() {
        this.words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
    }

    public String getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}
