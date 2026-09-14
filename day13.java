import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String alamat = inputScanner.nextLine();
        String kendaraan = inputScanner.nextLine();
        System.out.printf("saya pergi ke %s menggunakan %s%n", alamat, kendaraan);

        inputScanner.close();
    }
}
