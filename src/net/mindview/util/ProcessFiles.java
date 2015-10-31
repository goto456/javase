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
        
      }
    }
  }
  
  
  
  
}
