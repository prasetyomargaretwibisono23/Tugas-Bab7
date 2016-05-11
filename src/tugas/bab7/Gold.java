/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorfisme;

import java.util.Scanner;

/**
 *
 * @author Prasetyo
 */
public class Gold extends Pelanggan{
public int hasil;
public int diskon = 15;
public int Diskonbarang = 10;
public int barang;
public String pilih;
Scanner in = new Scanner(System.in);
public Gold(){

}
    public void pelangan(int diskon){
        this.diskon=diskon;
    }
    public void Hargabarang(int barang){
        hasil = Diskonbarang/barang;
    }
    public void DaftarProduk() {
        do{
        System.out.println("Daftar Produk");
        System.out.println("Nama Produk     Harga");
        System.out.println("1.Sampo       Rp.5.000");
        System.out.println("2.Cream       Rp.10.000");
        System.out.println("3.Pelembab    Rp.15.000");
        System.out.println("4.Sabun       Rp.10.000");
        System.out.println("5.Masker      Rp.20.000");
        System.out.println("6.Lipstik     Rp.25.000");
        System.out.println("0.Kembali");
        System.out.println("Masukkan urutan barang yang dibeli : ");
        urutan = in.nextInt();
        switch (urutan) {
             case 1:
                System.out.println("Yang anda dipiih, 1.Sampo       Rp.5.000");
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
                System.out.println("Yang anda dipiih, 2.Cream       Rp.10.000");
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
                System.out.println("Yang anda dipiih, 3.Pelembab    Rp.15.000");
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
                System.out.println("Yang anda dipiih, 4.Sabun       Rp.10.000");
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
                System.out.println("Yang anda dipiih, 6.Lipstik     Rp.25.000");
                System.out.println("Anda punya member (ya/tdk): ");
                pilih = in.nextLine();
                if(pilih == "ya"){
                    tol= 25000/10;
                    Hargabarang(tol);
                }else
                    tol= 25000;
                    System.out.println("Hasil : "+tol);
                break;
            }
        }while(urutan  != 0);
    }
}

