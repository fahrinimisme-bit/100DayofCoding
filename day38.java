import java.util.Scanner;
public class day38 {
public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.println("======== WARKOP WONG ATOS =========");
    System.out.println("1. Rica - rica nyambek -20000");
    System.out.println("2. Rica - rica garangan - 15000");
    System.out.println("3. Rica - rica bulus - 23000");
    System.out.println("====================================");
    System.out.println("MONGGO PILIH MENU YANG ANDA INGINKAN");
    int pilihan = a.nextInt();
    int harga = 0;
    String menu = "";



    if (pilihan == 1) {
        System.out.println("AKU PESEN  RICA - RICA NYAMBEK");
        menu = "Rica - Rica Nyambek";
        harga = 20000;
    } else if (pilihan == 2) {
        System.out.println("AKU PESEN  RICA - RICA GARANGAN");
        menu = "Rica - Rica Garangan";
        harga = 15000;
    } else if (pilihan == 3) {
        System.out.println("AKU PESEN  RICA - RICA BULUS");
        menu = "Rica - Rica Bulus";
        harga = 23000;
    } else {
        System.out.println("PILIHAN MU RA ONOK NDOS");
        return ;
    }
    System.out.println("MONGGO JUMLAH MENU YANG ANDA PESEN");
    int jumlah = a.nextInt();
    int TotalHarga = jumlah * harga;
    System.out.println("====================================");
        System.out.println("PILIHAN       : " + menu);
        System.out.println("HARGA PER PESANAN  : " + harga);
        System.out.println("JUMLAH PILIHAN : " + jumlah);
        System.out.println("TOTAL HARGA   : " + TotalHarga);
        System.out.println("====================================");


}
}
