import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değerlerimizi girelim
        int year;

        //kullanıcıdan verilerimizi alalım
        Scanner kong =new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        year = kong.nextInt();

        //koşul bloklarımızı oluşturalım
        if (year%4==0 && year%100!=0) {
            System.out.println(year+"\tbir artık yıldır !");
        }else if (year%400==0 && year%100==0) {
            System.out.println(year+"\tbir artık yıldır ! ");
        }else{
            System.out.println(year+"\tbir artık yıl değildir !");
        }







    }
}



