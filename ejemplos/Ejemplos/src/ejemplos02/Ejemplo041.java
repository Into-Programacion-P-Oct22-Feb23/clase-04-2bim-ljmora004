/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

import java.util.Scanner;

public class Ejemplo041 {

    public static void main(String[] args) {
        //
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer valor:");
        int primerValor = entrada.nextInt();
        System.out.println("Ingrese el segundo valor:");
        int segundoValor = entrada.nextInt();
        
        obtenerSuma(primerValor, segundoValor); 
        
    }
        
    public static void obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);
        
    }
    
    
}
