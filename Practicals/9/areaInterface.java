interface Shape {
  double area();
}

class Rectangle implements Shape {

  double length, breadth;

  Rectangle(double l, double b) {
    length = l;
    breadth = b;
  }

  public double area() {
    return length * breadth;
  }
}

class Circle implements Shape {

  double radius;

  Circle(double r) {
    radius = r;
  }

  public double area() {
    return Math.PI * radius * radius;
  }
}

class areaInterface {

  public static void main(String[] args) {
    Rectangle rect = new Rectangle(5, 4);
    Circle cir = new Circle(3);

    System.out.println("Area of Rectangle: " + rect.area());
    System.out.println("Area of Circle: " + cir.area());
  }
}
