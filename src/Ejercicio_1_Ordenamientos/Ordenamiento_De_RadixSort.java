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
public class Ordenamiento_De_RadixSort {
    public static void main(String[] args) {
        List<Integer> radix;
        radix = new ArrayList<>();
        
        radix.add(40);
        radix.add(30);
        radix.add(10);
        radix.add(15);
        radix.add(35);
        radix.add(20);
        radix.add(5);
        radix.add(1);
        
        listaOrdenada(radix);
        
        System.out.println("Este es el ordenamiento Radix \n");
        System.out.println("Estos son los elementos del ordenamiento Radix ya ordenados: ");
        for(int l : radix){
            System.out.println(l + " ");
        }
    }
    
    public static void listaOrdenada(List<Integer> radix){
        int[] arr = radix.stream().mapToInt(i -> i).toArray();
        
        for(int m=Integer.SIZE-1; m>=0; m--){
            int a[] = new int[arr.length];
            int k=0;
            
            for(int u=0; u<arr.length; u++){
                boolean inter=arr[u]<<m>=0;
                if(m==0 ? !inter:inter){
                    a[k]=arr[u];
                    k++;
                }else{
                    arr[u-k]=arr[u];
                }
            }
            for(int u = k; u<arr.length; u++){
                a[u]=arr[u-k];
            }
            arr = a;
        }
        radix.clear();
        for(int i : arr){
            radix.add(i);
        }
    }
}
