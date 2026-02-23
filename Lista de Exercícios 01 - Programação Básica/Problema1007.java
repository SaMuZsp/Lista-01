/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1007;

/**
 *
 * @author samue
 */
import java.util.Scanner;
public class Problema1007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um valor A: ");
        int valorA = scan.nextInt();
        System.out.println("Insira um valor B: ");
        int valorB = scan.nextInt();
        System.out.println("Insira um valor C: ");
        int valorC = scan.nextInt();
        System.out.println("Insira um valor D: ");
        int valorD = scan.nextInt();
        int diferenca = valorA * valorB - valorC * valorD;
        System.out.println("DIFERENCA = " + diferenca);
 
    }
    
}
