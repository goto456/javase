package generics;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;

/**
 * FileName: InheritBounds.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-2-15
 */

class HoldItem<T> {
    T item;

    HoldItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class Colored2<T extends HasColor> extends HoldItem<T> {
    Colored2(T item) {
        super(item);
    }

    java.awt.Color color() {
        return item.getColor();
    }
}

class ColoredDimension2<T extends Dimension & HasColor> extends Colored2<T> {
    public ColoredDimension2(T item) {
        super(item);
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }

}


public class InheritBounds {
}
