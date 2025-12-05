class numberClassConversion {

  public static void main(String[] args) {
    Integer num = 100;

    int i = num.intValue();
    byte b = num.byteValue();
    short s = num.shortValue();
    long l = num.longValue();
    float f = num.floatValue();
    double d = num.doubleValue();

    System.out.println("intValue(): " + i);
    System.out.println("byteValue(): " + b);
    System.out.println("shortValue(): " + s);
    System.out.println("longValue(): " + l);
    System.out.println("floatValue(): " + f);
    System.out.println("doubleValue(): " + d);
  }
}
