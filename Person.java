public class Person
{
	public String idPerson;
	public String nama;
	public String Address;
	
	Person(String idPerson, String nama, String Address)
	{
		this.idPerson = idPerson;
        this.nama = nama;
		this.Address = Address;
	}
	
	public void addAddress(String Address) 
	{
        this.Address = Address;
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	public void setnama(String nama)
	{
		this.nama = nama;
	}
	
	public String getnama()
	{
		return nama;
	}
	
	public void setidPerson(String idPerson)
	{
		this.idPerson = idPerson;
	}
	
	public String getidPerson()
	{
		return idPerson;
	}
	
	
}