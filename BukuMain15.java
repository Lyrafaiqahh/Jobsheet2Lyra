public class BukuMain15 {
    public static void main(String[] args) {
        Buku15 bk1 = new Buku15(); 
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        
        // belom di rubah
        bk1.tampilInformasi();
        // di rubah 
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

    }
}