import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan and    :");
        int and = s.nextInt();
        System.out.println("ganjil :  ");
        for (int loop = 1; loop <= and; loop++) {
            if (loop % 2 != 0) {
                System.out.print(loop + " ");

            }
        }
        System.out.println();
        System.out.println("genap   :");
        for (int loop = 1; loop <= and; loop++) {
            if (loop % 2 == 0) {
                System.out.print(loop + " ");

            }

        }

    }
}
