public class jadwalujian {
    protected String tanggal;
    protected String tempat;

    public jadwalujian(String tanggal, String tempat) {
        this.tanggal = tanggal;
        this.tempat = tempat;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }
}
