/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lucho
 */
/*
1.3 Tomar al menos 3 algoritmos de ordenamiento (los mismo 
ejemplos que realizó en el punto #1.1) y probarlos con el ejemplo 
de la lista del punto #1.2
*/
public class Punto_1_3_Del_Ejercicio_1 {
    public static void main(String[] args) {
        
        List<Integer> factor;
        factor = new ArrayList<>();
        
        factor.add(70);
        factor.add(30);
        factor.add(10);
        factor.add(40);
        factor.add(80);
        factor.add(20);
        factor.add(50);
        factor.add(60);
        System.out.println("Este es el ordenamiento por seleccion con sus numeros multiplos de 4 y 6 \n");
        seleccion(factor);
        System.out.println("Estos son los elementos ya ordenado: ");
        for(int i=0; i<factor.size(); i++){
            System.out.print(factor.get(i)+ "");
            if(factor.get(i)%4==0){
                System.out.print(" es multiplo de 4");
            } if(factor.get(i)%6==0){
                System.out.print(" es multiplo de 6");
            }
            System.out.println();
        }
        System.out.println("\n");
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
        System.out.println("***********************************************");
        System.out.println("Este es el ordenamiento por casillero con sus numeros multiplos de 4 y 6\n");
        casillero(casilla);
        System.out.println("Estos son los elementos ya ordenado: ");
        for(int i=0; i<casilla.size(); i++){
            System.out.print(casilla.get(i)+ " ");
            if(casilla.get(i)%4==0){
                System.out.print(" es multiplo de 4");
            } if(casilla.get(i)%6==0){
                System.out.print(" es multiplo de 6");
            }
            System.out.println();
        }
        
        
        System.out.println("\n");
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
        System.out.println("*******************************\n");
        System.out.println("Estos son los numeros que pertenecen al ordenamiento burbuja: \n");
        System.out.println("Se mostraran si son multiplo o no de 4 y 6\n");
        for(int i=1; i<xNumero.size(); i++){
            System.out.print(xNumero.get(i) + " ");
            if(xNumero.get(i)%4 == 0){
                System.out.print(" es multiplo de 4");
            }if(xNumero.get(i)%6 == 0){
                System.out.print(" es multiplo de 6");
            }if(i%4!=0 || i%6 != 0){
                System.out.print(" Este numero no es multiplo de cuatro y seis ");
            }
            System.out.println();
        }
    }
    public static void seleccion(List<Integer> factor) {
        int k = 0, e=0;
        for(int b = 0; b<factor.size()-1; b++){
            int m = b;
            
            for(int t = b+1; t<factor.size(); t++){
                if(factor.get(t)<factor.get(m)){
                    m = t;
                }
            }
            
            int x = factor.get(m);
            factor.set(m, factor.get(b));
            factor.set(b, x);
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
