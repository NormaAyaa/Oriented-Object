import java.util.ArrayList;

public class polisi extends Person {
    protected int idPolisi;
    protected String jabatan;
    protected  ArrayList<Pengajuan> daftarPengajuan;


    public polisi(String idPerson, int id, String nama, String Address, String jabatan) {
        super(idPerson, nama, Address);
        this.idPolisi = id;
        this.jabatan = jabatan;
        this.daftarPengajuan = new ArrayList<Pengajuan>();
    }


    public void terimaPengajuan(Pengajuan pengajuan) {
        this.daftarPengajuan.add(pengajuan);
    }
}

