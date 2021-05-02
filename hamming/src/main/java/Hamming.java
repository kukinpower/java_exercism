public class Hamming {
    private final char[] l;
    private final char[] r;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (!leftStrand.isEmpty() && rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        l = leftStrand.toCharArray();
        r = rightStrand.toCharArray();
    }

    public int getHammingDistance() {
        int h = 0;

        for (int i = 0; i < l.length; i++) {
            if (l[i] != r[i]) {
                h++;
            }
        }

        return h;
    }
}
