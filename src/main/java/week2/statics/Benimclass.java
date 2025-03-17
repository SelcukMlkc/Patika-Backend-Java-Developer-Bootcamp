package week2.statics;

public class Benimclass {

    public static void main(String[] args) {

        kutu kutu1 = new kutu();

        kutu kutu2 = new kutu();

        kutu.Ad("Selçuk");  // Normalde kutu1.Ad da yapabilirim. Ama ad voidi static olduğu için yeni kutu1 tanımlamadan direkt kutu.ad olarak çağırabiliyorum

        kutu2.Soyad("Malakcı");  //soyad statik olmadığı için kutu.soyad çalışmıyor.
    }
}
