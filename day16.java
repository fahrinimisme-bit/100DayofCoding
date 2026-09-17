import java.util.Scanner; // 1. Tambahkan import di paling atas

public class day16 {

    public static void main(String[] args) {

        Scanner iwanfalsterbaik = new Scanner(System.in);

        int angka1 = iwanfalsterbaik.nextInt();
        int angka2 = iwanfalsterbaik.nextInt();

        int hasilModulus = angka1 % angka2;

        System.out.println("===-----===");

        System.out.printf("hasil %d %% %d = %d\n", angka1, angka2, hasilModulus);

    }
}
