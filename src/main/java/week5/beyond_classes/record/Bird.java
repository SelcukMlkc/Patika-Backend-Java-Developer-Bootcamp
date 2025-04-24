package week5.beyond_classes.record;

public record Bird(int numberEggs, String name) {

    public Bird(int numberEggs, String name, String nickName) {

        this(numberEggs, name + "-" + nickName);
    }
}
