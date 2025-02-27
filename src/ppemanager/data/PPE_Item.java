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
    private int Quantity;
    private String itemName;
    
        public PPE_Item(String itemCode, String supplierCode, int quantity, String itemName) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Invalid Quantities");
        }
        this.itemCode = itemCode;
        this.supplierCode = supplierCode;
        this.Quantity = Quantity;
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
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        if (Quantity < 0) {
            throw new IllegalArgumentException("Invalid Quantities.");
        }
        this.Quantity = Quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}

