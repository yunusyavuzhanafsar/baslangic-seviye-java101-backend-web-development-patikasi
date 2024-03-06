
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // degıskenleri giriniz
        int a, b;
        double c;

        // kullanıcıdan verileri alınız
        Scanner girdi = new Scanner(System.in);
        System.out.println("birinci kenarı giriniz : ");
        a = girdi.nextInt();

        System.out.println("ikinci kenarı giriniz: ");
        b = girdi.nextInt();

        c =Math.sqrt((a*a)+(b*b));
        System.out.println("hipotenus : " + c);

    }
}