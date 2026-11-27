import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("berapa pengeluaranmu selama beberapa hari?. masukkan !: ");
        int n = s.nextInt();
        int[] uang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("pengeluaran hari ke " + (i + 1) + " = Rp. ");
            uang[i] = s.nextInt();

        }
        System.out.println("=========================");
        System.out.println("=== riwayat pengeluaran awan ===");
        System.out.println("=========================");
        for (int i = 0; i < n; i++) {
            System.out.println("pengeluaran hari ke " + (i + 1) + " = Rp. " + uang[i]);

        }
        System.out.print("hari ke berapa yang mau diubah? : ");
        int hari = s.nextInt();
        System.out.print("pengeluaran barunya :Rp. ");
        uang[hari - 1] = s.nextInt();

        System.out.println("=========================");
        System.out.println("Riwayat pengeluaran setelah di ubah");
        System.out.println("=========================");
        for (int i = 0; i < n; i++) {
            System.out.println("pengeluaran hari ke " + (i + 1) + " = Rp. " + uang[i]);

        }
    }
}
