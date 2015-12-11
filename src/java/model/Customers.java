/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ryan
 */
public class Customers {

    private int ID;
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String email;
    private int age;

    public Customers(int ID, String firstName, String lastName, String address1, String address2, String city, String state, String zip, String email, int age) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.age = age;
    }
    public Customers(){
        this.ID = 0;
        this.firstName = "";
        this.lastName = "";
        this.address1 = "";
        this.address2 = "";
        this.city = "";
        this.state = "";
        this.zip = "";
        this.email = "";
        this.age = 0;
    }
    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString(){
        return "Customers{" + "ID=" + ID + ", FIRSTNAME=" + firstName + ", LASTNAME=" + lastName + ", ADDRESS1=" + address1 + ", ADDRESS2=" + address2 + ", CITY=" + city + ", STATE=" + state + ", ZIP=" + zip + ", EMAIL=" + email + ", AGE=" + age +'}';
    }

}