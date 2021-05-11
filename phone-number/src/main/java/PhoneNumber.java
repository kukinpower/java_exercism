public class PhoneNumber {
  String digits;

  public PhoneNumber(String number) {
    if (number.matches(".*[a-zA-Z].*")) {
      throw new IllegalArgumentException("letters not permitted");
    }
    if (number.matches(".*[^\\-().+0-9 ].*")) {
      throw new IllegalArgumentException("punctuations not permitted");
    }

    this.digits = number.replaceAll("[^0-9]+", "");
    if (digits.length() < 10) {
      throw new IllegalArgumentException("incorrect number of digits");
    }
    if (digits.length() == 11 && digits.charAt(0) != '1') {
      throw new IllegalArgumentException("11 digits must start with 1");
    }
    if (digits.length() > 11) {
      throw new IllegalArgumentException("more than 11 digits");
    }
    if (digits.length() == 10 && digits.charAt(0) == '0' || digits.length() == 11 && digits.charAt(1) == '0') {
      throw new IllegalArgumentException("area code cannot start with zero");
    }
    if (digits.length() == 10 && digits.charAt(0) == '1' || digits.length() == 11 && digits.charAt(1) == '1') {
      throw new IllegalArgumentException("area code cannot start with one");
    }
    if (digits.length() == 10 && digits.charAt(3) == '0' || digits.length() == 11 && digits.charAt(4) == '0') {
      throw new IllegalArgumentException("exchange code cannot start with zero");
    }
    if (digits.length() == 10 && digits.charAt(3) == '1' || digits.length() == 11 && digits.charAt(4) == '1') {
      throw new IllegalArgumentException("exchange code cannot start with one");
    }
  }

  public String getNumber() {
    return this.digits.length() != 11 ? this.digits : this.digits.substring(1);
  }
}
