public class Pegawai {
    public String nip;
    public String nama;
    public String divisi;

    public Pegawai(String nip, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }

    @Override
    public String toString() {
        return
                "(nip='" + nip + '\'' +
                ", nama='" + nama + '\'' +
                ", divisi='" + divisi + '\'' +
                ")";
    }
}
