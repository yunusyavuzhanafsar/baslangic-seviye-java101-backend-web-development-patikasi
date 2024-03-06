
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // degişkenleri oluştur
        int mat ,fizik ,kimya ,biyoloji, turkce,muzik;

        // scanner sınıfımız tamamladık
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan değeri al
        System.out.print("mat notunuz : ");
        mat = inp.nextInt();

        System.out.print("kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("fizik notunuz : ");
        fizik= inp.nextInt();

        System.out.print("biyoloji notunuz : " );
        biyoloji= inp.nextInt();

        System.out.print("turkce notunuz : ");
        turkce = inp.nextInt();

        System.out.print("muzik notunuz : ");
        muzik = inp.nextInt();

        double result = (mat+fizik+kimya+biyoloji+turkce+muzik);

        System.out.println("Ortalamanız :" + result);


        boolean compare = result >= 60;

        String str = compare ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
        System.out.println(str);





    }
}