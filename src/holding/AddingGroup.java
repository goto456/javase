package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class AddingGroup {
  public static void main(String[] args) {
    Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
    Integer[] moreInts = {7, 8, 9, 10};
    collection.addAll(Arrays.asList(moreInts));
    
  }
}
