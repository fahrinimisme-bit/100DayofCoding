    import java.util.Scanner;

    public class day78 {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("buat akun");
            System.out.print("masukkan Username   : ");
            String user = s.nextLine();
            System.out.print("masukkan password  : ");
            String pw = s.nextLine();
            System.out.println("AKUN SUDAH BERHASIL DIBUAT!");

            System.out.println("Silahkan login dengan akun yang sudah dibuat");
            boolean berhasildibuat = false;

            while (!berhasildibuat) {
                System.out.print("masukkan Username   : ");
                String userlogin = s.nextLine();
                System.out.print("masukkan password  : ");
                String pwlogin = s.nextLine();

                if (userlogin.equals(user)&& pwlogin.equals(pw)) {
                    System.out.println("Akun berhasil dibuat!");
                    berhasildibuat = true;
                }
                else{
                    System.out.println("akun gagal dibuat");
                    System.out.println("Saran : mungkin ada kesalahaan di bagian username atau password");
                }
            }


            }

            }


