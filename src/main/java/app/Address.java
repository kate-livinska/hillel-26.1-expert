package app;

public class Address {
    public String street;
    public String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address: " + street + ", " + city;
    }
}
