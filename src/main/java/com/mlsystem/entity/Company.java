package com.mlsystem.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
/*@Table(name = "Company", catalog = "technologia"/*, 
        uniqueConstraints = @UniqueConstraint(columnNames = "company_name"))*/
public class Company implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(nullable = false,  unique = true)
    private String companyName;

    @Column(nullable = false)
    private String addressVAT;

    @Column(nullable = false)
    private String addressDelivery;

    @Column(nullable = false)
    private String postalCode;

    @Column(nullable = false)
    private String city;              

    @Column(nullable = false)
    private String phoneNumber1;       

    @Column(nullable = false)
    private String phoneNumber2;       

    @Column(nullable = false)
    private String emailContact1;   

    @Column(nullable = true)
    private String emailContact2;  

    //@Column(nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", referencedColumnName="id", nullable = false)
    private Person contactPerson;         

    public Person getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Person contactPerson) {
        this.contactPerson = contactPerson;
    }
    
    public int getId() {
            return id;
    }
	
    public void setId(int id) {
            this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddressVAT() {
        return addressVAT;
    }

    public String getAddressDelivery() {
        return addressDelivery;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public String getEmailContact1() {
        return emailContact1;
    }

    public String getEmailContact2() {
        return emailContact2;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setAddressVAT(String addressVAT) {
        this.addressVAT = addressVAT;
    }

    public void setAddressDelivery(String addressDelivery) {
        this.addressDelivery = addressDelivery;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public void setEmailContact1(String emailContact1) {
        this.emailContact1 = emailContact1;
    }

    public void setEmailContact2(String emailContact2) {
        this.emailContact2 = emailContact2;
    }

	
}
