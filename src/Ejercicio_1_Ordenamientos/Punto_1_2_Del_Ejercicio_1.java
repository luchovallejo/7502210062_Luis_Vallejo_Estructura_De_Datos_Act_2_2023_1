package Ejercicio_1_Ordenamientos;
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
        
        Punto_1_2_Del_Ejercicio_1 person = new Punto_1_2_Del_Ejercicio_1();
        System.out.println("Esto es una lista personalizada \n");
        System.out.println("Se añaden los siguientes numeros pertenecienta a la lista: ");
        person.añadir(8);
        person.añadir(5);
        person.añadir(10);
        person.añadir(3);
        person.añadir(4);
        person.añadir(20);
        person.añadir(1);
        person.añadir(15);
        person.añadir(6);
        person.añadir(7);
        person.añadir(2);
        person.añadir(11);
        person.añadir(9);
        person.añadir(13);
        person.añadir(19);
        person.añadir(14);
        person.añadir(18);
        person.añadir(12);
        person.añadir(17);
        person.añadir(16);
        System.out.println("**************************************************\n");
        System.out.println("Estos son los numeros ya ordenados y sus multiplos: ");
        person.listaPersonal();
        System.out.println("**************************************************\n");
        person.tamañoDeLista();
        person.encontrar(19);
        person.eliminar(20);
        person.enlistarse();
        System.out.println();
    }
    
    class listaNodo{
        int valores; 
        listaNodo next;
        
        public listaNodo(int info, listaNodo union){
            this.valores = info;
            next = union;
        }
    }
    
    listaNodo indice = null;
    
    void añadir(int infor){
        System.out.println("Este es el número " + infor + " que ha sido añadido a la lista");
        
        listaNodo uniones = new listaNodo(infor, null);
        
        if (indice != null){
            listaNodo b = indice;  
            listaNodo c = null;
            
            while ((b != null) && (b.valores < infor)) {
                c = b;
                b = b.next;
            }
            
            if (indice.equals(b)) {
                indice = uniones;
            } else {
                c.next = uniones;
            }
            uniones.next = b;
        }else{
            indice = uniones;
        }
    }
    
    void tamañoDeLista(){
        if (indice != null){
            listaNodo recien = indice;
            
            System.out.print("Tamaño de la lista con todos sus números en orden: ");
            
            while (recien != null){
                System.out.print(recien.valores + " ");
                recien = recien.next;
            }
            System.out.println(" ");
        }else{
            System.out.println("Lista sin elementos");
        }
    }
    
    void enlistarse(){
        if (indice != null){
            listaNodo recien = indice;
            
            System.out.print("Lista de números después de eliminar un elemento: ");

            while (recien != null) {
                System.out.print(recien.valores + " ");
                recien = recien.next;
            }
        }
    }
    
    void encontrar(int infor){
        boolean localizado = false;
        listaNodo no_Localizado = indice;
        
        while ((no_Localizado != null) && (no_Localizado.valores <= infor)) {
            if (no_Localizado.valores == infor) {
                localizado = true;
                break; 
            }
            no_Localizado = no_Localizado.next; 
        }
        if (localizado){
            System.out.println("Se buscó el número: " + infor);
        }else{
            System.out.println("No se localizo el numero: " + infor);
        }
    }
    
    void eliminar(int infor){
        if (indice != null){
            listaNodo remover = indice;
            listaNodo previos = null;
            
            while (remover != null && remover.valores != infor) {
                previos = remover;
                remover = remover.next;
            }
            
            if (previos == null) {
                System.out.println("No se encontro el dato en la lista");
            } else if (previos == null) {
                indice = indice.next;
                System.out.println("El dato se ha eliminado");
            } else {
                previos.next = previos.next;
                System.out.println("El dato se ha eliminado es: " + infor);
            }
        }
    }
    
    void listaPersonal(){
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