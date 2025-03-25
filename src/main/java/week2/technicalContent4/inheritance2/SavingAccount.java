package week2.technicalContent4.inheritance2;

public class SavingAccount extends Account{

    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;

    }


   /* public SavingAccount(double interestRate) {    //account da böyle bir default constructor yok!
            //super(balance);
            this.interestRate = interestRate;
    } */

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
