import java.util.Scanner;

public class day15 {

     public static void main(String[] args) {
        Scanner inputScanner = new Scanner (System.in);

        int angka1 = inputScanner.nextInt();
        int angka2 = inputScanner.nextInt();

        int hasilKali = angka1 * angka2;
        int hasilbagi = angka1 / angka2;

        System.out.printf("hasil perkalian (%d * %d) = %d%n", angka1, angka2, hasilKali);
        System.out.printf("hasil pembagian (%d / %d) = %d%n ", angka1, angka2, hasilbagi);

        inputScanner.close();
     }
}
