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
public class Ordenamiento_De_BurbujaBidireccional {
    public static void cocktailSort(List<Integer> list) {
        boolean swapped;
        int start = 0;
        int end = list.size() - 1;

        do {
            swapped = false;

            // Iteración hacia adelante (elementos más grandes hacia el final)
            for (int i = start; i < end; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    // Intercambiar elementos
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped) {
                break; // Si no hubo intercambios, la lista está ordenada
            }

            swapped = false;
            end--;

            // Iteración hacia atrás (elementos más pequeños hacia el principio)
            for (int i = end - 1; i >= start; i--) {
                if (list.get(i) > list.get(i + 1)) {
                    // Intercambiar elementos
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }

            start++;
        } while (swapped);
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

        cocktailSort(list);

        System.out.println("\nLista ordenada:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
