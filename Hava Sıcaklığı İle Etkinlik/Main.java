import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //değişkenleri atayalım
        int celcius;
        //kullanıcıdan verileri alalım
        Scanner kong = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz : ");
        celcius= kong.nextInt();

        if (celcius<5){
            System.out.println("Kayak yapabilirsiniz");
        } else if ((celcius>=5)&&(celcius<=25)) {
            if((celcius >=5)&&(celcius<=15) ){
                System.out.println("Sinemaya gidebilirsiniz");
            }if ((celcius>=10)&&(celcius<=15)){
                System.out.println("Piknik yapmaya gidebilirsiniz");
            }
         }else{
            System.out.println("Yüzmeye gidebilirsiniz");
        }


    }
}