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
public class Ordenamiento_De_Pancake {
    public static void shellSort(List<Integer> list) {
        int n = list.size();
        
        // Calcula el intervalo inicial
        int intervalo = 1;
        while (intervalo < n / 3) {
            intervalo = intervalo * 3 + 1;
        }
        
        // Aplica el algoritmo de Shell
        while (intervalo > 0) {
            for (int i = intervalo; i < n; i++) {
                int temp = list.get(i);
                int j = i;
                
                // Realiza inserción directa en el subgrupo correspondiente
                while (j >= intervalo && list.get(j - intervalo) > temp) {
                    list.set(j, list.get(j - intervalo));
                    j -= intervalo;
                }
                
                list.set(j, temp);
            }
            
            intervalo = (intervalo - 1) / 3;
        }
    }
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(64);
        list.add(34);
        list.add(25);
        list.add(12);
        list.add(22);
        list.add(11);
        list.add(90);
        
        System.out.println("Lista original:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        
        shellSort(list);
        
        System.out.println("\nLista ordenada:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
