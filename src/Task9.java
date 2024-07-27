import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int faktorial = 1;

        for(int i = 1; i<=number; i++){
            faktorial= faktorial*i;

        }
        System.out.println(number + " ededinin faktoriali " +  faktorial);

    }
}
