import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan n   :");
        int n = s.nextInt();
        System.out.print("ganjil  :");
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("genap   :");
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }
    }
}
