abstract class Kendaraan {
    protected String nama;
    protected int jumlahRoda;

    public Kendaraan(String nama, int jumlahRoda) {
        this.nama = nama;
        this.jumlahRoda = jumlahRoda;
    }

    public void tampilkanInfo() {
        System.out.println(nama + " memiliki " + jumlahRoda + " roda.");
    }

    abstract void bergerak();
}

class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama, 4);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

class SepedaMotor extends Kendaraan {
    public SepedaMotor(String nama) {
        super(nama, 2);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

interface KendaraanListrik {
    void isiDaya();
}

class MobilListrik extends Mobil implements KendaraanListrik {
    public MobilListrik(String nama) {
        super(nama);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan motor listrik.");
    }

    @Override
    public void isiDaya() {
        System.out.println(nama + " sedang diisi daya.");
    }
}

public class latihan1pertemuan3 {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan sepedaMotor = new SepedaMotor("Honda");
        
        mobil.tampilkanInfo();
        mobil.bergerak();

        sepedaMotor.tampilkanInfo();
        sepedaMotor.bergerak();
        
        System.out.println();

        MobilListrik tesla = new MobilListrik("Tesla Model 3");
        tesla.tampilkanInfo();
        tesla.bergerak();
        tesla.isiDaya();
    }
}
