class DifferenceOfSquaresCalculator {

  int computeSquareOfSumTo(int input) {
    int res = input * (input + 1) / 2;
    return res * res;
  }

  int computeSumOfSquaresTo(int input) {
    return input * (input + 1) * (2 * input + 1) / 6;
  }

  int computeDifferenceOfSquares(int input) {
    return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
  }

}
