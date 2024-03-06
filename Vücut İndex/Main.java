import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kg,m,vücudindex;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu(metre cinsinde) giriniz :");
        m=input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg=input.nextDouble();

        vücudindex = kg / (m * m);
        System.out.println("indexiniz : " + vücudindex);




    }
}