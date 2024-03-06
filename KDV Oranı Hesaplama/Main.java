
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran =0.18,kdvTutar,kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz : ");
        tutar = input.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("tutar :" + tutar );
        System.out.println("kdvOran : " + kdvOran);
        System.out.println("kdvliTutar : " + kdvliTutar);
        System.out.println("kdvliTutar : " + kdvliTutar);
    }
}