import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan rak   :");
        int rak = a.nextInt();
        System.out.println("Masukkan buku   :");
        int buku = a.nextInt();

        for (int i = 1; i <= rak; i++) {
            for (int j = 1; j <= buku; j++) {
                System.out.println("rak ke  : " + i + " , buku " + j);

            }
        }
    }
}
