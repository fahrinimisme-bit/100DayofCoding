import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("pengen prabowo berapa pariode?    : ");
        int pariode = a.nextInt();
        if (pariode <= 2) {
            int loop = 1;
            while (loop <= pariode) {
                System.out.println(loop + " pariode");
                loop++;
            }

        } else {
            System.out.println("kamu gila");
        }
    }
}
