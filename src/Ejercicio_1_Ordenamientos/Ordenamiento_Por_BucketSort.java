/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1_Ordenamientos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lucho
 */
public class Ordenamiento_Por_BucketSort {
    public static void main(String[] args) {
        List<Integer> casilla;
        casilla = new ArrayList<>();
        
        casilla.add(7);
        casilla.add(3);
        casilla.add(10);
        casilla.add(4);
        casilla.add(8);
        casilla.add(2);
        casilla.add(5);
        casilla.add(6);
        
        casillero(casilla);
        
        System.out.println("Este es el ordenamiento por casillero \n");
        System.out.println("Estos son los elementos ya ordenado: ");
        for(int l : casilla){
            System.out.println(l +" ");
        }
    }
    
    public static void casillero(List<Integer> casilla){
        int minimo = Collections.min(casilla);
        int maximo = Collections.max(casilla);
        int range = maximo - minimo + 1;
        
        ArrayList<Integer>[] cas = new ArrayList[range];
        for (int c = 0; c < range; c++) {
            cas[c] = new ArrayList<>();
        }
        
        for (int b = 0; b < casilla.size(); b++) {
            int normalizedValue = casilla.get(b) - minimo;
            cas[normalizedValue].add(casilla.get(b));
        }
        
        int index = 0;
        for (int g = 0; g < range; g++) {
            Collections.sort(cas[g]);
            for (int q : cas[g]) {
                casilla.set(index++, q);
            }
        }
    }
}
