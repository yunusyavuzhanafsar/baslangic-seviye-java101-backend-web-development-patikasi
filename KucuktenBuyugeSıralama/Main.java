import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız */
        int x,y,z;
        //değişkenleri atayalım

        //kullanıcıdan verilerimizi alalım
        Scanner kong= new Scanner(System.in);
        System.out.print("x değerini yazınız : ");
        x = kong.nextInt();

        System.out.print("y değerini yazınız : ");
        y = kong.nextInt();

        System.out.print("z değerini yazınız : ");
        z= kong.nextInt();
        //karşılaştırma yapınız

        if(x<y && x<z) {
            if (y < z) {
                System.out.println("x<y<z");
            } else {
                System.out.println("x<z<y");
            }
        } else if (y<x && y<z) {
            if (x < z) {
                System.out.println("y<x<z");
            } else {
                System.out.println("y<z<x");
            }
        }
            else{
                if (x<y) {
                    System.out.println("z<x<y");
                }else{
                    System.out.println("z<y<x");
                    }
                }

        }
    }


