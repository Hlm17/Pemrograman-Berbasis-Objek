public class PraktikPert2_Buku {
    String judul;
    String pengarang;
    int tahunTerbit;
    boolean isDipinjam;
    String peminjam;

    public PraktikPert2_Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.isDipinjam = false;
        this.peminjam = null;
    }

    public void pinjamBuku(String namaAnggota) {
        if (!isDipinjam) {
            isDipinjam = true;
            peminjam = namaAnggota;
            System.out.println("- "+ namaAnggota + " berhasil meminjam buku: " + judul);
        } else {
            System.out.println("- Buku " + judul + " tidak tersedia karena sedang dipinjam oleh " + peminjam + ".");
        }
    }

    public void kembalikanBuku(String namaAnggota) {
        if (isDipinjam) {
            if (peminjam.equals(namaAnggota)) {
                isDipinjam = false;
                peminjam = null;
                System.out.println("- Buku " + judul + " berhasil dikembalikan.");
            } else {
                System.out.println("- Buku sedang tidak dipinjam oleh "+ namaAnggota);
            }
        } else {
            System.out.println("- Buku " + judul + " tidak sedang dipinjam.");
        }
    }

    public void tampilkanDetail() {
        String status = isDipinjam ? "Sedang dipinjam" : "Tersedia";
        System.out.println("------------------------------------------------------");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + status);
        System.out.println("------------------------------------------------------");
    }


}