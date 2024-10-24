/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author Un pendejo
 */
public class EVA1_6_PELICULA {

    public static void main(String[] args) {
       String nombre;
       String genero;
       String reparto;
       String clasificacion;
       int duracion;
        
       Scanner captu;
        captu = new Scanner (System.in);
      
        System.out.println("captura el nombre de la pelicula:");
        nombre = captu.nextLine();
        System.out.println("captura el genero:");
        genero = captu.nextLine();
        System.out.println("captura la duración de la pelicula:");
        duracion = captu.nextInt();
        System.out.println("captura el reparto:");
        reparto = captu.nextLine();
        System.out.println("captura la clasificación:");
        clasificacion = captu.nextLine();
        
        
        System.out.println("IMPRESION DE LOS DATOS:");
        System.out.println(nombre);
        System.out.println(genero);
        System.out.println(duracion);
        System.out.println(reparto);
        System.out.println(clasificacion);

    }
}
