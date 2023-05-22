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
//Ordenamiento rapido
public class Ordenamiento_De_QuickSort {
    public static void main(String[] args) {
        List<Integer> flash;
        flash = new ArrayList<>();
        
        flash.add(4);
        flash.add(2);
        flash.add(6);
        flash.add(12);
        flash.add(0);
        flash.add(8);
        flash.add(14);
        flash.add(10);
        
        speed(flash, 0, flash.size()-1);
        
        System.out.println("Este es el ordenamiento rapido \n");
        System.out.println("Estos son los elementos ya ordenado: ");
        for(int l : flash){
            System.out.println(l + " ");
        }
    }
    
    public static int operacion(List<Integer> flash, int abajo, int arriba, int lpg){
        int k = flash.get(lpg);
        int j = abajo-1;
        for(int indent = abajo; indent < arriba; indent++){
            if(flash.get(lpg)>=flash.get(indent)){
                int b= flash.get(j);
                flash.set(j, flash.get(indent));
                flash.set(indent, b);
                j++;
            }
        }
        flash.set(lpg, flash.get(j));
        flash.set(j, k);
        
        return j;
    }
    
    public static void speed(List<Integer> flash, int abajo, int arriba){
 
        if(abajo>=arriba){
            return;
        }
        int lpg = arriba;
        int j = abajo;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = j; i < arriba; i++){
                if(flash.get(i) > flash.get(i + 1)){
                    int temp = flash.get(i);
                    flash.set(i, flash.get(i + 1));
                    flash.set(i + 1, temp);
                    flag = true;
                }
            }
            arriba--;
            for(int d=arriba; d>j; d--){
                int temp = flash.get(d);
                flash.set(d, flash.get(d - 1));
                flash.set(d - 1, temp);
                flag = true;
            }
        }
        j++;
    }
}
