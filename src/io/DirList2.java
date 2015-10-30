package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2 {
  public static FilenameFilter filter(final String regex) {
    return new FilenameFilter() {
      private Pattern pattern = Pattern.compile("regex");
      
      @Override
      public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
      }
    };
  }
  
  public static void main(String[] args) {
    //System.out.println(args[0]);
    File path = new File(".\\src\\io");
    String[] list;
    if (args.length == 0) {
      list = path.list();
    }
    else {
      list = path.list(filter(args[0]));
    }
    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
    for (String dirItem : list) {
      System.out.println(dirItem);
    }
  }
}
