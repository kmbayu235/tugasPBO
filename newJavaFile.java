public class Kendaraan {
    // Atribut
    private String merk;
    private String tipe;
    private int kecepatan;

    // Konstruktor
    public Kendaraan(String merk, String tipe, int kecepatan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

    // Metode untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk + ", Tipe: " + tipe + ", Kecepatan: " + kecepatan + " km/jam");
    }

    // Metode untuk menambah kecepatan
    public void tambahKecepatan(int km) {
        kecepatan += km;
        System.out.println(merk + " menambah kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Metode untuk mengurangi kecepatan
    public void kurangiKecepatan(int km) {
        kecepatan -= km;
        if (kecepatan < 0) {
            kecepatan = 0;
        }
        System.out.println(merk + " mengurangi kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Metode untuk menghentikan kendaraan
    public void berhenti() {
        kecepatan = 0;
        System.out.println("Kendaraan telah berhenti.");
    }

    // Main method untuk demonstrasi
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan("Toyota", "Mobil", 60);
        kendaraan1.tampilkanInfo();
        kendaraan1.tambahKecepatan(20);
        kendaraan1.kurangiKecepatan(30);
        kendaraan1.berhenti();
        kendaraan1.tampilkanInfo();

        Kendaraan kendaraan2 = new Kendaraan("Yamaha", "Motor", 40);
        kendaraan2.tampilkanInfo();
        kendaraan2.tambahKecepatan(30);
        kendaraan2.kurangiKecepatan(40);
        kendaraan2.berhenti();
        kendaraan2.tampilkanInfo();
    }
}