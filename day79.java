import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nilai = new int[3];
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("nilai " + (i + 1) + ": ");
            nilai [i] = s.nextInt();
            total+= nilai[i];
        }
        int rata_rata = total / nilai.length;
        System.out.println("total nilai : " + total );
        System.out.println("rata rata nilai    : "+ rata_rata);
    }
}
