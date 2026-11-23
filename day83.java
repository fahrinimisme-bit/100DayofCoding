import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("berapa pengeluaranmu selama beberapa hari?. masukkan !: ");
        int pengeluaran = s.nextInt();

        int[] rp = new int[pengeluaran];
        int total = 0;
        for (int i = 0; i < pengeluaran; i++) {
            System.out.print("pengeluaran hari ke " + (i + 1) + " = Rp. ");
            rp[i] = s.nextInt();
        }
        for (int i = 0; i < rp.length; i++) {
            total += rp[i];
        }
        System.out.print("totalnya :Rp. "+total);
    }
}
