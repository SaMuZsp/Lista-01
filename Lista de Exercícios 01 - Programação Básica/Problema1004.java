/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1004;

/**
 *
 * @author samue
 */
import java.util.Scanner;
public class Problema1004 {

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
        int produto = valorA * valorB;
        System.out.println("PROD = " + produto);
 
    }
    
}
