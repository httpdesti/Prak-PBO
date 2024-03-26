public class Habitat extends JenisHewan {
    private String tipeHabitat;

    public Habitat(String nama, String habitat, String tipeHabitat) {
        super(nama, habitat);
        this.tipeHabitat = tipeHabitat;
    }

    public String getTipeHabitat() {
        return tipeHabitat;
    }

    public void setTipeHabitat(String tipeHabitat) {
        this.tipeHabitat = tipeHabitat;
    }
}