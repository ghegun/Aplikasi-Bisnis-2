
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TabelPendaftar extends AbstractTableModel {

    static void setMode(List<Pengguna> listPendaftaran) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void setModel(List<Pengguna> listPendaftaran) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private List<Pendaftaran> listPendaftaran;
    private String[] columns = {"Nama Pengguna", "Username"};

    public TabelPendaftar(List<Pendaftaran> listPendaftaran) {
        this.listPendaftaran = listPendaftaran;
    }

    @Override
    public int getRowCount() {
        return listPendaftaran.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return listPendaftaran.get(rowIndex).getTxtNoPendaftaran();
            case 1: return listPendaftaran.get(rowIndex).getTxtIdPegawai();
            case 2: return listPendaftaran.get(rowIndex).getTxtNoAntrian();
            case 3: return listPendaftaran.get(rowIndex).getTxtTgl();
            case 4: return listPendaftaran.get(rowIndex).getTxtKodePasien();
            case 5: return listPendaftaran.get(rowIndex).getTxtKeluhan();
            case 6: return listPendaftaran.get(rowIndex).getTxtKodeDokter();
            case 7: return listPendaftaran.get(rowIndex).getTxtBiaya();
                       
            default: return null;
        }
    }
    
    public String getColumnName(int column) {
        return columns[column];
    }
}
