package week2.technicalContent4.Inheritance;

public class Electronic extends Product{

    private int warrantyPeriod;

    public Electronic(String name, Double price) {
        super(name, price);
    }

    public Electronic(String name) {
        super(name);
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}