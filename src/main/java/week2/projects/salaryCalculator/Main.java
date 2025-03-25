package week2.projects.salaryCalculator;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    // Main methodunda WorkersInfo methodu çağırıyoruz
    public static void main(String[] args) {
        WorkersInfo();
    }

    // Bu method bilgilerini giricez;
    protected static void WorkersInfo(){
        System.out.println("Çalışan adını giriniz: ");
        String name = scanner.nextLine();

        System.out.println("Çalışanın maaş bilgisini giriniz: ");
        int salary = scanner.nextInt();

        System.out.println("Çalışanın haftalık çalışma saatini giriniz: ");
        int workHours = scanner.nextInt();

        System.out.println("Çalışanın işe başlangıç yılını giriniz: ");
        int hireYear = scanner.nextInt();

        Employee employee = new Employee(name, salary, workHours, hireYear);  // Nesne oluşturduk

        System.out.println("Çalışan bilgileri: ");
        System.out.println(employee.information());

    }

}