/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1_Ordenamientos;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author lucho
 */
public class Ordenamiento_De_Shell {
    public static void main(String[] args) {
        List<Integer> inter;
        inter = new ArrayList<>();
        
        inter.add(50);
        inter.add(30);
        inter.add(10);
        inter.add(40);
        inter.add(60);
        inter.add(20);
        
        shell(inter);
        
        System.out.println("Este es el ordenamiento por Shell \n");
        System.out.println("Estos son los elementos ya ordenado: ");
        for(int k : inter){
            System.out.println(k + " ");
        }
    }
    public static void shell(List<Integer> inter){
        // Calcula el intervalo inicial
         int lpg = 1;
         while(lpg<inter.size()/3){
             lpg = lpg * 3 + 1;
         }
         // Aplica el algoritmo de Shell
         while(lpg>0){
             for(int i = lpg; i<inter.size(); i++){
                int p = inter.get(i);
                int l = i;
                // Realiza inserción directa en el subgrupo correspondiente
                while(l >= lpg && inter.get(l-lpg)>p){
                    inter.set(l, inter.get(l - lpg));
                    l -= lpg;
                }
                inter.set(l, p);
             }
             lpg = (lpg - 1)/3;
         }
    }  
}
