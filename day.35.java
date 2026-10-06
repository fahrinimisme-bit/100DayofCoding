import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan umur\t: ");
        int umur = s.nextInt();

        System.out.print("Ada bapak didalam sana?\t: ");
        boolean adaBapakDidalam = s.nextBoolean();

        if (umur > 40) {
            if (adaBapakDidalam) {
                System.out.println("Boleh jadi presiden");
            } else {
                System.out.println("Nda boleh, kan bapakmu nda didalam sana");
            }
        } else {
            System.out.println("Nda boleh jadi presiden");
        }

        s.close();
    }
}
