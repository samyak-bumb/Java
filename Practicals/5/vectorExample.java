import java.util.*;

class vectorExample {

  public static void main(String[] args) {
    Vector<Object> v = new Vector<>();

    v.add(10);
    v.add("Java");
    v.add(3.14);
    v.add(true);

    System.out.println("Elements in Vector:");
    for (Object e : v) {
      System.out.println(e);
    }
  }
}
