public class TestSIM
{
	
    public static void main(String[] args) {
        Person person1 = new Person("1234", "John", "123 Main Street");
        System.out.println("ID Person: " + person1.getidPerson());
        System.out.println("Nama: " + person1.getnama());
        System.out.println("Alamat: " + person1.getAddress());
		System.out.println("");
		driver d1 = new driver("12345", "John Doe", "Jl. Sudirman No.1", "Mobil", "123456789");
		System.out.println("Driver Name: " +  d1.nama());
        System.out.println("Driver Address: " +  d1.Address());
        System.out.println("Jenis Kendaraan: " +  d1.getjenisKendaraan());
        System.out.println("Nomor SIM: " +  d1.getNomorSIM());
		
		System.out.println("");
		// Membuat objek polisi
        polisi p1 = new polisi("P001", 1, "Agus", "Jl. Sudirman no. 1", "Kompol");

        // Membuat objek driver
        driver d1 = new driver("D001", "Budi", "Jl. Gatot Subroto no. 2", "Mobil", "12345");

        // Menampilkan informasi polisi dan driver
        System.out.println("Polisi:");
        System.out.println("ID: " + p1.getidPerson());
        System.out.println("Nama: " + p1.getnama());
        System.out.println("Alamat: " + p1.getAddress());
        System.out.println("ID Polisi: " + p1.idPolisi);
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println();

        System.out.println("Driver:");
        System.out.println("ID: " + d1.getidPerson());
        System.out.println("Nama: " + d1.getnama());
        System.out.println("Alamat: " + d1.Address());
        System.out.println("Jenis Kendaraan: " + d1.jenisKendaraan);
        System.out.println("Nomor SIM: " + d1.nomorSIM);
		
	
		System.out.println("");
    }
}
		

    
