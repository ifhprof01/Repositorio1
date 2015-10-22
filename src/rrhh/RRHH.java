/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rrhh;

import java.util.Scanner;

/**
 *
 * @author ifhprof01
 */
public class RRHH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarMenuPrincipal();
        
    }
    
    public static void mostrarMenuPrincipal() {
        System.out.println("1. Gestión de Continentes");
        System.out.println("2. Gestión de Países");
        System.out.println("X. Terminar");
        System.out.println("Introducir opción: ");
        Scanner teclado = new Scanner(System.in);
        String opcion = teclado.nextLine();
        
        switch (opcion) {
            case "1":   mostrarMenuContinentes();
                        break;
            case "X":   System.exit(0);
        }
        
    }
    
    public static void mostrarMenuContinentes () {
        
        
    }
    
}
