package com.geternity.lilLibra.models;

import jakarta.persistence.*;
@Embeddable
public class Address {
    private String country;
    private String city;
    private String email;
    private String phone_number;

    public Address(){
    }
    public Address(String city,String country, String email, String phone_number) {
        this.country = country;
        this.city = city;
        this.email = email;
        this.phone_number = phone_number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
