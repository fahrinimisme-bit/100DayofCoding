import java.util.Scanner;

public class day85 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("berapa pengeluaranmu selama beberapa hari?. masukkan !: ");
        int n = s.nextInt();
        int[] uang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("pengeluaran hari ke " + (i + 1) + " = Rp. ");
            uang[i] = s.nextInt();

        }
        int min = uang[0];
        for (int i = 1; i < n; i++) {
            if (uang[i] < min) {
                min = uang[i];

            }

        }
        System.out.println("pengeluaran terendah    :" + min);
    }
}
