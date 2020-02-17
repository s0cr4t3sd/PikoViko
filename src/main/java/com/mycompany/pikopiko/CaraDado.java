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
    UNO(1,1, new ImageIcon("res/dado1.png")),
    DOS(2,2, new ImageIcon("res/dado2.png")),
    TRES(3,3, new ImageIcon("res/dado3.png")),
    CUATRO(4,4, new ImageIcon("res/dado4.png")),
    CINCO(5,5, new ImageIcon("res/dado5.png")),
    SEIS(6,5, new ImageIcon("res/dadoGusano.png"));
    
    private int numero, valor;
    private ImageIcon icon;

    private CaraDado(int numero, int valor, ImageIcon icon) {
        this.numero = numero;
        this.valor = valor;
        this.icon = icon;
    }
    
    
}
