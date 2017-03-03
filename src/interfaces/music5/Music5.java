package interfaces.music5;

import interfaces.music4.Note;

interface Instrument {
  int VALUE = 5;
  void play(Note n);
  void adjust();
}

class Wind implements Instrument {
  public void play(Note n) {
    System.out.println(this + ".play() " + n);
  }
  
  public String toString() {
    return "Wind";
  }
  
  public void adjust() {
    System.out.println(this + ".adjust()");
  }
}

public class Music5 {
  static void tune(Instrument instrument) {
    instrument.play(Note.MIDDLE_C);
  }
  
  public static void main(String[] args) {
    tune(new Wind());
  }
}
