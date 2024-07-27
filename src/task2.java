import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println("Enter number");
        int mum1 = num.nextInt();

        for(int i = 0; i<=mum1; i++){
            if(!(i%2==0)){
                System.out.println(i);
            }
        }
    }
}
