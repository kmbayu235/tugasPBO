interface Kendaraan {
    void berjalan();
}

class Mobil implements Kendaraan {
    public void berjalan() {
        System.out.println("Mobil berjalan dengan roda 4.");
    }
}

class Motor implements Kendaraan {
    public void berjalan() {
        System.out.println("Motor berjalan dengan roda 2.");
    }
}

class Sepeda implements Kendaraan {
    public void berjalan() {
        System.out.println("Sepeda berjalan dengan pedal.");
    }
}

public class PolimorfismeInterfaceLat8 {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil();
        Kendaraan kendaraan2 = new Motor();
        Kendaraan kendaraan3 = new Sepeda(); // Tambahan
        
        kendaraan1.berjalan();
        kendaraan2.berjalan();
        kendaraan3.berjalan();
    }
}