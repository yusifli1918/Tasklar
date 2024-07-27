import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number first");
        int num1 =scanner.nextInt();
        System.out.println("Enter number second");
        int num2 = scanner.nextInt();
        System.out.println("Enter comand:  +,  -,  *,  / ");
        String comand  = scanner.next();

        int result = 0;


        switch (comand){
            case "+":
                result = num1+num2;
                System.out.println("Nəticə " + result);
                break;

            case "-":
                result = num1-num2;
                System.out.println("Nəticə " + result);
                break;

            case "*":
                result = num1*num2;
                System.out.println("Nəticə " + result);
                break;

            case "/":
                if(num2 !=0){

                result = num1/num2;
                System.out.println("Nəticə " + result);
                break;
                }

        }

    }
}
