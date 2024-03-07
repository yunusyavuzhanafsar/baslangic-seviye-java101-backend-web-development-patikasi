import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*-Çin Zodyağı nasıl hesaplanır?-
Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun*/

        // değişkenleri tanıyalım
        double birthyear, kalansayı;
        String burc = "";
        //kullacıdan verileri alalım
        Scanner kong = new Scanner(System.in);
        System.out.println("Doğum tarıhınızı giriniz : ");
        birthyear = kong.nextDouble();

        kalansayı = (birthyear) % 12;

        if (kalansayı == 0) ;
        {
            burc = "maymun";
        }
        if (kalansayı == 1) {
            burc = "horoz";

        } else if (kalansayı == 2) {
            burc = "köpek";

        } else if (kalansayı == 3) {
            burc = "domuz";

        } else if (kalansayı == 4) {
            burc = "fare";

        } else if (kalansayı == 5) {
            burc = "öküz";

        } else if (kalansayı == 6) {
            burc = "kaplan";

        } else if (kalansayı == 7) {
            burc = "tavşan";

        } else if (kalansayı == 8) {
            burc = "ejderha";

        } else if (kalansayı == 9) {
            burc = "yılan";

        } else if (kalansayı == 10) {
            burc = "at";

        } else if (kalansayı == 11) {
            burc = "koyun";

        }
        System.out.println("Çin Zodağı Burcunuz : " + burc);



        }
    }












