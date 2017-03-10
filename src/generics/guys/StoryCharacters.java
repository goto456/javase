package generics.guys;

/**
 * FileName: StoryCharacters.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-4
 */
public class StoryCharacters {
    private static int counter = 0;
    private final int id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
