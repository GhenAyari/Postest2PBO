package model;

public class Hewan {
    // Properties dengan access modifier private
    private String nama;
    private String jenis;
    private String habitat;
    private float umur;

    // Constructor
    public Hewan(String nama, String jenis, String habitat, float umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.habitat = habitat;
        this.umur = umur;
    }

    public String ambilNama() {
        return nama;
    }

    public void ubahNama(String nama) {
        this.nama = nama;
    }

    public String ambilJenis() {
        return jenis;
    }

    public void ubahJenis(String jenis) {
        this.jenis = jenis;
    }

    public String ambilHabitat() {
        return habitat;
    }

    public void ubahHabitat(String habitat) {
        this.habitat = habitat;
    }

    public float ambilUmur() {
        return umur;
    }

    public void ubahUmur(float umur) {
        this.umur = umur;
    }

    // Method untuk menampilkan info hewan
    public String toString() {
        return "Nama: " + nama + " | Jenis: " + jenis + " | Habitat: " + habitat + " | Umur: " + umur + " tahun";
    }

}
