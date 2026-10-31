import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan n  :");
        int n = s.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {

            total += i;

            System.out.println("ditambah :" + i + ", totalnya    :" + total);

        }
        System.out.println("total keseluruhan " + total);
    }
}
