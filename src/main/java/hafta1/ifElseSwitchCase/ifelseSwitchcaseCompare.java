package hafta1.ifElseSwitchCase;

public class ifelseSwitchcaseCompare {

    public static void main(String[] args) {

        int gün = 1;

        if (gün == 1) {
            System.out.println("bugün pazartesi");
        } else if (gün == 3) {
            System.out.println("bugün çarşamba");
        } else if (gün == 5) {
            System.out.println("bugün cuma");
        } else {
            System.out.println("bugün o gün değil!");
        }

        switch (gün) {
            case 0:
                System.out.println("bugün pazar");
                break;

            case 2:
                System.out.println("bugün salı");
                break;

            case 4:
                System.out.println("bugün perşembe");
                break;

            default:
                System.out.println("bugün o gün!");
        }



    }

}
