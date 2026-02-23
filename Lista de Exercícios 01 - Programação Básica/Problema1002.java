/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1002;

/**
 *
 * @author samue
 */
import java.util.Scanner;
public class Problema1002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor do raio: ");
        double raio = scan.nextDouble();
        double pi = 3.14159;
        double area = 2 * pi * raio;
        System.out.println("O valor da área da circunferência é de: " + area);
        
    }
    
}
