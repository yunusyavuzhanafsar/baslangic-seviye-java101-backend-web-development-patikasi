import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km ;
        double perKm= 2.20 ,baslangıc =10,total;

        Scanner input= new Scanner(System.in);

        System.out.println("Gidilecek mesafeyi yazınız");

        km=input.nextInt();

        total= perKm * km;
        total+=baslangıc;
        total= (total<20) ? 20  :total ;
        System.out.println("toplam tutar "+ total);
    }
}