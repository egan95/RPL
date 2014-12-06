/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasilaundri;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author egann
 */
public class laundriTableModel extends AbstractTableModel{
    
    private ArrayList<laundri> data;
    public void setData(ArrayList<laundri> data) {
        this.data=data;
    }
    
    private String[] kolom ={"Nama","No.Telpon","Tanggal","Alamat","Berat","Harga","Diskon","Total"};

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        laundri l = data.get(baris);
        switch(kolom) {
            case 0 : return l.getNama();
            case 1 : return l.getNotlp();
            case 2 : return l.getDate();
            case 3 : return l.getAlamat();
            case 4 : return l.getBerat();
            case 5 : return l.getHarga();
            case 6 : return l.getDiskon();
            case 7 : return l.getTotal();
            default: return null;
                
        }
    }
    
     public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return kolom[column];
	}
    
}
