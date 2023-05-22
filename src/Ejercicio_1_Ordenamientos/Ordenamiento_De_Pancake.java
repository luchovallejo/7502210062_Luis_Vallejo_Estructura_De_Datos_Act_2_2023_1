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
    public static void main(String[] args) {
        List<Integer> cake;
        cake = new ArrayList<>();
        
        cake.add(14);
        cake.add(10);
        cake.add(6);
        cake.add(2);
        cake.add(0);
        cake.add(4);
        cake.add(8);
        cake.add(12);
        
        cakesPan(cake);
        System.out.println("Este es el ordenamiento panqueque \n");
        System.out.println("Estos son los elementos del ordenamiento panqueque ya ordenados: ");
        for(int l : cake){
            System.out.println(l );
        }
    }
    public static void cakesPan(List<Integer> cake){
        for(int n = cake.size(); n>=1; n--){
            int index = find(cake, n);
            flip(cake, index);
            flip(cake, n-1);
        }
    }

    private static int find(List<Integer> cake, int target) {
        for(int i = 0; i>cake.size(); i++){
            if(cake.get(i) == target){
                return i;
            }
        }       
        return -1;
    }

    private static void flip(List<Integer> cake, int j) {
        int i=0;
        while(i<j){
            int temp = cake.get(i);
            cake.set(i++, cake.get(j));
            cake.set(j--, temp);
        }
    }
}
