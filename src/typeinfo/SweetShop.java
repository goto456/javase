package typeinfo;

class Candy {
  static {
    System.out.println("loading Candy.");
  }
}

class Gum {
  static {
    System.out.println("loading Gum.");
  }
}

class Cookie {
  static {
    System.out.println("loading Cookie.");
  }
}

public class SweetShop {
  public static void main(String[] args) {
    System.out.println("inside Main");
    new Candy();
    System.out.println("after creating Candy.");
    try {
      Class.forName("Gum");
    } catch(ClassNotFoundException e) {
      System.out.println("Couldn't find Gum");
    }
    System.out.println("After Class.forName(\"Gum\")");
    new Cookie();
    System.out.println("After create Cookie.");
  }
}
