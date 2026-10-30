import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan N   : ");
        int n = s.nextInt();
        System.out.print("Masukkan M  : ");
        int m = s.nextInt();
        int jumlah = 0;
        int banyak_lipatan = 0;
        for (int i = m; i <= n; i += m) {
            jumlah += i;
            banyak_lipatan++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("totalnyaa  :" + jumlah);
        System.out.println("banyak lipatan  :" + banyak_lipatan);
    }

}
