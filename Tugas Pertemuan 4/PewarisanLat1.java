class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    void suara() {
        System.out.println(nama + " mengeong: Meow!");
    }

    void bermain() {
        System.out.println(nama + " bermain bola.");
    }
}

public class PewarisanLat1 {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Tom");
	kucing1.nama = "Tom";
        kucing1.makan();
        kucing1.suara();
        kucing1.bermain();
    }
}