class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow! Meow!");
    }
}

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk! Guk!");
    }
}

class Kambing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Mbekkkk!");
    }
}

public class MethodOverridingLat7 {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();
        Hewan hewan3 = new Kambing(); // Tambahan

        hewan1.bersuara();
        hewan2.bersuara();
        hewan3.bersuara(); // Tambahan
    }
}