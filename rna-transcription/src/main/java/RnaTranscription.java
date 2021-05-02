import java.util.Map;

class RnaTranscription {

    private final Map<Character, Character> m = Map.of('G', 'C', 'C', 'G', 'T', 'A', 'A', 'U');

    String transcribe(String dnaStrand) {
        if (dnaStrand.length() == 1) {
            return m.get(dnaStrand.charAt(0)).toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            stringBuilder.append(m.get(dnaStrand.charAt(i)));
        }
        return stringBuilder.toString();
    }

}
