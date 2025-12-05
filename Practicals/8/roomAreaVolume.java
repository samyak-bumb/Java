class Room {

  double length, breadth;

  Room(double l, double b) {
    length = l;
    breadth = b;
  }

  double area() {
    return length * breadth;
  }
}

class RoomVolume extends Room {

  double height;

  RoomVolume(double l, double b, double h) {
    super(l, b);
    height = h;
  }

  double volume() {
    return length * breadth * height;
  }

  public static void main(String[] args) {
    RoomVolume r = new RoomVolume(5, 4, 3);
    System.out.println("Area: " + r.area());
    System.out.println("Volume: " + r.volume());
  }
}
