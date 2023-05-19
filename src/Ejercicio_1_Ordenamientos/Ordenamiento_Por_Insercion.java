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
public class Ordenamiento_Por_Insercion {
    public static void main(String[] args) {
        List<Integer> cantidad;
        cantidad = new ArrayList<>();
        
        cantidad.add(20);
        cantidad.add(17);
        cantidad.add(15);
        cantidad.add(3);
        cantidad.add(1);
        cantidad.add(8);
        cantidad.add(2);
        cantidad.add(10);
        cantidad.add(4);
        cantidad.add(6);
        cantidad.add(12);
        cantidad.add(14);
        cantidad.add(9);
        cantidad.add(11);
        cantidad.add(18);
        cantidad.add(13);
        cantidad.add(19);
        cantidad.add(5);
        cantidad.add(7);
        cantidad.add(16);
        
        for(int q = 1; q<cantidad.size(); q++){
            int u = cantidad.get(q);
            int p = q - 1;
            
            while(p >= 0 && cantidad.get(p) > u){
                cantidad.set(p+1, cantidad.get(p));
                p = p -1;
            }
            cantidad.set(p+1, u);
        }
        System.out.println("Ordenamiento por insercion \n");
        System.out.println("Estos son los numeros ordenados: ");
        System.out.println("");
        for(int l : cantidad){
           System.out.print(l + " ");
       }
    }
}

