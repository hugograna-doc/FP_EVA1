/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAMOS VARIABLES
        String marca;
        String modelo;
        int year;
        double precio;
        //¿como se captura?
        //SCANNER
        // Herramienta  --> nos proporcina muchas herramientas 
        Scanner captu; //declaramos la herramienta previamente 
                       //hay que importarla (hacer un import)
        captu = new Scanner(System.in); //creamos la herramienta
        
        //HAY QUE INDICARLE AL USUARIO QUE CAPTURAR 
        System.out.println("Introduce la marca del vahículo");
        //capturamos -->asignación
        marca = captu.nextLine();//Les regresa todo el texto hasta cua
                                 //se presiona la tecla "enter"
        System.out.println("Introduce el modelo del vehículo");
        modelo = captu.nextLine();
        System.out.println("Introduce el año");
        year = captu.nextInt();
        System.out.println("Introduce el precio");
        precio = captu.nextDouble();
        
         
        System.out.println("DATOS CAPTURADOS-------------");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio); 
    }
    
}
