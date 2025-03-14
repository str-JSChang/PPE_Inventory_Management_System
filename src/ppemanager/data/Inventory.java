/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ppemanager.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jason
 */
public class Inventory {
    private List<PPE_Item> items;
    
    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(PPE_Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        
        for (PPE_Item existingItem : items) {
            if (existingItem.getItemCode().equals(item.getItemCode())) {
                throw new IllegalArgumentException("Item with code " + item.getItemCode());
            }
        }
        items.add(item);
    }   
    
    public void removeItem(String itemCode) {
        items.removeIf(item -> item.getItemCode().equals(itemCode));
    }
    
    public PPE_Item getItem(String itemCode) {
        for (PPE_Item item : items) {
            if (item.getItemCode().equals(itemCode)) {
                return item;
            }
        }
        return null;
    }
    
    public List<PPE_Item> getAllItems() {
        return new ArrayList<>(items); // Return a copy to prevent external modification
    }
    
    public List<PPE_Item> getItemsSortedByCode() {
        List<PPE_Item> sortedItems = new ArrayList<>(items);
        Collections.sort(sortedItems, Comparator.comparing(PPE_Item::getItemCode));
        return sortedItems;
    }
    
    public List<PPE_Item> getItemsBelowThreshold(int threshold) {
        List<PPE_Item> belowThreshold = new ArrayList<>();
        for (PPE_Item item : items) {
            if (item.getQuantity() < threshold) {
                belowThreshold.add(item);
            }
        }
        return belowThreshold;
    }
    
    public boolean updateItemQuantity(String itemCode, int newQuantity) {
        PPE_Item item = getItem(itemCode);
        if (item != null) {
            item.setQuantity(newQuantity);
            return true;
        }
        return false;
    }
    
    public boolean increaseItemQuantity(String itemCode, int quantity) {
        PPE_Item item = getItem(itemCode);
        if (item != null) {
            item.setQuantity(item.getQuantity() + quantity);
            return true;
        }
        return false;
    }
    
    public boolean decreaseItemQuantity(String itemCode, int quantity) {
        PPE_Item item = getItem(itemCode);
        if (item != null && item.getQuantity() >= quantity) {
            item.setQuantity(item.getQuantity() - quantity);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Inventory{\n");
        for (PPE_Item item : items) {
            sb.append("  ").append(item).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
