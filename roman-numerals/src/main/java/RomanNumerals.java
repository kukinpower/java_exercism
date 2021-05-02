class RomanNumeral {
  private final String[] romanNumeric = 
      {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", 
          "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C", "CC",
          "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM", "M", "MM", "MMM",
          "MMMM", "MMMMM", "MMMMMM", "MMMMMMM", "MMMMMMMM", "MMMMMMMMM"};
  private int numeral;

  public RomanNumeral(int numeral) {
    this.numeral = numeral;
  }

  public String getRomanNumeral() {
    StringBuilder romanNumericsString = new StringBuilder();
    if (numeral >= 1000)
    {
      romanNumericsString.append(romanNumeric[(int) (Math.floor(numeral / 1000) - 4 + 30)]);
      numeral %= 1000;
    }
    if (numeral >= 100)
    {
      romanNumericsString.append(romanNumeric[(int) (Math.floor(numeral / 100) - 3 + 20)]);
      numeral %= 100;
    }
    if (numeral >= 10)
    {
      romanNumericsString.append(romanNumeric[(int) (Math.floor(numeral / 10) - 2 + 10)]);
      numeral %= 10;
    }
    if (numeral >= 1)
      romanNumericsString.append(romanNumeric[numeral - 1]);
    return romanNumericsString.toString();
  }
}
