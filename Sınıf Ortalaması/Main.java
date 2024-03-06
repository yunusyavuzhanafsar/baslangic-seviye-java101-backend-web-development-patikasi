import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenleri tanımlayalım
        int mat, fizik, kimya, biyoloji, müzik;

        //kullanıcıdan veri alalım
        Scanner kong = new Scanner(System.in);
        System.out.print("mat notunuz : ");
        mat = kong.nextInt();


        System.out.print("fizik notunuz : ");
        fizik = kong.nextInt();

        System.out.print("kimya notunuz : ");
        kimya = kong.nextInt();

        System.out.print("biyoloji notunuz : ");
        biyoloji = kong.nextInt();

        System.out.print("müzik notunuz : ");
        müzik = kong.nextInt();
        if (mat<0||mat>100||fizik<0 || fizik>100|| kimya>0||kimya<100||biyoloji<0||biyoloji>100||müzik>0||müzik>100){
            System.out.println("Yanlış giriş yaptınız.0-100 arası değerler giriniz");
        }else {


            double ortalama = (mat + fizik + kimya + biyoloji + müzik) / 5;

            if (ortalama <= 55) {
                System.out.println("Sınıfı geçemediniz.Seneye görüşürüz");
            } else
                System.out.println("Sınıfı geçtiniz");
            System.out.println("Ortalamanız : " + ortalama);
        }
    }
}