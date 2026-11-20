import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("jumlah barang yang dibeli    : ");
        int jumlah = s.nextInt();
        s.nextLine();
        String[] n = new String[jumlah];

        for (int i = 0; i < n.length; i++) {
            System.out.print("barang ke " + (i + 1) + ": ");
            n[i] = s.nextLine();

        }
        System.out.println("\nDAFTAR BELANJA:");
        for (int i = 0; i < n.length; i++) {
            System.out.println((i + 1)+"." + n[i]);
        }
    }
}
