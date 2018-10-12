/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2_3;

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
    public Precio (){
        agregar (30.2);
    }
    public Precio (double y){
        agregar(y);
    }
}
class Principal{
    public static void main (String []args){
        Precio p=new Precio ();
        Precio n=new Precio(25.9);
        System.out.println(p.obtener());
        System.out.println(n.obtener());
    }
}

