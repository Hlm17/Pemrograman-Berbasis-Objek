public class PraktikPert2_Main {
    public static void main(String[] args) {
        PraktikPert2_Buku buku1 = new PraktikPert2_Buku("Hujan", "Tere Liye", 2020);
        PraktikPert2_Buku buku2 = new PraktikPert2_Buku("Bumi", "Tere Liye", 2019);
        PraktikPert2_Buku buku3 = new PraktikPert2_Buku("Bulan", "Tere Liye", 2018);
        PraktikPert2_Buku buku4 = new PraktikPert2_Buku("Matahari", "Tere Liye", 2021);

        PraktikPert2_Anggota anggota1 = new PraktikPert2_Anggota("Hilmi", "Jl. Mer, Sby", "081234567890");
        PraktikPert2_Anggota anggota2 = new PraktikPert2_Anggota("Pasha", "Tandes, Sby", "082345678901");
        PraktikPert2_Anggota anggota3 = new PraktikPert2_Anggota("Hafizh", "Disitu, Sidoarjo", "081berapagitu");
        
        System.out.print("=== ");
        anggota1.tampilNama();
        System.out.println(" meminjam lebih dari satu buku ===");
        anggota1.pinjamBuku(buku1);
        anggota1.pinjamBuku(buku2);
        anggota1.tampilkanDetail();

        System.out.print("=== ");
        anggota2.tampilNama();
        System.out.println(" mencoba meminjam buku yang tidak tersedia ===");
        anggota2.pinjamBuku(buku1);
        anggota2.tampilkanDetail();
        
        System.out.print("=== ");
        anggota1.tampilNama();
        System.out.println(" mencoba mengembalikkan buku yang dipinjam ===");
        anggota1.kembalikanBuku(buku1);
        
        System.out.print("=== ");
        anggota3.tampilNama();
        System.out.println(" mencoba meminjam semua buku  ===");
        anggota3.pinjamBuku(buku1);
        anggota3.pinjamBuku(buku2);
        anggota3.pinjamBuku(buku3);
        anggota3.pinjamBuku(buku4);
        anggota3.tampilkanDetail();

        System.out.print("=== ");
        anggota3.tampilNama();
        System.out.println(" mencoba mengembalikkan buku yang TIDAK dipinjam ===");
        anggota3.kembalikanBuku(buku2);
    }
}
