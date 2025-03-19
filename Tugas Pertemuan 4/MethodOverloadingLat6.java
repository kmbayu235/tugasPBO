class Kalkulator {
    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    int tambah(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    double tambah(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingLat6 {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        System.out.println(k.tambah(5, 10));
        System.out.println(k.tambah(5, 10, 15));
        System.out.println(k.tambah(5, 10, 15, 20)); // Tambahan
        System.out.println(k.tambah(5.5, 2.5));
    }
}