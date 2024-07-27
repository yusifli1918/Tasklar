import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        double a = scanner.nextInt();
        System.out.println("Enter number 2");
        double b= scanner.nextInt();
        System.out.println("Enter number 3");
        double c =scanner.nextInt();

        if(a+b>c && a+c>b && b+c>a){

            double perimetr =a+b+c;
            double yarimperimetr = perimetr/2.0;
            double sahe = Math.sqrt(yarimperimetr*(yarimperimetr-a)*(yarimperimetr-b)*(yarimperimetr-c));
            System.out.println("Üçbucağın perimetri : " + perimetr + " Üçbucağın sahəsi : " + sahe);

        }else{
            System.out.println("Wrong numbers");
        }
    }
}
