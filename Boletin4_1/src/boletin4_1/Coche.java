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
public class Coche {
        private int v ;

    public Coche(){
    v =0 ;
}
    public int getV(){
        return v;
    }
    public void acelerar (int valor){
        v=v+valor;
    }

    public void frenar (int menos){
        v=v-menos;
    }    
}
