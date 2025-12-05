class integerObjectToPrimitive {

  public static void main(String[] args) {
    Integer num = 150;

    byte b = num.byteValue();
    short s = num.shortValue();
    double d = num.doubleValue();

    System.out.println("Integer object: " + num);
    System.out.println("byteValue(): " + b);
    System.out.println("shortValue(): " + s);
    System.out.println("doubleValue(): " + d);
  }
}
