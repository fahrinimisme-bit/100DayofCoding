import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.print("Masukan bilangan pertama    : ");
        double bilangan1 = sc.nextDouble();
        System.out.println("============================");

        System.out.println("============================");
        System.out.print("jenis operator              : ");
        char operator = sc.next().charAt(0);
        System.out.println("============================");

        System.out.println("============================");
        System.out.print("Masukan bilangan kedua      : ");
        double bilangan2 = sc.nextDouble();
        System.out.println("============================");

        double hasil;

        System.out.println("");

        if (operator == '+') {
            hasil = bilangan1 + bilangan2;
            System.out.println("HASILNYA                    : " + hasil);
            System.out.println("============================");
        } else if (operator == '-') {
            hasil = bilangan1 - bilangan2;
            System.out.println("HASILNYA                    : " + hasil);
            System.out.println("============================");
        } else if (operator == '*') {
            hasil = bilangan1 * bilangan2;
            System.out.println("HASILNYA                    : " + hasil);
            System.out.println("============================");
        } else if (operator == '/') {
            if (bilangan2 != 0) {
                hasil = bilangan1 / bilangan2;
                System.out.println("HASILNYA                    : " + hasil);
                System.out.println("============================");
            } else {
                System.out.println("yo lek dibagi nol yo gak bisa kocak ");
            }
        } else if (operator == '%') {
            if (bilangan2 != 0) {
                hasil = bilangan1 % bilangan2;
                System.out.println("HASILNYA SISA PEMBAGIAN          : " + hasil);
                System.out.println("============================");
            } else {
                System.out.println("LEK KON BAGI NOL YO ORA ISO TO BOS ");
            }
        } else {
            System.out.println("operator mu gak jelas bos");
        }

        sc.close();
    }
}
