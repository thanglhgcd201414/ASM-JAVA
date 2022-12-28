/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm.projectasm.model;

import java.io.Serializable;

/**
 *
 * @hp
 */
public class Products implements Serializable {
    private String proid, name, type;
    private int quantity;
    private float price;

    public Products() {
        
    }
    
    public Products(String proid, String name, int quantity, String type, float price) {
        this.proid = proid;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }
    
    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}













