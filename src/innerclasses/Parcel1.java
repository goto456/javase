package innerclasses;

public class Parcel1 {
  class Contents {
    private int i = 11;
    
    public int value() {
      return i;
    }
  }
  
  class Destination {
    private String label;
    
    Destination(String whereTo) {
      label = whereTo;
    }
    
    public String readLabel() {
      return label;
    }
  }
  
  public void ship(String destination) {
    Contents contents = new Contents();
    Destination dest = new Destination(destination);
    System.out.println(dest.readLabel());
  }
  
  public static void main(String[] args) {
    Parcel1 p = new Parcel1();
    p.ship("China");
  }
}
