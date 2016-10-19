/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author ggarciamartinez
 */
public class Circulo {
    private double radio;
    private final double PI = 3.14f;
    public Circulo(){
    }
    public Circulo(double rad){
            radio = rad;
    }
    public void setR(double r){
        radio=r;
    }
    public double getR(){
        return radio;
    }
    public double calcA(){
        return Math.pow(radio, 2)*PI;
    }
    public double calcL(){
        return radio*2;
    }
}
