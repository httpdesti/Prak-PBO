public class Hewan {
    private String nama;
    private String jenis;
    private int umur;

    public Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void tampil(){
        System.out.println("Nama Hewan : " + this.nama);
        System.out.println("Jenis Hewan : " + this.jenis);
        System.out.println("Umur Hewan : " + this.umur);
    }
}