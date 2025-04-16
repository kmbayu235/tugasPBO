import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int angkaRahasia = random.nextInt(100) + 1; // Angka antara 1-100
        int tebakan;
        int percobaan = 0;

        System.out.println("=== Permainan Tebak Angka ===");
        System.out.println("Tebak angka antara 1 hingga 100.");
        System.out.println("Ketik 0 jika ingin keluar.");

        while (true) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();

            if (tebakan == 0) {
                System.out.println("Permainan dihentikan. Angka yang benar adalah: " + angkaRahasia);
                break;
            }

            percobaan++;

            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil!");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar!");
            } else {
                System.out.println("Selamat! Anda menebak dengan benar.");
                System.out.println("Jumlah percobaan: " + percobaan);
                break;
            }
        }

        input.close();
    }
}
