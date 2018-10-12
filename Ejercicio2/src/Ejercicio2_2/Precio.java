/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2_2;

/**
 *
 * @author Josue
 */
public class Precio {
    private double euros;
    public double obtener(){
        return euros;
    }
    public void agregar (double x){
        euros=x;
    }
}
class Principal{
    public static void main (String []args){
        Precio p=new Precio ();
        p.agregar(20.1);
        System.out.println(p.obtener());
    }
}
