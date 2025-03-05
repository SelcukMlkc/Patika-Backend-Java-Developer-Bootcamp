package hafta1.JavaEgıtımı;

public class SwitchcaseMain3 {
    public static void main(String[] args) {

        int grade = 85;

        String letterGrade =  switch (grade / 10) {
            case 10, 9 -> "A";
            case 8, 7 -> "B";
            case 6, 5 -> "C";
            default -> "F";
        };
        System.out.println("Harf Notu: " + letterGrade);





    }
}
