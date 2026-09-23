import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner adayinmylife = new Scanner(System.in);

        int angka1 = adayinmylife.nextInt();
        int angka2 = adayinmylife.nextInt();
        System.out.println("nilai sebelum ditukar kandaqu :");
        System.out.printf("angka1 = %d , angka2 = %d%n", angka1, angka2);

        int temp = angka1;
        angka1 = angka2;
        angka2 = temp;
        System.out.println("nilai sesudah ditukar kandaqu :");
        System.out.printf("angka1 = %d , angka2 = %d%n", angka1, angka2);
        adayinmylife.close();

    }
}
