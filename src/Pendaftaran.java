
import java.util.logging.Logger;

public class Pendaftaran {
    private String TxtNoPendaftaran;
    private String TxtIdPegawai;
    private String TxtNoAntrian;
    private String TxtTgl;
    private boolean Bulan;
    private boolean Tahun;
    private String TxtKodePasien;
    private String TxtKeluhan;
    private String TxtKodeDokter;
    private String TxtBiaya;
    private static final Logger LOG = Logger.getLogger(Pendaftaran.class.getName());
    
    
    public Pendaftaran(String TxtNoPendaftaran, String TxtIdPegawai, String TxtNoAntrian, String TxtTgl, String TxtKodePasien, String TxtKeluhan, String TxtKodeDokter, String TxtBiaya) {
        this.TxtNoPendaftaran = TxtNoPendaftaran;
        this.TxtIdPegawai = TxtIdPegawai;
        this.TxtNoAntrian = TxtNoAntrian;
        this.TxtTgl = TxtTgl;
        this.TxtKodePasien = TxtKodePasien;
        this.TxtKeluhan = TxtKeluhan;
        this.TxtKodeDokter = TxtKodeDokter;
        this.TxtBiaya = TxtBiaya;
    }

    public Pendaftaran(boolean Bulan, boolean Tahun) {
        this.Bulan = Bulan;
        this.Tahun = Tahun;
    }

    public String getTxtNoPendaftaran() {
        return TxtNoPendaftaran;
    }

    public String getTxtIdPegawai() {
        return TxtIdPegawai;
    }

    public String getTxtNoAntrian() {
        return TxtNoAntrian;
    }

    public String getTxtTgl() {
        return TxtTgl;
    }

    public String getTxtKodePasien() {
        return TxtKodePasien;
    }

    public String getTxtKeluhan() {
        return TxtKeluhan;
    }

    public String getTxtKodeDokter() {
        return TxtKodeDokter;
    }

    public String getTxtBiaya() {
        return TxtBiaya;
    }

    public boolean isBulan() {
        return Bulan;
    }

    public boolean isTahun() {
        return Tahun;
    }

    public static Logger getLOG() {
        return LOG;
    }
    
    
}
