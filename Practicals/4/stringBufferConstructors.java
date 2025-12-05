class stringBufferConstructors {

  public static void main(String[] args) {
    // 1. Default constructor — creates empty buffer (capacity 16)
    StringBuffer sb1 = new StringBuffer();
    System.out.println("Default: " + sb1.capacity());

    // 2. Constructor with initial string
    StringBuffer sb2 = new StringBuffer("Java");
    System.out.println("With String: " + sb2);

    // 3. Constructor with specified capacity
    StringBuffer sb3 = new StringBuffer(50);
    System.out.println("With capacity: " + sb3.capacity());

    // 4. Constructor with another CharSequence
    CharSequence seq = "Programming";
    StringBuffer sb4 = new StringBuffer(seq);
    System.out.println("With CharSequence: " + sb4);
  }
}
