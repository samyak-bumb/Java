public static void main(String[] args) {
  // Increment and decrement operators
  System.out.println("Increment and Decrement Operators:");
  int x = 5; // initial value
  System.out.println("Original value: x = " + x);

  // Post-increment: returns old value, then increases
  System.out.println("Post-increment (x++): " + x++);
  System.out.println("After post-increment: x = " + x);

  // Pre-increment: increases first, then returns new value
  System.out.println("Pre-increment (++x): " + ++x);
  System.out.println("After pre-increment: x = " + x);

  // Post-decrement: returns old value, then decreases
  System.out.println("Post-decrement (x--): " + x--);
  System.out.println("After post-decrement: x = " + x);

  // Pre-decrement: decreases first, then returns new value
  System.out.println("Pre-decrement (--x): " + --x);
  System.out.println("After pre-decrement: x = " + x);
  System.out.println();
}
