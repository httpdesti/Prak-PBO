public class Hewan {
    String nama, jenis;
    int umur;
    public Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    void tampil(){
        System.out.println("Nama Hewan : " + this.nama);
        System.out.println("Jenis Hewan : " + this.jenis);
        System.out.println("Umur Hewan : " + this.umur);
    }

}
