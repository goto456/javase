package holding;

import java.util.Stack;

public class StackTest2 {
  public static void main(String[] args) {
    Stack<Character> stack = new Stack<Character>();
    String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == '+') {
        i++;
        stack.push(str.charAt(i));
        //System.out.println(str.charAt(i));
      }
      else if (ch == '-') {
        System.out.print(stack.pop() + " ");
      }
    }
  }
}
