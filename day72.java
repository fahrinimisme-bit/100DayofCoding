import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("masukkan angka dan masukkkan negatif untuk berhenti:");
        int n = s.nextInt();
        int total = 0;

        while (n >=0) {
            total+=n;
            n = s.nextInt();
        }
        System.out.println("total nya   :" + total);


    }
}
