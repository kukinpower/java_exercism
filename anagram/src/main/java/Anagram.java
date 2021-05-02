import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Anagram {
    private final String anagram;
    private char[] arr;


    public Anagram(String str) {
        anagram = new String(str);
        arr = anagram.toLowerCase().toCharArray();
        Arrays.sort(arr);

    }

    private boolean areEqual(char[] compareArr) {
        Arrays.sort(compareArr);
        return Arrays.equals(compareArr, arr);
    }

    public List<String> match(List<String> lst) {
        List<String> ret = new LinkedList<>();
        for (String str : lst) {
            if (str.length() == anagram.length() &&
                    !anagram.toLowerCase().equals(str.toLowerCase()) &&
                    areEqual(str.toLowerCase().toCharArray())) {
                ret.add(str);
            }
        }
        return ret;
    }
}
