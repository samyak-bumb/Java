class GrandParent {

  void showGrandParent() {
    System.out.println("This is GrandParent class");
  }
}

class Parent extends GrandParent {

  void showParent() {
    System.out.println("This is Parent class");
  }
}

class Child extends Parent {

  void showChild() {
    System.out.println("This is Child class");
  }

  public static void main(String[] args) {
    Child obj = new Child();
    obj.showGrandParent();
    obj.showParent();
    obj.showChild();
  }
}
