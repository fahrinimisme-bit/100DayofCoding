import java.util.Scanner;

public class day43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka = ");
        int angka = input.nextInt();
        
        System.out.println("============================"); 
        
        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan dari 3 & 5");
        } else if (angka % 3 == 0) {
            System.out.println(angka + " adalah kelipatan dari 3");
        } else if (angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan dari 5");
        } else {
            System.out.println(angka + " tidak termasuk kelipatan 3 dan 5");
        }
        
        input.close(); 
    }
}
