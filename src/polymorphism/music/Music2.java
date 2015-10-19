package polymorphism.music;

class Strass extends Instrument {
  public void play(Note n) {
    System.out.println("Strass.play() " + n);
  }
}

class Brass extends Instrument {
  public void play(Note n) {
    System.out.println("Brass.play() " + n);
  }
}

public class Music2 {
  public static void tune(Wind i) {
    i.play(Note.MIDDLE_C);
  }
  
  public static void tune(Strass i) {
    i.play(Note.MIDDLE_C);
  }
  
  public static void tune(Brass i) {
    i.play(Note.MIDDLE_C);
  }
  
  public static void main(String[] args) {
    Wind wind = new Wind();
    Strass strass = new Strass();
    Brass brass = new Brass();
    tune(wind);
    tune(strass);
    tune(brass);
  }
}
