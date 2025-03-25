package week2.technicalContent4.encapsulation;

public class HospitalTest {

    public static void main(String[] args) {

        Patient patient = new Patient("123");
        patient.identityNumber = "123";   //bunun kontrolü artık yapılmadı. yanlış girmeme rağmen yanlış girdi çıktısı alınmıyor. Çünkü bu kapsüllenmedi
        patient.setName("Ahmet");
        patient.setAge(18);
        patient.setSurname("Çalık");

        Patient patient1 = new Patient("212");
        patient.setName("Selçuk");
        patient.setAge(28);
        patient.setSurname("İnan");

        Patient patient2 = new Patient("12345678901");
        patient.setName("Fatma");
        patient.setSurname("Beyaz");

    }
}
