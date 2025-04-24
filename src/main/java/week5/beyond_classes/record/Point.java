package week5.beyond_classes.record;

public record Point(int x, int y) {

    static int z;

    public Point{
        if(x == y){
            System.out.println("x ile y değeri eşit olamaz !");
        }
    }
}
