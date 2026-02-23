/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1010;

/**
 *
 * @author samue
 */
import java.util.Scanner;
public class Problema1010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Insira o código do primeiro produto: ");
       double codigo = scan.nextDouble();
       System.out.println("Insira a quantidade comprada desse produto: ");
       double quantidade = scan.nextDouble();
       System.out.println("Insira o valor unitário desse produto: ");
       double valor = scan.nextDouble();
       System.out.println("Insira o código do segundo produto: ");
       double codigo2 = scan.nextDouble();
       System.out.println("Insira a quantidade comprada desse produto: ");
       double quantidade2 = scan.nextDouble();
       System.out.println("Insira o valor unitário desse produto: ");
       double valor2 = scan.nextDouble();
       double total = (valor * quantidade) + (valor2 * quantidade2);
       System.out.println("O código do primeiro produto é: " + codigo);
       System.out.println("O código do segundo produto é: " + codigo2);
       System.out.println("O valor total a ser pago é de " + total);
       
       
    }
    
}
