/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.awt.Font;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
/**
 *
 * @author vivis
 */
public class Principal { 

    public static void main(String[] args) {

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Sitka small", Font.BOLD, 18))); // Aqui você muda o nome e tamanho da fonte.
        JOptionPane.showMessageDialog(null, "Resultado da nova fonte", "Nova fonte", JOptionPane.INFORMATION_MESSAGE);

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("SanSerif", Font.ITALIC, 18))); // Aqui você muda o nome e tamanho da fonte.
        JOptionPane.showMessageDialog(null, "Resultado da nova fonte", "Nova fonte", JOptionPane.INFORMATION_MESSAGE);
    }
}