package polymorphism;

class Meal {
  Meal() {
    System.out.println("Meal()");
  }
}

class Bread {
  Bread() {
    System.out.println("Bread()");
  }
}

class Cheese {
  Cheese() {
    System.out.println("Cheese()");
  }
}

class Letture {
  Letture() {
    System.out.println("Letture()");
  }
}

class Lunch extends Meal {
  Lunch() {
    System.out.println("Lunch()");
  }
}

class PortableLunch extends Lunch {
  public PortableLunch() {
    System.out.println("PortableLunch()");
  }
}

public class Sandwich extends PortableLunch {
  private Bread bread = new Bread();
  private Cheese cheese = new Cheese();
  private Letture letture = new Letture();
  
  public Sandwich() {
    System.out.println("Sandwich()");
  }
  
  public static void main(String[] args) {
    new Sandwich();
  }
}
