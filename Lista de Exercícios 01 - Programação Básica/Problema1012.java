/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1012;

/**
 *
 * @author samue
 */
import java.util.Scanner;
public class Problema1012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um valor A (Lado 1): ");
        double lado1 = scan.nextDouble();
        System.out.println("Insira um valor B (Altura): ");
        double altura = scan.nextDouble();
        System.out.println("Insira um valor C (Raio): ");
        double raio = scan.nextDouble();
        System.out.println("Insira um valor D (Lado2)");
        double pi = 3.14159;
        double lado2 = scan.nextDouble();
        double triangulo = (lado1*altura)/2;
        double circulo = 2 * pi * raio;
        double trapezio = ((lado1 + lado2)*altura)/2;
        double quadrado = lado1 * altura;
        double retangulo = lado1 * altura;
        System.out.println("TRIÂNGULO: " + triangulo);
        System.out.println("CÍRCULO: " + circulo);
        System.out.println("TRAPÉZIO: " + trapezio);
        System.out.println("QUADRADO: " + quadrado);
        System.out.println("RETÂNGULO: " + retangulo);
 
    }
    
}
