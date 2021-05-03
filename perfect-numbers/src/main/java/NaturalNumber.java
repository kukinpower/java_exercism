class NaturalNumber {

  private final int num;
  private final int sum;

  public NaturalNumber(int num) {
    if (num <= 0) {
      throw new IllegalArgumentException("You must supply a natural number (positive integer)");
    }
    this.num = num;
    this.sum = calculateSumOfDivisors(num);
  }

  private static int calculateSumOfDivisors(int num) {
    int sum = 0;

    for (int i = 1; i < Math.sqrt(num); i++) {
      if (num % i == 0) {
        if (num / i == i) {
          sum += i;
        } else {
          sum += i;
          sum += num / i;
        }
      }
    }

    return sum - num;
  }

  public Classification getClassification() {
    if (sum == num) {
      return Classification.PERFECT;
    } else if (sum > num) {
      return Classification.ABUNDANT;
    } else {
      return Classification.DEFICIENT;
    }
  }

}
