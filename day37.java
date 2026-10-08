import java.util.Scanner;
public class day37 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);\
    System.out.print("masukkan nilai: ");
    int nilai = s.nextInt();
    if (nilai > 0){
        System.out.println("bilangan positif");
    } else if (nilai < 0){
        System.out.println("bilangan negatif");
    } else {
        System.out.println("bilangan nol,netral,keseimbangan,tengah tengah");
    }

    }
}


