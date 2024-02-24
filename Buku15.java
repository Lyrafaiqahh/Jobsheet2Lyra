public class Buku15 {
   
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;

    public Buku15() {
    
    }
     
    public Buku15(String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    void tampilInformasi() {
        System.out.println("Judul:" + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }
        
    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            if (stok <= 0) {
                stok = 0; 
            }
            System.out.println("Berhasil!\n");
        } else {
            System.out.println("Stok tidak tersedia.");
        }
    }

    void restock(int n) {
        stok += n;
    }

    int gantiHarga(int hrg) {
        harga = hrg;
        return harga; 
    }
    
    int hitungHargaTotal(int jmlBukuTerjual) {
        return harga * jmlBukuTerjual;
    }

    int hitungDiskon(int hargaTotal) {
        int diskon = 0;
        if (hargaTotal > 150000) {
            diskon = 12; 
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 5; 
        }
        return diskon;
    }
   
    int hitungHargaBayar(int hargaTotal, double diskon) {
        int hargaBayar = (int) (hargaTotal - (hargaTotal * diskon));
        return hargaBayar;
    }    
}
