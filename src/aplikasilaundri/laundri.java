/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasilaundri;

/**
 *
 * @author egann
 */
public class laundri {
    private String Nama;
    private String NoTlp;
    private String Date;
    private String Alamat;
    private String Berat;
    private int Harga;
    private int Diskon;
    private int Total;
    
    public void setNama(String nama) { Nama=nama; }
    public void setNotlp(String notlp) { NoTlp=notlp; }
    public void setDate(String date) { Date=date; }
    public void setAlamat(String alamat) { Alamat=alamat; }
    public void setBerat(String berat) { Berat=berat; }
    public void setHarga(int harga) { Harga=harga; }
    public void setDiskon(int diskon) { Diskon=diskon; }
    public void setTotal(int total) { Total=total; }
    
    public String getNama() {return Nama;}
    public String getNotlp() {return NoTlp;}
    public String getDate() {return Date;}
    public String getAlamat() {return Alamat;}
    public String getBerat() {return Berat;}
    public int getHarga() {return Harga;}
    public int getDiskon() {return Diskon;}
    public int getTotal() {return Total;}
    
    public laundri( String nama, String notlp, String date, String alamat, String berat, int harga, int diskon, int total) {
        setNama(nama);
        setAlamat(alamat);
        setNotlp(notlp);
        setDate(date);
        setBerat(berat);
        setHarga(harga);
        setDiskon(diskon);
        setTotal(total);
    }
}
