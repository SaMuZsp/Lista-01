/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1009;

/**
 *
 * @author samue
 */
import java.util.Scanner;
public class Problema1009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Insira o número do funcionário: ");
       String nome = scan.nextLine();
       System.out.println("Insira o salário fixo desse funcionário: ");
       double salario = scan.nextDouble();
       System.out.println("Insira o total de vendas desse funcionário: ");
       double vendas = scan.nextDouble();
       double total = salario*(vendas*15/100);
       System.out.println("O nome do funcionário é: " + nome);
       System.out.printf("O valor do salário do funcionário é de %.2f ", total);
       System.out.println();
       
       
    }
    
}
