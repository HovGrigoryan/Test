package spring;

import java.time.LocalDate;

public class User {
    private Address address;
    private String username;
    private String email;
    private LocalDate bornDate;

    public User(Address address) {
        this.address = address;
        this.username = "username";
        this.email = "email";
        this.bornDate = LocalDate.now();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public String getCurrentLocation() {
        return address.getStreet();
    }
}
