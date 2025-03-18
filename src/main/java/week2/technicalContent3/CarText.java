package week2.technicalContent3;

public class CarText {

    public static void main(String[] args) {

        //Bu kodun yaptığı şey:
        //İlk koddaki Car sınıfından nesneler oluşturmak.
        //Car sınıfındaki metodları çağırarak araba bilgilerini değiştirmek.
        //Arabayı hareket ettirip vites artırmak.
        //Son vites bilgisini ekrana yazdırmak.

        Car bmw = new Car();   //nesne oluşturuldu.  instance

        Car bmw2 = new Car("BMW", "218");

        bmw.setBrand("BMW");

        bmw.setModel("320");

        bmw.setMaxSpeed(285);

        bmw.setHorsePower(180);

        bmw.move();

        bmw.incrementGear(2);  //increment: artış  bmw arabasının o andaki vitesini belirledik

        int gear = bmw.getGear();

        System.out.println(gear);

        System.out.println("Araba Markası: " + bmw.getBrand());

        // Vehicle vehicle = new Vehicle(); //soyun class dan ve interface den nesne oluşturulamaz

     }
        }





