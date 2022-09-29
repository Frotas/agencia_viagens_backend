package br.com.voetuor.server.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_cep", unique = true, updatable = false, nullable = false)
    private String pk_cep;
    @Column(name = "street", nullable = false)
    private String street;
    @Column(name = "num", nullable = false)
    private Integer num;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "estate", nullable = false)
    private String estate;
    @Column(name = "country", nullable = false)
    private String country;

    public Address() { }

    public Address(String pk_cep, String street, Integer num, String city, String estate, String country) {
        this.pk_cep = pk_cep;
        this.street = street;
        this.num = num;
        this.city = city;
        this.estate = estate;
        this.country = country;
    }

    public String getPk_cep() {
        return pk_cep;
    }

    public void setPk_cep(String pk_cep) {
        this.pk_cep = pk_cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Address address)) return false;
        return Objects.equals(getPk_cep(), address.getPk_cep());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPk_cep());
    }
}
