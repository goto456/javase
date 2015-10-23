package holding;

import java.util.Stack;

public class StackTest {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    for (String i : "My name is Wang Biwen".split(" "))
      stack.push(i);
    while (!stack.empty()) {
      String str = stack.pop();
      System.out.print(str + " ");
    }
  }
}
