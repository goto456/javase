package interfaces.classprocessor;

import java.util.Arrays;

class Processor {
  public String name() {
    return getClass().getSimpleName();
  }
  
  public Object process(Object input) {
    return input;
  }
}

class UpperCase extends Processor {
  public String process(Object input) {
    return ((String)input).toUpperCase();
  }
}

class Splitter extends Processor {
  public String process(Object input) {
    return Arrays.toString(((String)input).split(" "));
  }
}

public class Apply {
  public static void process(Processor processor, Object object) {
    System.out.println(processor.name());
    System.out.println(processor.process(object));
  }
  
  public static String str = "Hello, my name is Wang Biwen.";
  
  public static void main(String[] args) {
    process(new Processor(), str);
    process(new UpperCase(), str);
    process(new Splitter(), str);
  }
}
