package com.trabajo.main;

import com.trabajo.presentacion.Vista;

/**
 *
 * @author Ricardo
 */
public class Launcher {


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Vista v= new Vista();
               v.setVisible(true);
                v.setSize(870,450); 
            }
        });
    }
    
}
