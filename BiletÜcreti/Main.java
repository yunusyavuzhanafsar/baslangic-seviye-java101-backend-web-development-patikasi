import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
        ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
       Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
        yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
        şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır */

        //değişkenleri oluşturalım
        double km, tutar, toplamTutar,total,perKm=0.10;
        int age, type;

        //kullanıcıdan verileri alalım
        Scanner kong = new Scanner(System.in);

        //nesnemizi oluşturalım
        System.out.println("Mesafeyi km türünden giriniz : ");
        km = kong.nextDouble();

        System.out.println("Yaşınızı giriniz : ");
        age = kong.nextInt();

        System.out.println("Yolculuk tipini giriniz(1 => Tek yön, 2 >= Çift yön  : ");
        type = kong.nextInt();

        // orantıları hesaplayalım
        if ((km > 0) && (age > 0) && ((type == 1) || (type == 2))) {
            total = km * perKm;
            if (age < 12) {
                total = total - (total * 0.50);
            } else if (age >= 12 && age <= 24) {
                total = total - (total * 0.10);
            } else if (age > 65) {
                total = total - (total * 0.30);
            } else {
                total *= 1;
            }
            if (type == 1) {
                total *= 1;
            } else if (type == 2) {
                total = (total - (total * 0.20)) * 2;
            }
            System.out.println("Toplam Tutar :" + total);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
        }
    }






