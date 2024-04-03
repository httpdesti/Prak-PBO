public class Hewan {
    private String nama;
    private int umur;
    private String jenisKelamin;
    private JenisHewan jenisHewan;

    public Hewan(String nama, int umur, String jenisKelamin, JenisHewan jenisHewan) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.jenisHewan = jenisHewan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public JenisHewan getJenisHewan() {
        return jenisHewan;
    }

    public void setJenisHewan(JenisHewan jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public void tampil() {
        System.out.println("Nama Hewan : " + this.nama);
        System.out.println("Umur Hewan : " + this.umur);
        System.out.println("Jenis Kelamin : " + this.jenisKelamin);
        System.out.println("Jenis Hewan : " + jenisHewan.getNama());
        System.out.println("Habitat : " + jenisHewan.getHabitat());
    }

    public void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

class Anjing extends Hewan {
    public Anjing(String nama, int umur, String jenisKelamin, JenisHewan jenisHewan) {
        super(nama, umur, jenisKelamin, jenisHewan);
    }

    @Override
    public void makan() {
        System.out.println("Anjing sedang makan tulang.");
    }
}

class Kucing extends Hewan {
    public Kucing(String nama, int umur, String jenisKelamin, JenisHewan jenisHewan) {
        super(nama, umur, jenisKelamin, jenisHewan);
    }

    @Override
    public void makan() {
        System.out.println("Kucing sedang makan ikan.");
    }
}

class Burung extends Hewan {
    public Burung(String nama, int umur, String jenisKelamin, JenisHewan jenisHewan) {
        super(nama, umur, jenisKelamin, jenisHewan);
    }

    @Override
    public void makan() {
        System.out.println("Burung sedang makan biji-bijian.");
    }
}