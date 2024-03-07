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
        int day, month;
        String burc = "";
        boolean isError = false;


        //kullanıcıdan verileri alalım
        Scanner kong = new Scanner(System.in);

        //nesnemizi oluşturalım
        System.out.print("Doğduğunuz günü giriniz : ");
        day = kong.nextInt();

        System.out.print("Doğduğunuz ayı giriniz : ");
        month = kong.nextInt();
        //burcumuzu bulalım
        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "oğlak";
                    } else {
                        burc = "kova";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 21) {
                        burc = "kova";
                    } else {
                        burc = "balık";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }
            if ((isError)){
                System.out.println("hatalı giriş yaptınız");
            }else{
                System.out.println("burcunuz : " + burc );
            }

                        }




                    }





