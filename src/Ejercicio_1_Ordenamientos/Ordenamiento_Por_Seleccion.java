/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1_Ordenamientos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucho
 */
public class Ordenamiento_Por_Seleccion {
    public static void main(String[] args) {
        List<Integer> factor;
        factor = new ArrayList<>();
        
        factor.add(70);
        factor.add(30);
        factor.add(10);
        factor.add(40);
        factor.add(80);
        factor.add(20);
        factor.add(50);
        factor.add(60);
        
        seleccion(factor);
        System.out.println("Este es el ordenamiento por seleccion \n");
        System.out.println("Estos son los elementos ya ordenado: ");
        for(int l : factor){
            System.out.println(l +" ");
        }
    }
    
    public static void seleccion(List<Integer> factor) {
        
        for(int b = 0; b<factor.size()-1; b++){
            int m = b;
            
            for(int t = b+1; t<factor.size(); t++){
                if(factor.get(t)<factor.get(m)){
                    m = t;
                }
            }
            
            int x = factor.get(m);
            factor.set(m, factor.get(b));
            factor.set(b, x);
        }
    }
}


