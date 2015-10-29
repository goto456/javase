package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Title: DirList
 * Description: 
 * @author Wang Biwen
 * @date 2015年10月29日 上午10:30:09
 * @version 1.0
 */
public class DirList {
  public static void main(String[] args) {
    File path = new File(".");
    String[] list;
    if (args.length == 0) {
      list = path.list();
    }
    else {
      list = path.list(new DirFilter(args[0]));
    }
    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
    for (String dirItem : list) {
      System.out.println(dirItem);
    }
  }
}

class DirFilter implements FilenameFilter {
  private Pattern pattern;
  
  /**
   * Description: 
   */
  public DirFilter(String regex) {
    pattern = Pattern.compile(regex);
  }
  
  public boolean accept(File dir, String name) {
    return pattern.matcher(name).matches();
  }
}