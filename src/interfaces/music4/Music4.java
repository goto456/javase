package interfaces.music4;

abstract class Instrument {
  private int i;
  public abstract void play(Note n);
  public String what() {
    return "Instrument";
  }
  public abstract void adjust();
}

class Wind extends Instrument {
  public void play(Note n) {
    System.out.println("Wind.play() " + n);
  }
  public String what() {
    return "Wind";
  }
  public void adjust() {}
}

public class Music4 {
  static void tune(Instrument instrument) {
    instrument.play(Note.MIDDLE_C);
  }
  
  public static void main(String[] args) {
    tune(new Wind());
  }
}
