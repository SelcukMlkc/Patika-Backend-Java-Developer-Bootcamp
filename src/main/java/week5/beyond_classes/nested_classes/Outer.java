package week5.beyond_classes.nested_classes;

public class Outer {

    static class Nested {

        public void nestedDisplay() {

            System.out.println("Static nested class, public method");
        }


        private void privatenestedDisplay() {

            System.out.println("Static nested class, private method");
        }
    }

    public void outerDisplay() {
        Outer.Nested nested = new Outer.Nested();
        nested.nestedDisplay();
        nested.privatenestedDisplay();
    }
}
