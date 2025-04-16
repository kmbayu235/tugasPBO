import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("\nMasukkan username: ");
            username = input.nextLine();
            System.out.print("Masukkan password: ");
            password = input.nextLine();

            if (username.equals("wahyu") && password.equals("1w")) {
                System.out.println("\n Selamat datang, " + username + "!");
                input.close();
                return;
            } else {
                attempts++;
                System.out.println(" Username atau password salah! Percobaan: " + attempts + "/" + MAX_ATTEMPTS);
            }
        }

        System.out.println("\n Akun diblokir! Silakan hubungi admin.");
        input.close();
    }
}
