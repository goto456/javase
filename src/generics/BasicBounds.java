package generics;

import java.awt.*;

/**
 * FileName: BasicBounds.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-19
 */
public class BasicBounds {
}

interface HasColor {
    java.awt.Color getColor();
}

class Colored<T extends HasColor> {
    T item;

    public Colored(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public Color color() {
        return item.getColor();
    }
}

class Dimension {
    public int x, y, z;
}

class ColoredDemision<T extends Dimension & HasColor> {
    T item;

    ColoredDemision(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    Color color() {
        return item.getColor();
    }

    int getX() {
        return getX();
    }
}
