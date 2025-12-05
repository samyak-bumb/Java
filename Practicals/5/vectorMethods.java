import java.util.*;

class vectorMethods {

  public static void main(String[] args) {
    Vector<Integer> v = new Vector<>();

    v.add(10);
    v.add(20);
    v.add(30);
    v.add(40);

    System.out.println("Initial Vector: " + v);
    System.out.println("Size: " + v.size());
    System.out.println("Capacity: " + v.capacity());

    v.addElement(50);
    System.out.println("After addElement: " + v);

    v.insertElementAt(15, 1);
    System.out.println("After insertElementAt: " + v);

    v.remove(2);
    System.out.println("After remove(index): " + v);

    v.removeElement(40);
    System.out.println("After removeElement: " + v);

    System.out.println("First Element: " + v.firstElement());
    System.out.println("Last Element: " + v.lastElement());
    System.out.println("Element at index 2: " + v.elementAt(2));

    v.setElementAt(100, 0);
    System.out.println("After setElementAt: " + v);

    v.clear();
    System.out.println("After clear: " + v);
  }
}
