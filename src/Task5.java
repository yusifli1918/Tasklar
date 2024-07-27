public class Task5 {
    private static int number;

    public static void main(String[] args) {
        int number = 12345;
        int uzunluq=0;
        while(number!=0){
            number = number/10;
            uzunluq++;
        }

        System.out.println("Ededin uzunligi  " + uzunluq);

    }
}
