import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int ay = scanner.nextInt();

        switch (ay){
            case 1:
                System.out.println("Yanvar ");
                break;
            case 2:
                System.out.println("Fevral");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Aprel");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Iyun");
                break;
            case 7:
                System.out.println("Iyul");
                break;
            case 8:
                System.out.println("Avqust");
                break;
            case 9:
                System.out.println("Sentyabr");
                break;
            case 10:
                System.out.println("Oktyabr");
                break;
            case 11:
                System.out.println("Noyabr");
                break;
            case 12:
                System.out.println("Dekabr");
                break;
            default:
                System.out.println("Wrong number");
        }
    }
}
