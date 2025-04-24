package week5.beyond_classes.enums;

public enum Operation {

    ADD{
        @Override
        public int apply(int number1, int number2) {
            return number1 + number2;
        }
    },

    SUBTRACT {
        @Override
        public int apply(int number1, int number2) {
            return number1 - number2;
        }
    };

    public abstract int apply(int number1, int number2);
}
