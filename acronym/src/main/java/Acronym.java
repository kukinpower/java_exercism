import java.util.Arrays;
import java.util.Locale;

class Acronym {

    String acronym;

    Acronym(String phrase) {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(phrase.split("[^a-zA-Z']"))
            .filter(a -> !a.isEmpty())
            .forEach(a -> stringBuilder.append(a.charAt(0)));
        acronym = stringBuilder.toString().toUpperCase(Locale.ROOT);
    }

    String get() {
        return acronym;
    }
}
