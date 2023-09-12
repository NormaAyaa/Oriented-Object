public class Address {
    protected String street;
    protected String city;

 
    public Address() {

        this.street = "";
        this.city = "";
    }

    public Address(String st, String cit) {
        this.street = st;
        this.city = cit;
    }
}