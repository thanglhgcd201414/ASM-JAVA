/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm.projectasm.Validator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author hp
 */
public class SaveFile {
    public static Object readObject(String path) throws Exception{
        try(
                FileInputStream fin = new FileInputStream(path);// để đọc dữ liệu từ một tệp dưới dạng chuỗi byte 
                ObjectInputStream ois = new ObjectInputStream(fin);//lớp con của FileInput để quản lý đối tượng của FileInput
           ){
            Object obj = ois.readObject();
            return obj;
        }
    }
    public static void writeObject (String path, Object obj) throws Exception{
        try(
                FileOutputStream fos = new FileOutputStream(path);    //một luồng dữ liệu đầu ra dùng để ghi dữ liệu và File
                ObjectOutputStream oos = new ObjectOutputStream(fos);   //lớp con của lớp OutputStream. Nó quản lý một đối tượng OutputStream và cung cấp các phương thức để ghi dữ liệu hoặc đối tượng vào OutputStream mà nó quản lý
           ){
            oos.writeObject(obj);
        }
    }
}










