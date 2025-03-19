class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    void makan() {
        System.out.println(nama + " sedang makan.");
    }

    void berlari() {
        System.out.println(nama + " sedang berlari.");
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

class Anjing extends Hewan {
    Anjing(String nama) {
        super(nama);
    }

    void suara() {
        System.out.println(nama + " menggonggong: Guk! Guk!");
    }
}

public class HierarchicalInheritanceLat3 {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Inui");
        Anjing anjing1 = new Anjing("Saiba");

        kucing1.makan();
        kucing1.suara();
        kucing1.berlari(); // Tambahan

        anjing1.makan();
        anjing1.suara();
        anjing1.berlari(); // Tambahan
    }
}