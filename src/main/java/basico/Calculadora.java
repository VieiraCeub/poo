package basico;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	boolean ligada = true;
        System.out.println("Calculadora Simples");
    	while (ligada) {	        
	        System.out.println("Escolha uma operação:");
	        System.out.println("1. Adição");
	        System.out.println("2. Subtração");
	        System.out.println("3. Sair");
	        
	        int escolha = scanner.nextInt();
	        
	        System.out.println("Digite o primeiro número:");
	        double numero1 = scanner.nextDouble();
	        
	        System.out.println("Digite o segundo número:");
	        double numero2 = scanner.nextDouble();
	        
	        double resultado = 0;
	        
	        switch (escolha) {
	            case 1:
	                resultado = numero1 + numero2;
	                break;
	            case 2:
	                resultado = numero1 - numero2;
	                break;
	            
	            case 3:
	                ligada = false;
	                break;
	            default:
	                System.out.println("Opção inválida.");
	                System.exit(0);
	        }
	        
	        System.out.println("Resultado: " + resultado);
    	}
        scanner.close();
    }
}