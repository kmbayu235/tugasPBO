import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            // Input angka pertama
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            // Input operator
            System.out.print("Masukkan operator (+, -, *, /, %): ");
            char operator = input.next().charAt(0);

            // Input angka kedua
            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            double hasil;
            boolean valid = true;

            // Proses berdasarkan operator
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol!");
                        valid = false;
                        hasil = 0;
                    }
                    break;
                case '%':
                    if (angka2 != 0) {
                        hasil = angka1 % angka2;
                    } else {
                        System.out.println("Error: Modulo dengan nol!");
                        valid = false;
                        hasil = 0;
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid!");
                    valid = false;
                    hasil = 0;
            }

            // Menampilkan hasil jika operator valid
            if (valid) {
                System.out.println("Hasil: " + hasil);
            }

            // Tanya apakah ingin menghitung lagi
            System.out.print("Apakah ingin menghitung lagi? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terima kasih telah menggunakan kalkulator.");
        input.close();
    }
}
