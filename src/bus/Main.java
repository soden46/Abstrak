/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;
import penumpang.Penumpang;
import petugas.Petugas;
import tiket.Tiket;


/**
 *
 * @author SYARIF
 */
public class Main {
static Penumpang Penumpang;
static Petugas Petugas;
static Tiket Tiket;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Penumpang = new Penumpang("001","syarif");
    System.out.println("Data Penumpang");
    System.out.println("No Tiket = " +Penumpang.NoTiket);
    System.out.println("Nama Penumpang = " +Penumpang.NamaPenumpang);

    Petugas = new Petugas("001","kens");
    System.out.println("Data Agen");
    System.out.println("ID Petugas = " +Petugas.IDPetugas);
    System.out.println("Nama Penumpang = " +Petugas.NamaPetugas);
    
    Tiket = new Tiket("001","Rp.450.000","Jogja","08/10/20");
    System.out.println("Data Tiket");
    System.out.println("No Tiket = " +Tiket.NoTiket);
    System.out.println("Tujuan = " +Tiket.Tujuan);
    System.out.println("Harag = " +Tiket.Harga);
    System.out.println("Jadwal = " +Tiket.Jadwal);
    }
}