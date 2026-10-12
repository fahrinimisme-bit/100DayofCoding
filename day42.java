import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = s.nextDouble();

        System.out.print("Masukkan potongan: ");
        double potongan = s.nextDouble();

        if (potongan > gajiPokok) {
            System.out.println("Potongan tidak boleh lebih besar dari gaji!");
        } else {
            double gajiBersih = gajiPokok - potongan;
            System.out.println("Gaji bersih: Rp " + gajiBersih);
        }
    }
}
