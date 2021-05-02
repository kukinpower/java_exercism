import java.util.BitSet;

class IsogramChecker {
    boolean isIsogram(String phrase) {
        BitSet s = new BitSet();
        for (Character c : phrase.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                c = Character.toLowerCase(c);
                if (s.get(c)) {
                    return false;
                }
                s.set(c);
            }
        }
        return true;
    }
}
