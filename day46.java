import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" MENU MAKANAN ");
        System.out.println(" 1. NASI KUNING ");
        System.out.println(" 2. AYAM BAKAR ");
        System.out.println(" 3. TONGSENG BABI ");
        System.out.println(" 4.  ES OYEN ");
        System.out.println("silahkan dipilih");
        int pilihan = s.nextInt();
        String nama;
        int harga;
        switch (pilihan) {
        case 1:
            nama = "nasi kuning";
            harga = 15000;
            break;
        case 2:
            nama = "ayam bakar";
            harga = 25000;
            break;
        case 3:
            nama = "tongseng babi";
            harga = 30000;
            break;
        case 4:
            nama = "es oyen";
            harga = 5000;
            break;
        default:
            System.out.println("menu tidak tersedia");
            return;
        }
        System.out.println("jumlah porsi");
        int jumlah = s.nextInt();
        int total = harga * jumlah;
        System.out.println("menu yang dipesan");
        System.out.println("menu\t" + nama);
        System.out.println("harga\t" + harga);
        System.out.println("jumlah\t" + jumlah);
        System.out.println("total\t" + total);
    }
}
