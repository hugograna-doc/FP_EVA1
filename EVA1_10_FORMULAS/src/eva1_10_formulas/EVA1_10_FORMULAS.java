/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_formulas;

/**
 *
 * @author invitado
 */
import for java.util.Scanner
public class EVA1_10_FORMULAS {
    private static double t;
    private static String d;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     double vel, acelera, tiemp, dist;
             Scanner captu = new Scanner (System.in);
             Scanner captu = new Scanner (System.in);
             
             System.out.println("Velocidad inicial: ");
           vel= captu.nextDouble();
             System.out.println("tiempo: ");
             tiemp = captu.nextDouble();
             System.out.println();
             System.out.println("Aceleracion:");
             acelera = captu.nextDouble();
       dist=vel * tiemp + (acelera * t * t) / 2;
       System.out.println("Distancia = " + d);
    }
    
}
