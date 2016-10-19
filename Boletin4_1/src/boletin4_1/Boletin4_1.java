/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

/**
 *
 * @author ggarciamartinez
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche bmw = new Coche ();
        bmw.acelerar(120);
        System.out.println(bmw.getV());
        bmw.frenar(240);
        System.out.println(bmw.getV());
    }
    
}
