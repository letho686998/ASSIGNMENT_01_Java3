/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utinity;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class Uheper {

    public static boolean checkRong(JTextField tf, String mss) {
        if (tf.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, mss);
            tf.requestFocus();
            
            return true;
        }
        return false;
    }

    public static boolean checkTrungManv(JTextField tf, String mss, String manv) {
        if (tf.getText().equalsIgnoreCase(manv)) {
            JOptionPane.showMessageDialog(null, mss);
            tf.requestFocus();
            return true;
        }
        return false;
    }
}
