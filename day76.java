import java.util.Scanner;

public class day76 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan teks (beri spasi di awal/akhir biar terlihat efek trim): ");
        String teks = s.nextLine();

        String teks_asli = teks.trim();
        String tukar = teks_asli.replace("prabowo", "teddy");

        System.out.println("asli      : ==" + teks + "==");
        System.out.println("efek trim : ==" + teks_asli + "==");

        if (teks_asli.length() >= 5) {
            String lima_huruf = teks_asli.substring(0, 5);
            String sisanya_dari_huruf_ke4 = teks_asli.substring(3);

            System.out.println("5 huruf awal            : " + lima_huruf);
            System.out.println("sisanya dari huruf ke-4 : " + sisanya_dari_huruf_ke4);
        } else {
            System.out.println("Teks terlalu pendek, minimal 5 huruf untuk substring");
        }

        System.out.println("efek tukar : " + tukar);

        s.close();
    }
}
