package week3.generics;

public class BoundedGenericExample<T extends Animal> {

    // private static T content;   // statk generic ifadesi olmaz!
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
