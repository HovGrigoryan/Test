package spring;

public class Address {
    private String street;
    private String city;
    private String country;
    private int zipPostalCode;

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

    public int getZipPostalCode() {
        return zipPostalCode;
    }

    public void setZipPostalCode(int zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }
}
