package generics;

/**
 * FileName: FactoryConstraint.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-18
 */
public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Fatory());
        new Foo2<Widget>(new WidgetFactory());
    }
}

interface FactoryI<T> {
    T create();
}

class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
}

class IntegerFactory implements FactoryI<Integer> {

    @Override
    public Integer create() {
        return new Integer(0);
    }
}

class Widget {
    public static class Fatory implements FactoryI<Widget> {

        @Override
        public Widget create() {
            return new Widget();
        }
    }
}

class WidgetFactory implements FactoryI<Widget> {

    @Override
    public Widget create() {
        return new Widget();
    }
}
