package week2.projects.salaryCalculator;

public class Employee {

    // 4 nitelik(field) belirledim:
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Kurucu Constructor metodu
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesabı
    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;  //%3'lük vergi
        }
    }

    // Bonus hesabı
    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // Maaş zammı
    public double raiseSalary() {
        int currentYear = 2021;
        int workYear = currentYear - this.hireYear;

        if (workYear < 10) {
            return this.salary * 0.05;
        } else if (workYear >= 10 && workYear < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    // Bilgileri yazdır.
    public String information() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double totalSalary = this.salary - tax + bonus + raise;

        return "Adı: " + this.name +
                "\nMaaşı: " + this.salary +
                "\nÇalışma Saati: " + this.workHours +
                "\nBaşlangıç Yılı: " + this.hireYear +
                "\nVergi: " + tax +
                "\nBonus: " + bonus +
                "\nMaaş Artışı: " + raise +
                "\nVergi ve Bonuslar ile birlikte maaş: " + (this.salary - tax + bonus) +
                "\nToplam Maaş: " + totalSalary;

    }

    public static void main(String[] args) {
        Employee emp = new Employee("kemal", 2000, 45, 1985);
        System.out.println(emp.information());
    }
    }


