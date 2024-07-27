import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        String numberStr= Integer.toString(number);

        for (int i=1; i<=numberStr.length(); i++){
            System.out.println(numberStr.substring(0, i));
        }

        for (int i = numberStr.length()-1; i > 0; i--) {
            System.out.println(numberStr.substring(0, i));
        }




    }
}
