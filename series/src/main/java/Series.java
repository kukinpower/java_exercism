import java.util.ArrayList;
import java.util.List;

public class Series {
  String num;

  public Series(String num) {
    this.num = num;
  }

  public List<String> slices(int n) {
    if (n > num.length()) {
      throw new IllegalArgumentException("Slice size is too big.");
    }
    if (n <= 0) {
      throw new IllegalArgumentException("Slice size is too small.");
    }

    List<String> list = new ArrayList<>();

    for (int i = 0; i < num.length() - (n - 1); i++) {
      list.add(num.substring(i, i + n));
    }

    return list;

  }


}
