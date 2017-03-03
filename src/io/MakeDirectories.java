package io;

import java.io.File;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class MakeDirectories {
  private static void usage() {
    System.err.println(
        "Usage: MakeDirectories path1 ...\n"
        + "Create each path\n"
        + "Usage: MakeDirectories -d path1 ...\n"
        + "Delets each path\n"
        + "Usage: MakeDirectories -r path1 path2\n"
        + "Renames from path1 to path2");
    System.exit(1);
  }
  
  private static void fileDate(File f) {
    System.out.println(
        "Absolute path: " + f.getAbsolutePath() + "\n"
        + "Can read: " + f.canRead() + "\n"
        + "Can write:  " + f.canWrite() + "\n"
        + "get name: " + f.getName() + "\n"
        + "get parent: " + f.getParent() + "\n"
        + "get path: " + f.getPath() + "\n" 
        + "lenght: " + f.length() + "\n" 
        + "last modified: " + f.lastModified());
    if (f.isFile()) {
      System.out.println("It's a file");
    }
    else if (f.isDirectory()) {
      System.out.println("It's a directory");
    }
           
  }
  
  public static void main(String[] args) {
    if (args.length < 1) {
      usage();
    }
    if ("-r".equals(args[0])) {
      if (args.length != 3) {
        usage();
      }
      File old = new File(args[1]);
      File rname = new File(args[2]);
      old.renameTo(rname);
      fileDate(old);
      fileDate(rname);
      return;
    }
    
    int count = 0;
    boolean del =false;
    if ("-d".equals(args[0])) {
      count++;
      del = true;
    }
    count--;
    while (++count < args.length) {
      File f = new File(args[count]);
      if (f.exists()) {
        System.out.println(f + " exists");
        if(del) {
          System.out.println("delete..." + f);
          f.delete();
        }
      }
      else {
        if (!del) {
          f.mkdirs();
          System.out.println("create " + f);
        }        
      }
      fileDate(f);
    }
  }
}
