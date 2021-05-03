import java.util.Locale;
import java.util.stream.Collectors;

public class PangramChecker {

    public boolean isPangram(String input) {
        return input.toLowerCase(Locale.ROOT).chars()
            .boxed()
            .filter(Character::isAlphabetic)
            .collect(Collectors.toMap(
            k -> (char) k.intValue(),
            v -> 1,
            Integer::sum
        )).size() == 26;
    }

}
