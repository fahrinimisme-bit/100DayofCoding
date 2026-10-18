import java.util.*;

public class day47 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
      System.out.print("masukkan hari ke \t= ");
      int hariKe = a.nextInt();
      String hari;
      switch(hariKe){
            case 1 : 
                hari = "senin";
                break;
            case 2 : 
                hari = "selasa";
                break;
            case 3 : 
                hari = "rabu";
                break;
            case 4 : 
                hari = "kamis";
                break;
            case 5 : 
                hari = "jumat";
                break;
            case 6 : 
                hari = "sabtu";
                break;
            case 7 : 
                hari = "ahad";
                break;
                default : 
                hari = "hari ke nya tidak valid";
      
    }
    System.out.printf("hari %s" , hari);
}
}
