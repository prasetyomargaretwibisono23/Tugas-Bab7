package Polymorfisme;
import java.util.Scanner;
public class Bab7 {
    public static void main(String[] args) {
    int urt;
    Scanner si = new Scanner(System.in);
    Silver silver = new Silver("nana","malang",1);
    Gold gold = new Gold("riri","lawang",2);
    Premium premium = new Premium("sendy","singosari",3);
    Pelanggan[] pelanggan = new Pelanggan[4];
    silver.pelangan(10);
    pelanggan[1]= silver;
    pelanggan[2]= premium;
    pelanggan[3]= gold;
    do{
        System.out.println("Salon");
        System.out.println("1.lihat daftar harga");
        System.out.println("2.Pesan produk");
        System.out.println("3.Cek Pesanan");
        System.out.println("0.Keluar");
        System.out.println("Masukkan urutan : ");
        urt=si.nextInt();
        switch(urt){
        case 1 :
            silver.daftar();break;
        case 2 :
            silver.DaftarProduk();break;
        case 3 :
            silver.cek();
            premium.cek();
            gold.cek();
    }
    }while(urt !=0);
        System.out.println("Terima Kasih Sudah berkunjung Ke tempat kami");
    }
}