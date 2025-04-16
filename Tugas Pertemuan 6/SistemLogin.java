import java.util.Scanner;

public class SistemLogin {
    public static void main(String[] args) {
        // Data login yang benar
        String correctUsername = "bayu";
        String correctPassword = "123456";

        Scanner input = new Scanner(System.in);

        int attempts = 0;
        boolean loginSukses = false;

        while (attempts < 3) {
            System.out.print("Masukkan username: ");
            String username = input.nextLine();

            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Selamat datang, " + username + "!");
                loginSukses = true;
                break;
            } else {
                attempts++;
                System.out.println("Username atau password salah. Percobaan ke-" + attempts);
            }
        }

        if (!loginSukses) {
            System.out.println("Akun diblokir!");
        }

        input.close();
    }
}
