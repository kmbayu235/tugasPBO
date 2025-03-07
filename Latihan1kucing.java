class Hewan {
    private String nama;
    private String jenis;
    private int umur;

    public Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + " tahun");
    }

    public void bertambahUmur(int tahun) {
        this.umur += tahun;
    }

    public void suaraHewan() {
        switch (nama) {
            case "Kucing":
                System.out.println(nama + ": Meong!");
                break;
            case "Anjing":
                System.out.println(nama + ": Guk guk!");
                break;

        }
    }

    public static void main(String[] args) {
        Hewan kucing = new Hewan("Kucing", "Mamalia", 3);
        kucing.tampilkanInfo();
        kucing.suaraHewan();

        System.out.println("\nSetelah bertambah umur:");
        kucing.bertambahUmur(2);
        kucing.tampilkanInfo();

        Hewan anjing = new Hewan("Anjing", "Mamalia", 2);
        anjing.tampilkanInfo();
        anjing.suaraHewan();

        System.out.println("\nSetelah bertambah umur:");
        anjing.bertambahUmur(2);
        anjing.tampilkanInfo();
    }
}
