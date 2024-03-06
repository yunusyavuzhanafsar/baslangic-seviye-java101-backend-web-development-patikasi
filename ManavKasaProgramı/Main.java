import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut= 2.14,elma= 3.67,domates= 1.11,muz= 0.95,patlıcan= 5.00,tutar;

        Scanner input = new Scanner(System.in);

        System.out.print("armut kaç kilo : ");
        armut= input.nextDouble();

        System.out.print("elma kaç kilo : ");
        elma= input.nextDouble();

        System.out.print("domates kaç kilo : ");
        domates= input.nextDouble();

        System.out.print("muz kaç kilo : ");
        muz = input.nextDouble();

        System.out.print("patlıcan kaç kilo :");
        patlıcan = input.nextDouble();



        tutar=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5.00);

        System.out.print("ödemeniz gereken tutar : " + tutar);
    }
}