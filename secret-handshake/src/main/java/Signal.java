enum Signal {

  WINK(1), DOUBLE_BLINK(2), CLOSE_YOUR_EYES(0b100), JUMP(0b1000);

  Signal(int num) {
    this.num = num;
  }

  private int num;

  public int num() {
    return num;
  }

}
