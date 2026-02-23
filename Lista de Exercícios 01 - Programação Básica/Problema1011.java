/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1011;

/**
 *
 * @author samue
 */
import java.util.Scanner;
public class Problema1011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor do raio: ");
        double raio = scan.nextDouble();
        double pi = 3.14159;
        double volume = (4/3*pi*raio*raio*raio);
        System.out.printf("O valor do volume da esfera é de: %.2f", volume);
        System.out.println();
        
    }
    
}
