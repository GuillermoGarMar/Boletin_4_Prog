/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author ggarciamartinez
 */
public class Restaurante {
    private int KgP;
    private int KGpat;
    
    public void setPulp(int x ){
         KgP = x;
     }
     
    public void setPat ( int x){
        KGpat = x;
     }          
    public int getPulp( ){
        return KgP;
    }
    public int getPat ( ){
        return KGpat;
    }
}
