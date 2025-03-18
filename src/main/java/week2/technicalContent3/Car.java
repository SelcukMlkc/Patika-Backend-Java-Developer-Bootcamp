package week2.technicalContent3;

public class Car implements Vehicle {

    //fields (Özellikler)

    private String brand;

    private  String model;

    private int maxSpeed;

    private int horsePower;

    private int maxGearCount = 6;

    private int gear = 0;

    //  Bu değişkenler, private olarak tanımlandığı için dışarıdan doğrudan erişilemez.

    // Şimdi Constructorlar (Yapıcı Metodlar) ı yapıcaz :

    public Car() {    //Boş Constructor

        //  Bu constructor, parametre almayan bir Car nesnesi oluşturmaya yarar.
    }

    public Car(String brand, String model){    // Parametreli Constructor

        this.brand = brand;
        this.model = model;

        // Bu constructor, bir marka ve model belirterek Car nesnesi oluşturmaya yarar.
    }



    public void move() {

        System.out.println("İleri gidiyoruz");

        //Bu metot çağrıldığında araba ileri gider.

    }

    public void incrementGear(int gearCount){

        if (gearCount <= maxGearCount) {
            this.gear = gearCount;
            System.out.println("Vites şuanda : " + gear);
        } else {
            System.out.println("Max vites boyutundan fazla giriş yapıldı.");
        }
    }

    // Şimdi de Getter ve Setter Metodlarını kullancaz. Bu metodlar, private değişkenlere erişmek ve güncellemek için kullanılır.

    public String getBrand() {
        return brand;
    }

    // getBrand() metodu, arabanın markasını döndürür.

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // setBrand() metodu, yeni bir marka atamak için kullanılır.

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("Hız negatif olamaz!");
        }
    }

    // gördüğün gibi maxspeed için temiz bir kod yazabildim ve oluşabilecek sorunların önüne geçtim. maxspeed'i en başta private değil de public olarak yazsaydım.
    // getter ve setter olmadan da başka bir sınıfta ulaşım sağlayabilirdim ama hatalara açık olurdu. Bu şekilde bir önlem alamazdım.
    // Ayrıca başka bir sınıf bunları değiştirebilir ve beklenmedik hatalara neden olabilir.

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void start() {
        System.out.println("Motor Başlatıldı");
    }
}
