import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz : " );
        n1= input.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("seçiminiz : ");
        select= input.nextInt();

        System.out.print(select);
        if (select==1) {
            System.out.println("toplama işleminin sonucu : " + (n1 + n2));
        }else if (select==2) {
            System.out.println("çıkarma işleminin sonucu : " + (n1 - n2));
        } else if (select==3 ) {
            System.out.println("çarpma işleminin sonucu : " + (n1 * n2));
        } else if (select==4) {
            if (n2 != 0) {
                System.out.println("bölme işleminin sonucu : " + (n1 / n2));
            } else {
                System.out.println("sayı bölünemez : ");
            }
        }else{
            System.out.println("yanlış tuşlama yaptınız! : ");
        }
    }

}