class integerWrapperMethods {

  public static void main(String[] args) {
    Integer num = 25;

    System.out.println("Value: " + num);
    System.out.println("toString(): " + num.toString());
    System.out.println("compareTo(20): " + num.compareTo(20));
    System.out.println("equals(25): " + num.equals(25));
    System.out.println("hashCode(): " + num.hashCode());
    System.out.println("byteValue(): " + num.byteValue());
    System.out.println("shortValue(): " + num.shortValue());
    System.out.println("doubleValue(): " + num.doubleValue());
    System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);
    System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);
    System.out.println("parseInt(\"100\"): " + Integer.parseInt("100"));
    System.out.println("valueOf(50): " + Integer.valueOf(50));
  }
}
