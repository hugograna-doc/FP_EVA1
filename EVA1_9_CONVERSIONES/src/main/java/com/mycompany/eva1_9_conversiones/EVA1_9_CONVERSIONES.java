/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_conversiones;

import java.util.Scanner;

/**
 *
 * @author Un pendejo
 */
public class EVA1_9_CONVERSIONES {

    public static void main(String[] args) {
        double far, cent;
        Scanner captu = new Scanner(System.in);
        System.out.println("Temperatura en grados farenheit:");
        far = captu.nextDouble();
        cent = (far - 32) / 1.8;
        System.out.println("°c = " + cent);
        //CONVERTIR AHORA DE CENTIGRADOS A FARENHEIT
        //CONVERTIR DE CENTIGRADOS A KELVIN
        System.out.println("Temperatura en grados centigrados");
        cent = captu.nextDouble();
        far = (cent * 1.8 + 32);
        System.out.println("°f +" + far);

    }
}
