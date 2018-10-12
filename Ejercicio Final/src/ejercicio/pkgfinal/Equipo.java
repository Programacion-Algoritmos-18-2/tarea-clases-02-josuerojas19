/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkgfinal;

/**
 *
 * @author Josue
 */
public class Equipo {
    String nombre, ciudad;
    int num_jugadores;
    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_ciudad(){
        return ciudad;
    }
    public int obtener_num_jugadores(){
        return num_jugadores;
    }
    public void agregar_nombre(String x){
        nombre=x;
    }
    public void agregar_ciudad(String y){
        ciudad=y;
    }
    public void agregar_num_jugadores(int z){
        num_jugadores=z;
    }
    public Equipo(){
       
    }
    public Equipo (String x){
        agregar_nombre(x);
    }
    public Equipo (String x, int z){
        agregar_nombre(x);
        agregar_num_jugadores(z);
    }
    public Equipo (String x, int z,String y){
        agregar_nombre(x);
        agregar_num_jugadores(z);
        agregar_ciudad(y);
    }
}

class Principal{
    public static void main (String[]args){
        Equipo e=new Equipo();
        System.out.println("Nombre / Jugadores / Ciudad :"+e.obtener_nombre()+" / "+e.obtener_num_jugadores()+" / "+e.obtener_ciudad());
        Equipo e2=new Equipo("Liga de LOja");
        System.out.println("Nombre / Jugadores / Ciudad :"+e2.obtener_nombre());
        Equipo e3=new Equipo("Liga de Loja",20);
        System.out.println("Nombre / Jugadores / Ciudad :"+e3.obtener_nombre()+" / "+e3.obtener_num_jugadores());
        Equipo e4=new Equipo("LIga de Loja",20,"Loja");
        System.out.println("Nombre / Jugadores / Ciudad :"+e4.obtener_nombre()+" / "+e4.obtener_num_jugadores()+" / "+e4.obtener_ciudad());
    }
}
