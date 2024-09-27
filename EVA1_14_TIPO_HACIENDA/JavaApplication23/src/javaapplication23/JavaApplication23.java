/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication23;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */  
    public static void main(String[] args) {
        // TODO code application logic here
        int km , meses;
        Scanner captu = new Scaner (System.in);
        System.out.println("Cuanto kilometraje tiene el vehículo?");
        km = captu.nextInt();
        captu.nextLine();
        System.out.println("Cuanto meses tiene el vehículo?");
        meses = captu.nextInt();
        captu.nextLine();
        
        if((km >== 5000) || (meses >= 6))
            System.out.println("Cambio de aceite");
        else
            System.out.println("Vehículo en buenas condiciones");
        }
        
    }
    
}
