import java.util.Scanner;

public class day75 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Masukkan kode voucher    : ");
    String voucher = s.nextLine();
    if (voucher.isEmpty()) {
        System.out.println("Kode voucher belum diisi");
    } else if (voucher.equals("ACAB1213")) {
        System.out.println("selamat voucher mu berhasil persis luar biasa");
    }else if (voucher.equalsIgnoreCase("ACAB1213")) {
        System.out.println("selamat berhasil yang b aja");
    }else if (voucher.contains("1213")) {
        System.out.println("kode voucher menggunakan angka dan huruf");
    } else{
        System.out.println("voucher kadaluarsa");
    }

}
}
