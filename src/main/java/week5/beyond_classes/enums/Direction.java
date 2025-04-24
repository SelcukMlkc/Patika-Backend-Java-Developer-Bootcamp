package week5.beyond_classes.enums;

public enum Direction {
    NORTH(0, "North"),
    EAST(90, "East"),
    SOUTH(180, "South"),
    WEST(270, "West");


    private final int angel;
    private final String direction;

    Direction(int angel, String direction) {

        this.angel = angel;
        this.direction = direction;
    }

    public int getAngel() {
        return angel;
    }

    public String getDirection() {
        return direction;
    }
}
