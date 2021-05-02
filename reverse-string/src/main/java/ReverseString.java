class ReverseString {

    String reverse(String inputString) {
        if (inputString.isEmpty() || inputString.length() == 1) {
            return inputString;
        }
        StringBuilder stringBuilder = new StringBuilder(inputString);
        return stringBuilder.reverse().toString();
    }
  
}
