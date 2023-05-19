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
public class Ordenamiento_De_Burbuja {
    public static void main(String[] args) {
        List<Integer> xNumero;
        xNumero = new ArrayList<>();
        
        xNumero.add(1);
        xNumero.add(14);
        xNumero.add(5);
        xNumero.add(2);
        xNumero.add(3);
        xNumero.add(7);
        xNumero.add(10);
        
            //aqui va a iterar la lista en un bucle for para que se realice el ordenamiento
        for(int h = xNumero.size()-1; h>0; h--){
            for(int k=0; k<h; k++){
                if(xNumero.get(k)>xNumero.get(k+1)){
                    //aca si el elemento es mayor que el que viene, entonces hay intercambio
                    int a = xNumero.get(k);
                    xNumero.set(k, xNumero.get(k+1));
                    xNumero.set(k+1, a);
                }
            }
        }
        System.out.println("Estos son los numeros que pertenecen al ordenamiento burbuja: \n");
       for(int l : xNumero){
           System.out.print(l + " ");
       }
    }
}

