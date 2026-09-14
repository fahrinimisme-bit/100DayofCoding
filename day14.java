import java.util.Scanner;

public class day14 { 

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int angka1 = inputScanner.nextInt();
        int angka2 = inputScanner.nextInt();

        int hasilJumlah = angka1 + angka2;
        int hasilKurang = angka1 - angka2;
 
        
        System.out.printf("Hasil Penjumlahan (%d + %d) = %d%n", angka1, angka2, hasilJumlah);
        System.out.printf("Hasil pengurangan (%d - %d) = %d%n", angka1, angka2, hasilKurang);

        inputScanner.close();
    }
}
