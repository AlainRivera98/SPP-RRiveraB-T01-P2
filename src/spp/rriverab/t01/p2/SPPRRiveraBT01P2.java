//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11

package spp.rriverab.t01.p2;

import java.util.Scanner;
        

public class SPPRRiveraBT01P2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        double base, altu, sup, per;
        
        System.out.println("Calculadora de áreas y perímetros de rectángulos \n");
        
        System.out.println("Introduzca la medida de la base del rectángulo: ");
        base = teclado.nextDouble();
        System.out.println("Introduzca la medida de la altura del rectángulo: ");
        altu = teclado.nextDouble();
        
        sup = base*altu;
        per = 2*(base + altu);
        
        System.out.println("La superficie del rectángulo es: " +sup);
        System.out.println("El períemtro del rectángulo es: " +per);
        
        
    }
    
}
