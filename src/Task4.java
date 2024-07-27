public class Task4 {
    public static void main(String[] args) {
        int a = 6;
        int b =3;

        System.out.println("Ilkin variant A : " + a+ " --- B : " + b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Yeni variant  A : " + a + " ---- B : " + b);
    }
}
