import java.util.Arrays;

class LargestSeriesProductCalculator {

  private final int[] numbers;

  LargestSeriesProductCalculator(String inputNumber) {
    if (inputNumber.isEmpty()) {
      this.numbers = new int[0];
    } else if (!inputNumber.matches("\\d+")) {
      throw new IllegalArgumentException("String to search may only contain digits.");
    } else {
      this.numbers = Arrays.stream(inputNumber.split("")).mapToInt(Integer::parseInt).toArray();
    }
  }

  long calculateLargestProductForSeriesLength(int numberOfDigits) {
    if (numberOfDigits == 0) {
      return 1;
    } else if (numberOfDigits > numbers.length) {
      throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
    } else if (numberOfDigits < 0) {
      throw new IllegalArgumentException("Series length must be non-negative.");
    }

    long maxSum = 0;
    for (int i = 0; i < numbers.length - numberOfDigits + 1; i++) {

      long sum = numbers[i];
      for (int j = i + 1, k = 0; k < numberOfDigits - 1; j++, k++) {
        sum *= numbers[j];
      }
      if (maxSum < sum) {
        maxSum = sum;
      }
    }
    return maxSum;
  }
}
