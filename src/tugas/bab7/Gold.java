package Polymorfisme;
import java.util.Scanner;
public class Gold extends Pelanggan{
private int hasil;
private int diskon = 15;
private int Diskonbarang = 10;
private int barang;
private String pilih;
private String nama;
private String Alamat;
private int no;
Scanner in = new Scanner(System.in);
public Gold(String nama,String Alamat,int no){
        super(nama,Alamat,no);
        }
@Override
    public String Getnama(){
    return nama;
    }
@Override
    public String GetAlamat(){
    return Alamat; 
    }
@Override
    public int no(){
    return no;
    }
    public void pelangan(int diskon){
        this.diskon=diskon;
    }
    public void Hargabarang(int barang){
        hasil = Diskonbarang/barang;
    }
    public void DaftarProduk() {
        do{
        System.out.println("Masukkan urutan barang yang dibeli : ");
        urutan = in.nextInt();
        switch (urutan) {
             case 1:
                System.out.println("Yang anda dipiih, 1.Cuci Rambut    Rp.5.000");
                System.out.println("Anda punya member (ya/tdk): ");
                pilih = in.nextLine();
                if(pilih == "ya"){
                    tol= 5000/10;
                    Hargabarang(tol);
                }else
                    tol= 5000;
                    System.out.println("Hasil : "+tol);
                break;
            case 2:
                System.out.println("Yang anda dipiih, 2.Potong Rambut  Rp.10.000");
                System.out.println("Anda punya member (ya/tdk): ");
                pilih = in.nextLine();
                if(pilih == "ya"){
                    tol= 10000/10;
                    Hargabarang(tol);
                }else
                    tol= 10000;
                    System.out.println("Hasil : "+tol);
                break;
            case 3:
                System.out.println("Yang anda dipiih, 3.Lulur          Rp.15.000");
                System.out.println("Anda punya member (ya/tdk): ");
                pilih = in.nextLine();
                if(pilih == "ya"){
                    tol= 15000/10;
                    Hargabarang(tol);
                }else
                    tol= 15000;
                    System.out.println("Hasil : "+tol);
                break;
            case 4:
                System.out.println("Yang anda dipiih, 4.Warna Rambut   Rp.10.000");
                System.out.println("Anda punya member (ya/tdk): ");
                pilih = in.nextLine();
                if(pilih == "ya"){
                    tol= 10000/10;
                }else
                    tol= 10000;
                    System.out.println("Hasil : "+tol);
                break;
            case 5:
                System.out.println("Yang anda dipiih, 5.Masker      Rp.20.000");
                System.out.println("Anda punya member (ya/tdk): ");
                pilih = in.nextLine();
                if(pilih == "ya"){
                    tol= 20000/10;
                    Hargabarang(tol);
                }else
                    tol= 20000;
                    System.out.println("Hasil : "+tol);
                break;
            case 6:
                System.out.println("Yang anda dipiih, 6.Perawatan      Rp.25.000");
                System.out.println("Anda punya member (ya/tdk): ");
                pilih = in.nextLine();
                if(pilih == "ya"){
                    tol= 25000/10;
                    Hargabarang(tol);
                }else{
                    tol= 25000;
                    System.out.println("Hasil : "+tol);
                }break;
            }
        }while(urutan  != 0);
    }
    public void cek(){
        System.out.println("Nama   : "+nama);
        System.out.println("Alamat : "+Alamat);
        System.out.println("No Urut: "+no);
        System.out.println("Barang yang dibeli "+tol);
    }
@Override
    public int Pelanggan(){
    return no; 
    }
}

