/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ppemanager.data;

/**
 *
 * @author Jason
 */
public class PPE_Item {
    private final String itemCode;
    private String supplierCode;
    private int quantity;
    private String itemName;
    
        public PPE_Item(String itemCode, String supplierCode, int quantity, String itemName) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Invalid Quantities");
        }
        this.itemCode = itemCode;
        this.supplierCode = supplierCode;
        this.quantity = quantity;
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Invalid Quantities.");
        }
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}

