import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.println("nama hari   ");
        int hari = w.nextInt();
        switch (hari) {
        case 1:
            System.out.println("senin");
            break;
        case 2:
            System.out.println("selasa");
            break;
        case 3:
            System.out.println("rabu");
            break;
        default:
            System.out.println("hari lain lah cuman contoh 3 hari");
        }

        System.out.println("hari ganjil :");
        int ganjil = w.nextInt();
        for (int i = 1; i <= ganjil; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("masukkan umur  :");
        int umur = w.nextInt();
        if (umur == 20) {
            System.out.println("produktif sekali");
        } else if (umur >= 15 && umur <= 35) {
            System.out.println("umur produktif");
            return;
        } else {
            System.out.println("produktif tapi b aja");
        }

        w.close();
    }
}
