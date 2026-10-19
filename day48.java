import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan bilangan pertama\t:");
        int BilanganPertama = a.nextInt();
        System.out.print("operator\t:");
        char operator = a.next().charAt(0);
        System.out.print("masukkan bilangan kedua\t:");
        int BilanganKedua = a.nextInt();
        switch (operator) {
        case '+':
            System.out.println("hasil\t:" + (BilanganPertama + BilanganKedua));
            break;
        case '-':
            System.out.println("hasil\t:" + (BilanganPertama - BilanganKedua));
            break;
        case '*':
            System.out.println("hasil\t:" + (BilanganPertama * BilanganKedua));
            break;
        case '/':

            if (BilanganKedua == 0) {
                System.out.println("pembagian tidak boleh nol");
            } else {
                System.out.println("hasil\t:" + (BilanganPertama / BilanganKedua));
            }
            break;
        case '%':

            if (BilanganKedua == 0) {
                System.out.println("pembagian tidak boleh nol");
            } else {
                System.out.println("hasil\t:" + (BilanganPertama % BilanganKedua));
            }
            break;

        default:
            System.out.println("operator nda valid");
            break;
        }

    }
}
