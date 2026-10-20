import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("mau buat ktp? emng umur kamu berapa?  :");
        int umur = s.nextInt();
        String ktp = (umur >= 17) ? "oke kalo gitu bisa" : "aduh gak bisa";
        System.out.println("jadinya...." + ktp);
    }

}
