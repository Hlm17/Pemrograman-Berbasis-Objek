import java.util.ArrayList;
import java.util.List;

public class PraktikPert2_Anggota {
    String nama;
    String alamat;
    String noTelepon;
    List<PraktikPert2_Buku> bukuDipinjam;

    public PraktikPert2_Anggota(String nama, String alamat, String noTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.bukuDipinjam = new ArrayList<>();
    }

    public void pinjamBuku(PraktikPert2_Buku buku) {
        if (!buku.isDipinjam) {
            buku.pinjamBuku(nama);
            bukuDipinjam.add(buku);
        } else {
            buku.pinjamBuku(nama); 
        }
    }

    public void kembalikanBuku(PraktikPert2_Buku buku) {
        if (buku.isDipinjam) {
            buku.kembalikanBuku(nama);
            bukuDipinjam.remove(buku);
        } else {
            System.out.println("- Buku " + buku.judul + " tidak sedang dipinjam oleh " + nama + ".");
        }
    }

    public void tampilNama() {
        System.out.print(nama);
    }

    public void tampilkanDetail() {
        System.out.println("------------------------------------------------------");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("No. Telepon: " + noTelepon);
        System.out.println("Buku yang dipinjam:");
        if (bukuDipinjam.isEmpty()) {
            System.out.println("Belum ada buku yang dipinjam.");
        } else {
            for (PraktikPert2_Buku buku : bukuDipinjam) {
                System.out.println("- " + buku.judul);
            }
        }
        System.out.println("------------------------------------------------------");
    }
}
