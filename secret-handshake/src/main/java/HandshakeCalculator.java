import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

  private static final int REVERSE = 0b10000;

  List<Signal> calculateHandshake(int number) {
    List<Signal> list = new ArrayList<>();

    for (Signal signal : Signal.values()) {
      if ((signal.num() & number) > 0) {
        list.add(signal);
      }
    }

    if ((REVERSE & number) > 0) {
      Collections.reverse(list);
    }

    return list;
  }

}
