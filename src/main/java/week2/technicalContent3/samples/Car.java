package week2.technicalContent3.samples;

public class Car extends Object{

    private String brand;

    private String model;

    public static int horsePower = 150;

    public static final int MAX_HORSE_POWER = 150;  //constant -> degistirilemez

    public Car () {


    }

    public Car(String brand, String model) {  //signature (imza)

        this.brand = brand;
        this.model = model;

    }

    public Car(String brand) {

        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


}
