import java.util.Arrays;

class LuhnValidator {

    boolean isValid(String candidate) {
        String str = candidate.replaceAll(" ", "");
        if (str.length() > 1 && str.matches("\\d+")) {
            int[] ints = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();

            for (int i = ints.length - 2; i >= 0; i -= 2) {
                int res = ints[i] + ints[i];
                ints[i] = res > 9 ? res - 9 : res;
            }

            return Arrays.stream(ints).sum() % 10 == 0;
        }
        return false;
    }

}
