/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_if;

/**
 *
 * @author invitado
 */import java.util.Scanner;
public class EVA1_11_IF {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic herE
        //CONDICIONAL
        //LÓGICA BOLEANA -->OPERACIONES DE VERDADERO O FALSO
        //SOLICITAR LA EDAD EN AÑOS.
        int edad;
     Scanner captu = new Scanner (System.in);
     System.out.println("Captura la edad:");
     edad = captu.nextInt();
     //DETERMINAR SI ES UN ADULTO O NO
     //LAS OPERACIONES LÓGICAS SOLO GENERAN COMO RESULTADOUN VERDADERO O FALSO
     //si son varias instrucciones, hay que agruparlas con llaves{}
     if(edad >= 18){//BLOQUE PARA EL VERDADERO    
        System.out.println("Es un adulto");
     }else{//BLOQUE PARA FALSO (OPCIONAL)
         System.out.println("MENOR DE EDAD!!");
     }
         
         
    }
    
}
