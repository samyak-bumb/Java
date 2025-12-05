class primitiveObjectCreation {

  public static void main(String[] args) {
    // Using Wrapper class constructors (deprecated but valid)
    Integer a = new Integer(10);
    Double b = new Double(20.5);
    Character c = new Character('A');

    // Using valueOf() method
    Integer x = Integer.valueOf(15);
    Double y = Double.valueOf(12.34);
    Character z = Character.valueOf('B');

    System.out.println("Integer (constructor): " + a);
    System.out.println("Double (constructor): " + b);
    System.out.println("Character (constructor): " + c);

    System.out.println("Integer (valueOf): " + x);
    System.out.println("Double (valueOf): " + y);
    System.out.println("Character (valueOf): " + z);
  }
}
