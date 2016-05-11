package Polymorfisme;
import java.util.Scanner;
public class Bab7 {
    public static void main(String[] args) {
    int urt;
    Scanner si = new Scanner(System.in);
    Member member = new Member("nana","malang",1,1);
    Pelanggan[] pelanggan = new Pelanggan[2];
    pelanggan[1]= member;
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
            member.daftar();break;
        case 2 :
            member.DaftarProduk();break;
        case 3 :
            member.cek();break;
    }
    }while(urt !=0);
        System.out.println("Terima Kasih Sudah berkunjung Ke tempat kami");
    }
}