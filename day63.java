import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan M = ");
        int m = s.nextInt();
        System.out.print("Masukkan N = ");
        int n = s.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += m;

            System.out.println(m + " ditambah " + n + " kali = " + total);
        }
        System.out.println("berarti " + m + " pangkat " + n);
    }
}
