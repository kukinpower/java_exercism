import java.util.stream.IntStream;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        char[] chars = stringToVerify
            .replaceAll("-", "")
            .toCharArray();

        if (chars.length == 10) {
            int[] multipliers = IntStream.iterate(10, i -> i - 1)
                .limit(10)
                .toArray();

            try {
                return IntStream.rangeClosed(0, 9)
                    .map(i -> {
                        if (chars[i] == 'X' && i == 9) {
                            return multipliers[i] * 10;
                        }
                        return multipliers[i] * Integer.parseInt(String.valueOf(chars[i]));
                    })
                    .sum() % 11 == 0;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }

}
