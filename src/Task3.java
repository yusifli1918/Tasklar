import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int sayi = scanner.nextInt();

        int toplam = 0;

        while (sayi!=0){

            int onluq =sayi%10;
            toplam=toplam+onluq;
            sayi=sayi/10;
        }

        System.out.println("Ededin toplami: " + toplam);

    }
}
