public abstract class JenisHewan {
    private String nama;
    private String habitat;

    public JenisHewan(String nama, String habitat) {
        this.nama = nama;
        this.habitat = habitat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract void makan(); // Metode makan menjadi abstrak
}