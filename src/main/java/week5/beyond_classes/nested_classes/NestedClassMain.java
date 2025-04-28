package week5.beyond_classes.nested_classes;

import week3.bookShoppingSystem.model.Order;

public class NestedClassMain {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerDisplay();

        Outer.Nested nested = new Outer.Nested();
        nested.nestedDisplay();

        // Outer2.Inner outer2 = new Outer2.Inner();
    }
}
