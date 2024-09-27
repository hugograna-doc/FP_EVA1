/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_operaciones;

/**
 *
 * @author invitado
 */
public class EVA1_operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //TODE
        
        int x = 10; //declaracion y asignacion;
        int y = 5;
        //Declaración de multiples variables del mismo tipo.
        int suma, resta, divi, multi, pot, raiz;
        //SUMA Y RESTA
        suma = x + y; //operador de suma +
        System.out.println("Suma de x + y");
        System.out.println(suma);
        resta = x - y;  //operador de diferencia
        System.out.println("Resta de x - y");
        System.out.println(resta);
        
        //MULTIPLICACIÓN
        multi = x * y;
        System.out.println("Multiplicacion de x * y");
        System.out.println(multi);
        
        //DIVISIÓN   -->El manejo de tipos de datos
        //Si dividimos enteros, Java da como resultado un entero
        divi = x/ y;
        System.out.println("Dicisión de x / y");
        System.out.println(divi);
        //cambiamos los valores de x y
        x = 5;
        y = 2;
        divi = x / y;
        System.out.println("División x(5) / y(2)");
        System.out.println(divi);
        
        double val1 = 11;   // se guarda en una variable double
        double val2 = 3;
        double diviD;
        diviD = val1 / val2;
        System.out.println("División entre # decimales");
        System.out.println(diviD);
        
        
// TODO code application logic here
       
    }
    
}
