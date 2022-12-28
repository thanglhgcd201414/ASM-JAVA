/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm.projectasm.Validator;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class Validation {
    public static boolean checkEmpty(JTextField field, StringBuilder sb, String msg){
        boolean ok = true;
        if(field.getText().equals("")){
            sb.append(msg).append("\n");
            field.setBackground(Color.red);
            ok = false;
        }else{
            field.setBackground(Color.white);
        }
        return ok;
    }
}
