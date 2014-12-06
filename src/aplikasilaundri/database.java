/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasilaundri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author egann
 */
public class database {
    public String driver ="com.mysql.jdbc.Driver";
    public String url = "jdbc:mysql://localhost/laundri";
    public String user ="root";
    public String pass = "";
    
    public void simpan_data(laundri l) throws SQLException, ClassNotFoundException {
        Connection conn =null;
        Statement stm = null;
        
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            String sql;
            sql = "insert into isi values('"+l.getNama()+"','"+l.getNotlp()+"','"+l.getDate()+"','"+l.getAlamat()+"','"+l.getBerat()+"',"+l.getHarga()+","+l.getDiskon()+","+l.getTotal()+")";
            stm.executeUpdate(sql);
            
        } catch (Exception e) {System.out.println("Error :"+e.getMessage());}
        finally {
            try {stm.close();} catch (Exception e){}
            try {conn.close();} catch (Exception e){}
            
        }
    }
    
    public ArrayList<laundri> tampil_data() {
        ArrayList<laundri> laun = new ArrayList<laundri>();
        Connection conn = null;
        Statement stm = null;
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, pass);
            stm=conn.createStatement();
            String sql = "select * from isi";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                laun.add(new laundri(rs.getString("nama"), rs.getString("telp"), rs.getString("tanggal"), rs.getString("alamat"), rs.getString("berat"),rs.getInt("harga"), rs.getInt("diskon"), rs.getInt("total")));
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error : "+e.getMessage());
        } finally {
            try {stm.close();} catch (Exception e){};
            try {conn.close();} catch (Exception e){};
        }
        
        return laun;
    }
    
}
