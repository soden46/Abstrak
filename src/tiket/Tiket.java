/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

/**
 *
 * @author SYARIF
 */
public class Tiket {
    public String NoTiket;
    public String Harga;
    public String Tujuan;
    public String Jadwal;
    public Tiket(String NoTiket, String Harga, String Tujuan,String Jadwal){
    this.NoTiket= NoTiket;
    this.Harga=Harga;
    this.Tujuan=Tujuan;
    this.Jadwal=Jadwal;
}
}
