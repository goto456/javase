package strings;

public class Immutable {
  public static String upcase(String s) {
    return s.toUpperCase();
  }
  
  public static void main(String[] args) {
    String s = "wangbiwen";
    System.out.println(s);
    String ss = upcase(s);
    System.out.println(ss);
    System.out.println(s);
  }
}
