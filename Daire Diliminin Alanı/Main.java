import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double pi = 3.14;
        double alfa;
        double r;
        double alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();
        System.out.print("alfa açısını giriniz :");
        alfa=input.nextInt();


        alan = (pi * r * r * alfa) / 360;


        System.out.println("daire diliminin alanı " + alan);
    }
}