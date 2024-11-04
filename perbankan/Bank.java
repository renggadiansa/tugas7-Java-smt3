package perbankan;

public class Bank {
    private final Nasabah[] nasabah;
    private int jumlahNasabah;

    public Bank() {
        nasabah = new Nasabah[100];
        jumlahNasabah = 0;
    }

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        Nasabah nasabahBaru = new Nasabah(namaAwal, namaAkhir);
        nasabah[jumlahNasabah] = nasabahBaru;
        jumlahNasabah++;
    }

    public int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        if (indeks >= 0 && indeks < jumlahNasabah) {
            return nasabah[indeks];
        }
        return null;
    }
}
