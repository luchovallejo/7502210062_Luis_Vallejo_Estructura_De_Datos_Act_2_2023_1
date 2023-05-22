/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1_Ordenamientos;

import static Ejercicio_1_Ordenamientos.Ordenamiento_Por_Seleccion.seleccion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lucho
 */
//por cuentas
public class Ordenamiento_De_CountingSort {
    public static void main(String[] args) {
        List<Integer> conteo;
        conteo = new ArrayList<>();
        
        conteo.add(85);
        conteo.add(35);
        conteo.add(10);
        conteo.add(15);
        conteo.add(75);
        conteo.add(20);
        conteo.add(45);
        conteo.add(60);
        cuentas(conteo);
        System.out.println("Este es el ordenamiento por cuenta \n");
        System.out.println("Estos son los elementos ya ordenado: ");
        for(int l : conteo){
            System.out.println(l +" ");
        }
    } 
    
    public static void cuentas(List<Integer> conteo){
        int max = Collections.max(conteo);
        int min = Collections.min(conteo);
        
        List<Integer> exited = new ArrayList<>(conteo.size());
        int[] contador = new int[max - min + 1];
        for(int value : conteo){
            contador[value - min]++;
        }
        for (int i = 0; i < max - min + 1; i++) {
            while(contador[i] > 0){
                exited.add(i + min);
                contador[i]--;
            }
        }
        for (int i = 0; i < conteo.size(); i++) {
            conteo.set(i, exited.get(i));
        }
    }
}
