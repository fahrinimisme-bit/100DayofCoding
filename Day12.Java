import java.util.Scanner;

public class Day12 {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("INPUT DATA DIRI IWAN FALS );
        
        System.out.print("NAMA LENGKAP  : ");
        String nama = input.nextLine();

        System.out.print("TANGGAL LAHIR : ");
        String tanggalLahir = input.nextLine();

        System.out.print("JENIS KELAMIN (L/P): ");
        char jenisKelamin = input.next().charAt(0);

        System.out.print("TINGGI BADAN (cm): ");
        double tinggi = input.nextDouble();

        System.out.print("UMUR          : ");
        int umur = input.nextInt();

        System.out.println("\n OUTPUT DATA DIRI ");
        System.out.println("NAMA LENGKAP  : " + nama);
        System.out.println("TANGGAL LAHIR : " + tanggalLahir);
        System.out.println("JENIS KELAMIN : " + jenisKelamin);
        System.out.println("TINGGI BADAN  : " + tinggi + " cm");
        System.out.println("UMUR          : " + umur + " tahun");

        input.close();
    }
}
