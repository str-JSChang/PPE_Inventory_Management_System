/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ppemanager.data;

/**
 *
 * @author Jason
 */
public class Supplier {
    private final String supplierCode;
    private String name;
    private String contactPerson;
    private String contactNumber;
    private String email;
    
    public Supplier(String supplierCode, String name, String contactPerson, String contactNumber, String email) {
        if (supplierCode == null || supplierCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Supplier code cannot be empty");
        }
        this.supplierCode = supplierCode;
        this.name = name;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.email = email;
    }
    
    public String getSupplierCode() {
        return supplierCode;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getContactPerson() {
        return contactPerson;
    }
    
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
    
    public String getContactNumber() {
        return contactNumber;
    }
    
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Supplier{" +
                "supplierCode='" + supplierCode + '\'' +
                ", name='" + name + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

