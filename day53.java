import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int berapakali;
        int total = 1;
        do {
            System.out.print("tebak prabowo berapa kali jadi capres   :");
            berapakali = a.nextInt();
            total *= berapakali;
        } while (berapakali != 3);
        {
            System.out.println("benar sekali");
            System.out.println("total   :" + total);
        }

    }
}
