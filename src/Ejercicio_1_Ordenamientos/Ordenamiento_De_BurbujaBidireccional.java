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
    public static void main(String[] args) {
        List<Integer> bidirec;
        bidirec = new ArrayList<>();
        
        bidirec.add(4);
        bidirec.add(2);
        bidirec.add(6);
        bidirec.add(12);
        bidirec.add(0);
        bidirec.add(8);
        bidirec.add(14);
        bidirec.add(10);
        Bidireccional(bidirec);
        System.out.println("Este es el ordenamiento Burbuja Bidireccional \n");
        System.out.println("Estos son los elementos ya ordenado: ");
        for(int l : bidirec){
            System.out.println(l + " ");
        }
    }
    
    public static void Bidireccional(List<Integer> bidirec){
        
        boolean a;
        int w = 0;
        int e = bidirec.size()-1;
        
        do{
            a = false;
            
            for (int k = w; k < e; k++) {
                if(bidirec.get(k)>bidirec.get(k+1)){
                    int p = bidirec.get(k);
                    bidirec.set(k, bidirec.get(k+1));
                    bidirec.set(k+1, p);
                    a = true;
                }
            }
            if(!a){
                break;
            }
            
            a = false;
            e--;
            
            for(int r = e - 1; r>=w; r--){
                if(bidirec.get(r)>bidirec.get(r+1)){
                    int h = bidirec.get(r);
                    bidirec.set(r, bidirec.get(r+1));
                    bidirec.set(r+1, h);
                }
            }
            w++;
        }while(a);
    }
}
