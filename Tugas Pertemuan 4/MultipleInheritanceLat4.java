interface Hewan {
    void makan();
}

interface Mamalia {
    void menyusui();
}

interface HewanPeliharaan {
    void bermain();
}

class Kucing implements Hewan, Mamalia, HewanPeliharaan {
    private String nama;

    Kucing(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println(nama + " makan ikan.");
    }

    public void menyusui() {
        System.out.println(nama + " menyusui anaknya.");
    }

    public void bermain() {
        System.out.println(nama + " bermain dengan bola.");
    }
}

public class MultipleInheritanceLat4 {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kucing");
        kucing.makan();
        kucing.menyusui();
        kucing.bermain(); // Tambahan
    }
}
