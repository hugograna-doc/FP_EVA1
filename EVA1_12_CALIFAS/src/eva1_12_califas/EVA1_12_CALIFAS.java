/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_12_califas;

/**
 *
 * @author invitado
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */import java.util.Scanner;
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR VARIABLES PARA LA CALIFICACIÓN
        //EVALUAR SI ACREDITAS (MAYOR O IGUAL A 70)
        //O NO ACREDITAS (NA-->MENOR A 70)
        int cali;
        Scanner captu = new Scanner (System. in);
        System.out.println("¿Cuál es tu calificación");
        cali = captu.nextInt();
        //EVALUAR SI ACREDITAS (MAYOR O IGUAL A 70
        //NO ACREDITAS (NA --> MENOR A 70)
        if (cali < 70){
            System.out.println("NA");
        }else{
            System.out.println("NA");
        }
    }
    
}
