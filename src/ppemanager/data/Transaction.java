/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ppemanager.data;

import java.time.LocalDateTime;

/**
 *
 * @author Jason
 */
public class Transaction {
    private final String transactionId;
    private final LocalDateTime transactionDate;
    private final String itemCode;
    private final String supplierOrHospitalCode;
    private final boolean isSupplier; // true if supplier, false if hospital
    private final int quantity;
    private final int originalQuantity;
    private final int newQuantity;
    
    public Transaction(String transactionId, String itemCode, String supplierOrHospitalCode, 
                      boolean isSupplier, int quantity, int originalQuantity, int newQuantity) {
        if (transactionId == null || transactionId.trim().isEmpty()) {
            throw new IllegalArgumentException("Transaction ID cannot be empty");
        }
        if (itemCode == null || itemCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Item code cannot be empty");
        }
        if (supplierOrHospitalCode == null || supplierOrHospitalCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Supplier/Hospital code cannot be empty");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        
        this.transactionId = transactionId;
        this.transactionDate = LocalDateTime.now();
        this.itemCode = itemCode;
        this.supplierOrHospitalCode = supplierOrHospitalCode;
        this.isSupplier = isSupplier;
        this.quantity = quantity;
        this.originalQuantity = originalQuantity;
        this.newQuantity = newQuantity;
    }
    
    public String getTransactionId() {
        return transactionId;
    }
    
    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }
    
    public String getItemCode() {
        return itemCode;
    }
    
    public String getSupplierOrHospitalCode() {
        return supplierOrHospitalCode;
    }
    
    public boolean isSupplier() {
        return isSupplier;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public int getOriginalQuantity() {
        return originalQuantity;
    }
    
    public int getNewQuantity() {
        return newQuantity;
    }
    
    public String getTransactionType() {
        return isSupplier ? "Received" : "Distributed";
    }
    
    public String getEntityType() {
        return isSupplier ? "Supplier" : "Hospital";
    }
    
    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", transactionDate=" + transactionDate +
                ", itemCode='" + itemCode + '\'' +
                ", " + getEntityType() + "='" + supplierOrHospitalCode + '\'' +
                ", type='" + getTransactionType() + '\'' +
                ", quantity=" + quantity +
                ", originalQuantity=" + originalQuantity +
                ", newQuantity=" + newQuantity +
                '}';
    }
}
