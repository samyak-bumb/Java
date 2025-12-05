class stringBufferMethods {

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Java");

    System.out.println("Initial: " + sb);
    sb.append(" Programming");
    System.out.println("Append: " + sb);

    sb.insert(4, " Language");
    System.out.println("Insert: " + sb);

    sb.replace(5, 14, " is");
    System.out.println("Replace: " + sb);

    sb.delete(5, 8);
    System.out.println("Delete: " + sb);

    sb.reverse();
    System.out.println("Reverse: " + sb);

    sb.reverse(); // to restore original
    System.out.println("Capacity: " + sb.capacity());
    System.out.println("Length: " + sb.length());
    System.out.println("CharAt(2): " + sb.charAt(2));
    System.out.println("Substring(0,4): " + sb.substring(0, 4));

    sb.setCharAt(0, 'K');
    System.out.println("SetCharAt: " + sb);

    sb.ensureCapacity(50);
    System.out.println("Ensure Capacity: " + sb.capacity());

    sb.setLength(5);
    System.out.println("Set Length: " + sb);
  }
}
