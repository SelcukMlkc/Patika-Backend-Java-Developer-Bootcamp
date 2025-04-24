package week5.beyond_classes.record;

public record Rectangle(int with, int height) {

    public int area() {
        return with * height;
    }
}
