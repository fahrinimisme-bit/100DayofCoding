import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("MASUKKAN BILANGAN :");
        int bilangan = s.nextInt();
        String jenisBilangan = (bilangan % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.print("jenis " + jenisBilangan);

    }
}
