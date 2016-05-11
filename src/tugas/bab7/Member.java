package Polymorfisme;
import java.util.Scanner;
public class Member extends Pelanggan{
private int hasil;
private String pilih;
private String nama;
private String Alamat;
private int urutan;
private int tol;
private int no;
private int h;
private int y;
private int member;
private int to;
private int total;
private int mem;
Scanner in = new Scanner(System.in);
public Member(String nama,String Alamat,int no,int member){
        super(nama,Alamat,no,member);
        this.Alamat = Alamat;
        this.nama = nama;
        this.no = no;
        this.member=member;
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
    public void DaftarProduk() {
        do{
        System.out.println("Masukkan urutan barang yang dibeli : ");
        urutan = in.nextInt();
        switch (urutan) {
            case 1:
                System.out.println("Yang anda dipiih, 1.Cuci Rambut    Rp.5.000");
                System.out.println("Member");
                System.out.println("1.Member");
                System.out.println("2.Bukan Member");
                System.out.print("Masukan urutan member yang anda punya = ");
                mem = in.nextInt();
                if(mem == 1){
                    tol= 5000*10/100;
                    h+= 5000 - tol;
                    System.out.println("Hasil : "+h);
                }else if(mem == 2){
                    h+= 5000;
                    System.out.println("Hasil : "+h);
                }else
                    System.out.println("Urutan yang anda masukkan salah !!!");
                break;
            case 2:
                System.out.println("Yang anda dipiih, 2.Potong Rambut  Rp.10.000");
                System.out.println("Member");
                System.out.println("1.Member");
                System.out.println("2.Bukan Member");
                System.out.print("Masukan urutan member yang anda punya = ");
                mem = in.nextInt();
                if(mem == 1){
                    tol= 10000*10/100;
                    h+= 10000 - tol;
                    System.out.println("Hasil : "+h);
                }else if(mem == 2){
                    h+= 5000;
                    System.out.println("Hasil : "+h);
                }else
                    System.out.println("Urutan yang anda masukkan salah !!!");
                break;
            case 3:
                System.out.println("Yang anda dipiih, 3.Lulur          Rp.15.000");
                System.out.println("Member");
                System.out.println("1.Member");
                System.out.println("2.Bukan Member");
                System.out.print("Masukan urutan member yang anda punya = ");
                mem = in.nextInt();
                if(mem == 1){
                    tol= 5000*10/100;
                    h+= 5000 - tol;
                    System.out.println("Hasil : "+h);
                }else if(mem == 2){
                    h+= 5000;
                    System.out.println("Hasil : "+h);
                }else
                    System.out.println("Urutan yang anda masukkan salah !!!");
                break;
            case 4:
                System.out.println("Yang anda dipiih, 4.Warna Rambut   Rp.10.000");
                System.out.println("Member");
                System.out.println("1.Member");
                System.out.println("2.Bukan Member");
                System.out.print("Masukan urutan member yang anda punya = ");
                mem = in.nextInt();
                if(mem == 1){
                    tol= 5000*10/100;
                    h+= 5000 - tol;
                    System.out.println("Hasil : "+h);
                }else if(mem == 2){
                    h+= 5000;
                    System.out.println("Hasil : "+h);
                }else
                    System.out.println("Urutan yang anda masukkan salah !!!");
                break;
            case 5:
                System.out.println("Yang anda dipiih, 5.Masker      Rp.20.000");
                System.out.println("Member");
                System.out.println("1.Member");
                System.out.println("2.Bukan Member");
                System.out.print("Masukan urutan member yang anda punya = ");
                mem = in.nextInt();
                if(mem == 1){
                    tol= 5000*10/100;
                    h+= 5000 - tol;
                    System.out.println("Hasil : "+h);
                }else if(mem == 2){
                    h+= 5000;
                    System.out.println("Hasil : "+h);
                }else
                    System.out.println("Urutan yang anda masukkan salah !!!");
                break;
            case 6:
                System.out.println("Yang anda dipiih, 6.Perawatan      Rp.25.000");
                System.out.println("Member");
                System.out.println("1.Member");
                System.out.println("2.Bukan Member");
                System.out.print("Masukan urutan member yang anda punya = ");
                mem = in.nextInt();
                if(mem == 1){
                    tol= 5000*10/100;
                    h+= 5000 - tol;
                    System.out.println("Hasil : "+h);
                }else if(mem == 2){
                    h+= 5000;
                    System.out.println("Hasil : "+h);
                }else
                    System.out.println("Urutan yang anda masukkan salah !!!");
                break;
                }
        }while(urutan  != 0);
        System.out.println("Apa anda yakin keluar !!! (ya/tdk) = ");
        boolean i = in.hasNextBoolean();
    }
    public void total(int member){
         System.out.println("Member");
         System.out.println("1.Premium");
         System.out.println("2.Gold");
         System.out.println("3.Silver");
         System.out.println("4.Bukan Member");
         System.out.println("Masukkan urutan = ");
         member = in.nextInt();
         if (member == 1){
         total = h * 20/100;
         to = h - total;         
         }else if (member == 2){
         total = h * 15/100;
         to = h - total;
         }else if (member == 3){
         total = h * 10/100;
         to = h - total;
         }else{
         to = h;
         }    
     }
    public void cek(){
        System.out.println("Nama   : "+nama);
        System.out.println("Alamat : "+Alamat);
        System.out.println("No Urut: "+no);
        System.out.println("Harga  : "+to);
    }
@Override
     public int Pelanggan(){
     return no; 
    }
}