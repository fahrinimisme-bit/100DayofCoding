import java.util.Scanner;

public class day17 {
    public static void main(String[] args) {
        Scanner slankgakadamatinya = new Scanner(System.in);
        System.out.print("masukkan nilai awal bosqu: ");
        int anjay1 = slankgakadamatinya.nextInt();
        System.out.print("masukkan nilai kedua bosqu:");
        int anjay2 = slankgakadamatinya.nextInt();
        anjay1 = anjay2;
        System.out.println("anjay1 = anjay2, anjay1 = " + anjay1);
        anjay1 += 70;
        System.out.println("anjay1 + \t\t= 70, " + anjay1);
        anjay1 -= 60;
        System.out.println("anjay1 - \t\t= 60, " + anjay1);
        anjay1 *= 50;
        System.out.println("anjay1 * \t\t= 50, " + anjay1);
        anjay1 /= 40;
        System.out.println("anjay1 / \t\t= 60, " + anjay1);
        anjay1 %= 30;
        System.out.println("anjay1 % \t\t= 40 , " + anjay1);
        System.out.println("nilai akhirnya bosq anjay1 = " + anjay1);
        slankgakadamatinya.close();
    }

}
