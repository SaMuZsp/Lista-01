/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1008;

/**
 *
 * @author samue
 */
import java.util.Scanner;
public class Problema1008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Insira o número do funcionário: ");
       int numero = scan.nextInt();
       System.out.println("Insira as horas trabalhadas desse funcionário: ");
       double horas = scan.nextDouble();
       System.out.println("Insira o valor por hora: ");
       double valor = scan.nextDouble();
       double salario = valor * horas;
       System.out.println("O número do funcionário é: " + numero);
       System.out.printf("O valor do salário do funcionário é de %.2f ", salario);
       System.out.println();
       
       
    }
    
}
