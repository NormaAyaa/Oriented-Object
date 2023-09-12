public class driver extends Person {
    protected String jenisKendaraan;
    protected String nomorSIM;


    public driver(String idperson, String name, String Address, String jenisKendaraan, String nomorSIM) {
        super(idperson, name, Address);
        this.jenisKendaraan = jenisKendaraan;
        this.nomorSIM = null;
    }

    // Getters and setters
    public String getjenisKendaraan() {
        return jenisKendaraan;
    }

    public void setjenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getnomorSIM() {
        return nomorSIM;
    }

    public void setnomorSIM(String nomorSIM) {
        this.nomorSIM = nomorSIM;
    }
}
