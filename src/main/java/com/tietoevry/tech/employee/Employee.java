package com.tietoevry.tech.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;


import static java.util.Map.entry;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EmployeeID;

    private String givenName;
    private String surname;
    private String email;
    private String telephoneNumber;
    private String streetAddress;
    private String city;
    private String zipCode;
    private String nationalID;
    private String guid;


    public Integer getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int number) {
        this.EmployeeID = number;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipcode) {
        this.zipCode = zipcode;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalId) {
        this.nationalID = nationalId;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public static ArrayList<Map<String, String>> filteredEmployeeInfo(List<Employee> employeesList) {

        ArrayList<Map<String, String>> filteredInfo = new ArrayList<>();

        for (Employee employee : employeesList) {
            filteredInfo.add(
                    (new TreeMap<String, String>(
                            Map.ofEntries(
                                    entry("EmployeeID", employee.getEmployeeID().toString()),
                                    entry("email", employee.getEmail()),
                                    entry("firstName", employee.getGivenName()),
                                    entry("lastName", employee.getSurname()),
                                    entry("telephoneNumber", employee.getTelephoneNumber())
                            )
                    )
                    ));
        }
        ;

        return filteredInfo;

    }


    @Override
    public String toString() {
        return "Employee{" +
                "number=" + EmployeeID +
                ", givenName='" + givenName + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipCode + '\'' +
                ", nationalId='" + nationalID + '\'' +
                ", guid='" + guid + '\'' +
                '}';
    }
}

