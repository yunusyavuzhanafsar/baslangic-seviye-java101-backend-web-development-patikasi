import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
homework
Aynı örneği switch-case kullanmadan yapınız.*/

        //değişkenleri atayalım
        int day,month;
        String burc ="";


        //kullanıcıdan verileri alalım
        Scanner kong =new Scanner(System.in);

       //nesnemizi oluşturalım
        System.out.print("Doğduğunuz günü giriniz : ");
        day= kong.nextInt();

        System.out.print("Doğduğunuz ayı giriniz : ");
        month = kong.nextInt();
        //burcumuzu bulalım

        if((month==1 && day<=21)||(month==12 && day >=22)){
            burc = "oğlak";
        } else if ((month==1 && day>=22)||(month==2 && day<=19)) {
            burc = "kova";
        } else if ((month==2 && day >=20)||(month==3 && day<=20)) {
            burc = "balık";
        } else if ((month ==3 && day>=21)||(month==4 && day<=20)) {
            burc = "koç";
        } else if ((month==4 && day>=21)||(month==5 && day <=21)) {
            burc = "boğa";
        } else if ((month==5 && day>=22)||(month==6 && day <=22)) {
            burc = "ikizler";
        } else if ((month==6 && day>=23)||(month==7 && day <=22)) {
            burc = "yengec";
        } else if ((month==7 && day>=23)||(month==8 && day <=22)) {
            burc = "aslan";
        } else if ((month==8 && day>=23)||(month==9 && day <=22)) {
            burc = "başak";
        } else if ((month==9 && day>=23)||(month==10 && day <=22)) {
            burc = "terazi";
        } else if ((month==10 && day>=23)||(month==11 && day <=21)) {
            burc = "akrep";
        } else if ((month==11 && day>=22)||(month==12 && day <=21)) {
            burc = "yay";
        }
        System.out.println("burcunuz : " + burc);
        if (!(month>=1 && month<=12)) {
            System.out.println("yanlış tuşlama yaptınız. Lütfen 1 ile 12 değerler arasında ay  girişi yapınız");
        } if (!(day>=1 && day<=31)){
            System.out.println(" yanlış tuşlama yaptınız.Lütfen 1 ile 31 değerler arasında giriş yapınız");
        }

        }

    }