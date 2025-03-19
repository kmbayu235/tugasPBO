class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    void makan() {
        System.out.println(nama + " sedang makan.");
    }

    void tulis() {
        System.out.println(nama + " sedang menulis.");
    }
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    void suara() {
        System.out.println(nama + " meng Meow!");
    }
}

class KucingAnggora extends Kucing {
    KucingAnggora(String nama) {
        super(nama);
    }

    void jenis() {
        System.out.println(nama + " adalah kucing anggora.");
    }
}

public class MultilevelInheritanceLat2 {
    public static void main(String[] args) {
        KucingAnggora anggora = new KucingAnggora("Angela");
        anggora.makan();
        anggora.suara();
        anggora.jenis();
        anggora.tulis();
    }
}