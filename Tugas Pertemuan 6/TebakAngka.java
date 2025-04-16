import java.util.Scanner;
import java.util.Random;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1;
        int tebakan;
        int percobaan = 0;

        System.out.println(" Selamat datang di permainan Tebak Angka!");
        System.out.println(" Saya telah memilih angka antara 1 hingga 100.");
        System.out.println(" Coba tebak atau ketik 0 untuk keluar.");

        while (true) {
            System.out.print("\nMasukkan tebakan Anda: ");
            tebakan = input.nextInt();
            percobaan++;

            if (tebakan == 0) {
                System.out.println(" Anda memilih keluar. Angka yang benar adalah: " + target);
                break;
            }

            if (tebakan < target) {
                System.out.println(" Terlalu kecil! Coba lagi.");
            } else if (tebakan > target) {
                System.out.println(" Terlalu besar! Coba lagi.");
            } else {
                System.out.println(" Selamat! Anda menebak angka dengan benar dalam " + percobaan + " percobaan.");
                break;
            }
        }

        System.out.println("\n Terima kasih telah bermain!");
        input.close();
    }
}
