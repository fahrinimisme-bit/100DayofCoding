import java.util.Scanner;

public class day40 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("total belanja\t:");
        int totalbelanja = s.nextInt();
        System.out.println("statusmember");
        int status = s.nextInt();
        double diskonmember = 0;
        if (totalbelanja >= 200000 && status == 1) {
            diskonmember = totalbelanja * 0.20;
        } else if (totalbelanja >= 200000 && status == 1) {
            diskonmember = totalbelanja * 0.10;
        }

        double hargaakhir = totalbelanja - diskonmember;
        System.out.println("diskon\t:" + diskonmember);
        System.out.println("bayarnya\t:" + hargaakhir);
    }
}
