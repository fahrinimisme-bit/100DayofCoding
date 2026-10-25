import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        int Y = s.nextInt();
        int Z = s.nextInt();
        if (Y > X) {
            X += 1;
        } else if (Y < X) {
            X -= 1;
        }
        if (Z > X) {
            X += 2;
        } else if (Z < X) {
            X -= 2;
        }
        System.out.println(X);
    }
}
