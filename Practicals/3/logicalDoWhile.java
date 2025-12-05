import java.util.*;

class logicalDoWhile {

  public static void main(String[] args) {
    int i = 1;
    do {
      if (i % 2 == 0 && i <= 10) System.out.println(i + " is even & ≤ 10");
      else if (i % 2 != 0 || i > 10) System.out.println(i + " is odd or > 10");
      i++;
    } while (i <= 15);
  }
}
