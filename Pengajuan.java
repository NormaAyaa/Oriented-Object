public class Pengajuan extends Person {
    protected String jenisKendaraan;
	protected String TanggalPengajuan;
    protected boolean isDisetujui;


    public Pengajuan(String idPerson, String TanggalPengajuan, String nama, String alamat,String Address, String jenisKendaraan) {
        super(idPerson, nama, Address);
        this.jenisKendaraan = jenisKendaraan;
		this.TanggalPengajuan = TanggalPengajuan;
        this.isDisetujui = false;
    }

    // Getters and setters
    public String getjenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public boolean isDisetujui() {
        return isDisetujui;
    }

    public void setDisetujui(boolean disetujui) {
        isDisetujui = disetujui;
    }
}
