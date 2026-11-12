import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===OPERATOR PERHITUNGAN===");
            System.out.println("1. PERTAMBAHAN");
            System.out.println("2. PENGURANGAN");
            System.out.println("3. PERKALIAN");
            System.out.println("4. PEMBAGIAN");
            System.out.println("5. MODULUS BAGI");
            System.out.println("0. KELUAR");
            System.out.print("isi pilihan (jika 0 maka selesai): ");
            pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("angka pertama : ");
                    double a1 = s.nextDouble();
                    System.out.print("angka kedua   : ");
                    double a2 = s.nextDouble();
                    System.out.println("hasil : " + (a1 + a2));
                    break;

                case 2:
                    System.out.print("angka pertama : ");
                    double a3 = s.nextDouble();
                    System.out.print("angka kedua   : ");
                    double a4 = s.nextDouble();
                    System.out.println("hasil : " + (a3 - a4));
                    break;

                case 3:
                    System.out.print("angka pertama : ");
                    double a5 = s.nextDouble();
                    System.out.print("angka kedua   : ");
                    double a6 = s.nextDouble();
                    System.out.println("hasil : " + (a5 * a6));
                    break;

                case 4:
                    System.out.print("angka pertama : ");
                    double a7 = s.nextDouble();
                    System.out.print("angka kedua   : ");
                    double a8 = s.nextDouble();
                    if (a8 == 0) {
                        System.out.println("error: tidak bisa membagi dengan nol");
                    } else {
                        System.out.println("hasil : " + (a7 / a8));
                    }
                    break;

                case 5:
                    System.out.print("angka pertama : ");
                    double a9 = s.nextDouble();
                    System.out.print("angka kedua   : ");
                    double a10 = s.nextDouble();
                    if (a10 == 0) {
                        System.out.println("error: tidak bisa modulus dengan nol");
                    } else {
                        System.out.println("hasil : " + (a9 % a10));
                    }
                    break;

                case 0:
                    System.out.println("selesai.");
                    break;

                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);

        s.close();
    }
}
