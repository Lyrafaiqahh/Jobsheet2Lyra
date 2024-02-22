

public class Buku15 {
   
     String judul;
     String pengarang;
     int halaman;
     int stok;
     int harga;

     public Buku15(String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
     }

     void tampilInformasi (){
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

     void restock (int jml){
        stok += jml;
     }

     void gantiHarga (int hrg) {
        harga = hrg;
     }

  
    }
