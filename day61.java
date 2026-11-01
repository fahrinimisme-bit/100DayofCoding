import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan n  :");
        int n = s.nextInt();
        int total = 1;
        for (int i = 1; i <= n; i++) {

            total *= i;

            System.out.println("dikali :" + i);
            System.out.println("total   : " + total);

        }
        System.out.println("total keseluruhan " + total);
    }
}
