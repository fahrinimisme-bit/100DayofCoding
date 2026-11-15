import java.util.Scanner;

public class day76 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Masukkan teks (teks harus lebih 3 hurus biar ada efek trimnya): ");
    String teks = s.nextLine();
    
    String teks_asli = teks.trim();
    String lima_huruf = teks_asli.substring(0,3);
    String sisanya_mulai_dari_4 = teks_asli.substring(4);
    String tukar = teks_asli.replace("prabowo","teddy");


    System.out.println("asli:=="  +  teks + "==");
    System.out.println("efek trim   : ==" + teks_asli + "==" );
    System.out.println("5 huruf awal    :" + lima_huruf);
    System.out.println("sisanya : " + sisanya_mulai_dari_4);
    System.out.println("efek tukar  :" + tukar);


}
}
