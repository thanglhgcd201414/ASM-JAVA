/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm.projectasm.model;

import asm.projectasm.Validator.SaveFile;
import java.io.File;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class ProductsList {
    private ArrayList<Products> list = new ArrayList();//khai báo trường list để lưu danh sách
    private String path = "products.txt";
    public void saveToFile() throws Exception{
        SaveFile.writeObject(path, list);
    }
     public void loadFromFile() throws Exception{
        File file = new File(path);
        if(file.exists()){
             list = (ArrayList<Products>) SaveFile.readObject(path);
        }else{
            initProductsData();
        }
    }
    private void initProductsData(){
        list.add(new Products("C01","SVR",850,"Cleanser",285000));
        list.add(new Products("SC01","Martiderm",550,"Suncreen",550000));
        list.add(new Products("SE01","Klairs Midnight BLue Youth Activating Drop",250,"Serum",320000));
    }
    public void add(Products pro){
        list.add(pro);
    }//allow adding products to the list
    public boolean update(Products pro){
        Products existedPro = findById(pro.getProid());//package id, if found, follow the steps below
        boolean flag = false;
        if (existedPro!=null){
            existedPro.setProid(pro.getProid());
            existedPro.setName(pro.getName());
            existedPro.setQuantity(pro.getQuantity());
            existedPro.setType(pro.getType());
            existedPro.setPrice(pro.getPrice());
            flag = true;
        }
        return flag;
    }
    public void renderToTable(DefaultTableModel tblModel){
        tblModel.setRowCount(0); //whiten the rows in the table
        for(Products products : list){
            Object[]row = new Object[]{
                products.getProid(), products.getName(), 
                products.getQuantity(), products.getType(), 
                products.getPrice()
            };
            tblModel.addRow(row);//addrow vao table
        }// iterate through the list using a loop for(each), create do row, each object is 1 row
        tblModel.fireTableDataChanged();
    }//
    public Products findById(String proid){
        for(Products products : list){
            if (products.getProid().equals(proid)){
                return products;
            }
        }
        return null;
    }
//while traversing a list using a loop for check id in list with id passed in, if id matches return the id in the list, otherwise not found
    public boolean deleteById(String proid){
        for(Products products : list){
            if (products.getProid().equals(proid)){
                list.remove(products);
                return true;
            }
        }
        return false;
    }
}
