/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1005;

/**
 *
 * @author samue
 */
import java.util.Scanner;
public class Problema1005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um valor A: ");
        float valorA = scan.nextFloat();
        System.out.println("Insira um valor B: ");
        float valorB = scan.nextFloat();
        float media = (float) (((valorA*3.5) + (valorB*7.5))/11);
        System.out.printf("A média ponderada dos valores inseridos é de: %.5f", media);
        System.out.println();
 
    }
    
}
