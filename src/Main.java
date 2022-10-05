import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = scanner.nextLine();

        System.out.print("Şifreniz: ");
        password = scanner.nextLine();

        if (userName.equals("patika") && password.equals("java")) {
            System.out.println("Başarıyla giriş yaptınız.");
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış.");
        }
    }
}