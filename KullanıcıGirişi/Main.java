import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;

        Scanner kong= new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName=kong.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password=kong.nextLine();
        if (userName.equals("patika101")&& password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        }else{
            System.out.println("Yanlış Giriş Yaptınız! ");


        }

    }
}