import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tugasList = new ArrayList<>();

        int pilihan;

        while (true) {
            // Menu
            System.out.println("\n=== MENU TO-DO LIST ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Semua Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();
            input.nextLine(); // Bersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan tugas: ");
                    String tugas = input.nextLine();
                    tugasList.add(tugas);
                    System.out.println("Tugas ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n=== Daftar Tugas ===");
                    if (tugasList.isEmpty()) {
                        System.out.println("Belum ada tugas.");
                    } else {
                        for (int i = 0; i < tugasList.size(); i++) {
                            System.out.println((i + 1) + ". " + tugasList.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tugasList.isEmpty()) {
                        System.out.println("Tidak ada tugas untuk dihapus.");
                        break;
                    }
                    System.out.println("\nMasukkan nomor tugas yang akan dihapus:");
                    for (int i = 0; i < tugasList.size(); i++) {
                        System.out.println((i + 1) + ". " + tugasList.get(i));
                    }
                    System.out.print("Nomor tugas: ");
                    int hapus = input.nextInt();
                    input.nextLine(); // Bersihkan newline

                    if (hapus >= 1 && hapus <= tugasList.size()) {
                        tugasList.remove(hapus - 1);
                        System.out.println("Tugas berhasil dihapus.");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih! Keluar dari program.");
                    input.close();
                    return; // Keluar dari program

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}
