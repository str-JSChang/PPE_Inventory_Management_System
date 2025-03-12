/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ppemanager.data;

/**
 *
 * @author Jason
 */
public class Hospital {
    private String hospitalCode;
    private String name;
    private String address;
    private String contactNumber;
    
    public Hospital(String hospitalCode, String name, String address, String contactNumber) {
        if (hospitalCode == null || hospitalCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Hospital code cannot be empty");
        }
        this.hospitalCode = hospitalCode;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
    }
    
    public String getHospitalCode() {
        return hospitalCode;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getContactNumber() {
        return contactNumber;
    }
    
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalCode='" + hospitalCode + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}

