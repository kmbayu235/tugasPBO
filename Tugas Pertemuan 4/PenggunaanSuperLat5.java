class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    void info() {
        System.out.println("Nama hewan: " + nama);
    }

    void bermain() {
        System.out.println(nama + " sedang bermain.");
    }
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    void suara() {
        System.out.println(nama + " mengeong: Meow!");
    }
}

public class PenggunaanSuperLat5 {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kucing");
        kucing.info();
        kucing.suara();
        kucing.bermain(); // Tambahan
    }
}