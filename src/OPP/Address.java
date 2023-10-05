package OPP;

public class Address {
    String street;
    String city;
    String country;

    public Address(String street, String city, String country) {
        this.city = city;
        this.street = street;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String toString() {
        String address = String.format("%s %s %s",city,country,street);
        return address;
    }
}
