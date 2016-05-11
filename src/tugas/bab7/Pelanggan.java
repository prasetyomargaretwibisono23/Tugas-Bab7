package Polymorfisme;
import java.util.Scanner;
public abstract class Pelanggan {
    public String nama;
    public String Alamat;
    public int no;
    public String pilih;
    Scanner in = new Scanner(System.in);
    public Pelanggan(String nama,String Alamat,int no){
        this.Alamat = Alamat;
        this.nama = nama;
        this.no = no;
    }
    public String Getnama(){
    return nama;
    }
    public String GetAlamat(){
    return Alamat; 
    }
    public int no(){
    return no;
    }
    public void daftar(){    
    System.out.println("===== Daftar Produk =====");
    System.out.println("Nama Produk       Harga");
    System.out.println("1.Cuci Rambut    Rp.5.000");
    System.out.println("2.Potong Rambut  Rp.10.000");
    System.out.println("3.Lulur          Rp.15.000");
    System.out.println("4.Warna Rambut   Rp.10.000");
    System.out.println("5.Masker         Rp.20.000");
    System.out.println("6.Perawatan      Rp.25.000");
    System.out.println("0.Kembali");
    System.out.println("==========================");
    }
    public abstract int Pelanggan();
}