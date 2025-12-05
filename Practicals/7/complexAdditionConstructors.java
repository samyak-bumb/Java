class complexAdditionConstructors {

  int real, imag;

  // Default constructor
  complexAdditionConstructors() {
    real = 0;
    imag = 0;
  }

  // Parameterized constructor
  complexAdditionConstructors(int r, int i) {
    real = r;
    imag = i;
  }

  // Copy constructor
  complexAdditionConstructors(complexAdditionConstructors c) {
    real = c.real;
    imag = c.imag;
  }

  // Method to add two complex numbers
  complexAdditionConstructors add(complexAdditionConstructors c2) {
    complexAdditionConstructors temp = new complexAdditionConstructors();
    temp.real = this.real + c2.real;
    temp.imag = this.imag + c2.imag;
    return temp;
  }

  void display() {
    System.out.println(real + " + " + imag + "i");
  }

  public static void main(String[] args) {
    complexAdditionConstructors c1 = new complexAdditionConstructors(3, 4);
    complexAdditionConstructors c2 = new complexAdditionConstructors(2, 5);
    complexAdditionConstructors c3 = c1.add(c2);

    System.out.print("Sum: ");
    c3.display();
  }
}
