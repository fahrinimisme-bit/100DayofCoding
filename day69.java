import java.util.Scanner;

public class day69 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Isi tinggi persegi panjang :");
    int n = s.nextInt();
    System.out.print("Isi lebar persegi panjang :");
    int m = s.nextInt();
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            System.out.print("= ");

        }
        System.out.println();

    }
}
}
