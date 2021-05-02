import java.util.HashMap;
import java.util.Map;

public class NucleotideCounter {

  private final Map<Character, Integer> m = new HashMap<>(Map.of('A', 0, 'C', 0, 'G', 0, 'T', 0));

  public NucleotideCounter(String dna) {
    for (int i = 0; i < dna.length(); i++) {
      if (!isValidDnaBaseChar(dna.charAt(i))) {
        throw new IllegalArgumentException("bad char: " + dna.charAt(i));
      }
      Integer counter = m.getOrDefault(dna.charAt(i), 0);
      m.put((Character) dna.charAt(i), counter + 1);
    }
  }

  public Map<Character, Integer> nucleotideCounts() {
    return m;
  }

  private boolean isValidDnaBaseChar(char base) {
    return base == 'A' || base == 'G' || base == 'C' || base == 'T';
  }
}