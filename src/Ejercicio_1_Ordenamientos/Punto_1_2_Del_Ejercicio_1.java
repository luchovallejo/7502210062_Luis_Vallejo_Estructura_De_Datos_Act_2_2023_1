package Ejercicio_1_Ordenamientos;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucho
 */

/*
1.2.1. Desarrollar un ejemplo en al menos 3 lenguajes de 
       programación, en el cual se pueda usar una lista 
       personalizada y sus operaciones básicas
*/
public class Punto_1_2_Del_Ejercicio_1 {
    public static void main(String[] args) {
        
        List<Integer> person;
        person = new ArrayList<>();
        person.add(8);
        person.add(5);
        person.add(10);
        person.add(3);
        person.add(4);
        person.add(20);
        person.add(1);
        person.add(6);
        person.add(7);
        person.add(2);
        person.add(11);
        person.add(9);
        person.add(13);
        person.add(19);
        person.add(14);
        person.add(18);
        person.add(12);
        System.out.println("Estos son los numeros ya ordenados y sus multiplos: ");
        listaPersonal(person);
    }
    
       public static void listaPersonal(List<Integer> person){
        int i=0, e=0;
        while (i++ <20){
            System.out.println(i);
            
            if(i%4==0){
                System.out.println("El numero " +i+ " es multiplo de 4");
            }
            
            if(i%6==0){
                System.out.println("El numero " +i+ " es multiplo de 6");
            }
            /*
            if(i%4!=0 || i%6 != 0){
                System.out.println("este numero "+i+" no es multiplo de 4 y 6");
            } */
        }
    }
}
