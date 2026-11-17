import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan teks : ");
        String teks = s.nextLine();
        System.out.println("panjang (teks) :" + teks.length());
        System.out.println("huruf pertama pada teks :" + teks.charAt(0));
        System.out.println("huruf besar :" + teks.toUpperCase());
        System.out.println("huruf kecil :" + teks.toLowerCase());
        System.out.println("urutan spasi :" + teks.indexOf(" "));
        System.out.println("diawali tabe ? :" + teks.startsWith("tabe senior"));
        System.out.println("awal teks : " + teks.substring(0, teks.indexOf(" ")));
    }
}
