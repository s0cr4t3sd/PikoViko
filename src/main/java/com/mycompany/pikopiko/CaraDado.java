/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pikopiko;

import javax.swing.ImageIcon;

/**
 *
 * @author s0cr4t3sd
 */
public enum CaraDado {
    UNO(1,1, new ImageIcon("res/flat,128x128,075,t.jpg")),
    DOS(2,2, new ImageIcon("res/flat,128x128,075,t.jpg")),
    TRES(3,3, new ImageIcon("res/flat,128x128,075,t.jpg")),
    CUATRO(4,4, new ImageIcon("res/flat,128x128,075,t.jpg")),
    CINCO(5,5, new ImageIcon("res/flat,128x128,075,t.jpg")),
    SEIS(6,5, new ImageIcon("res/flat,128x128,075,t.jpg"));
    
    private int numero, valor;
    private ImageIcon icon;

    private CaraDado(int numero, int valor, ImageIcon icon) {
        this.numero = numero;
        this.valor = valor;
        this.icon = icon;
    }
    
    
}
