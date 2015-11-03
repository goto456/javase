package net.mindview.util;

import java.io.File;
import java.io.IOException;

public class ProcessFiles {
  public interface Strategy {
    void process(File file);
  }
  
  private Strategy strategy;
  private String ext;
  
  public ProcessFiles(Strategy strategy, String ext) {
    this.strategy = strategy;
    this.ext = ext;
  }
  
  public void processDirectoryTree(File root) throws IOException {
    for (File file : Directory.walk(
        root.getAbsolutePath(), ".*\\." + ext)) {
      strategy.process(file.getCanonicalFile());
    }
  }
  
  public void start(String[] args) {
    try {
      if (args.length == 0) {
        processDirectoryTree(new File("."));
      }
      else {
        for (String arg : args) {
          File fileArg = new File(arg);
          if (fileArg.isDirectory()) {
            processDirectoryTree(fileArg);
          }
          else {
            if (!arg.endsWith("." + ext)) {
              arg += "." + ext;
              strategy.process(new File(arg).getCanonicalFile());
            }
          }
        }
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }    
  }
  
    
  public static void main(String[] args) {
    new ProcessFiles(new Strategy() {
      
      @Override
      public void process(File file) {
        // TODO Auto-generated method stub
        System.out.println(file);
      }
    }, "java").start(args);
  }
  
  
  
  
}
