package holding;

import java.util.LinkedList;
import java.util.Queue;

class Command {
  private String name;
  public Command(String name) {
    this.name = name;
  }
  public void operation() {
    System.out.println("Comand name is : " + name);
  }
}

class ProcessCommand {
  public static Queue<Command> queue = new LinkedList<Command>();
  public static Command fillQueue(Command command) {
    queue.offer(command);
    return command;
  }
}

public class QueueTest {
  public static void pollQueue(Queue<Command> queue) {
    while (queue.peek() != null) {
      Command command = queue.poll();
      command.operation();
    }
  }
  
  public static void main(String[] args) {
    for (String s : "pop push get put poll pull peek jump set".split(" ")) {
      ProcessCommand.fillQueue(new Command(s));
    }
    
    pollQueue(ProcessCommand.queue);
  }
}
