package comparacoes;

import java.io.IOException;
import java.util.Scanner;

public class comparacao {
	
	public comparacao(){
		int opcao= 0;
		int num1, num2;
		float n1,n2;
		double numero1, numero2;
		boolean exp1, exp2;
		String txt1, txt2;
		
		Scanner entrada = new Scanner(System.in);
		final String os = System.getProperty("os.name");
		
		while(opcao != 6) {
		
		System.out.println("Este programa recolhe dois valores do usuario e retorna se eles são iguais ou não, escolha qual das comparações abaixo deseja fazer:"
				+ "\n1 - Numero inteiro"
				+ "\n2 - Numero Decimal"
				+ "\n3 - Numeros deciamis grandes"
				+ "\n4 - comparação entre texto"
				+ "\n5 - comparação Logica"
				+ "\n6 - sair");
		opcao = entrada.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("Digite o numero inteiro 1:");
				num1 = entrada.nextInt();
				System.out.println("Digite o numero interio 2:");
				num2 = entrada.nextInt();
				compara(num1, num2);
				
			case 2:
				System.out.println("Digite o numero Decimal 1:");
				n1 = entrada.nextFloat();
				System.out.println("Digite o numero Decimal 2:");
				n2 = entrada.nextFloat();
				compara(n1, n2);
				break;
			case 3:
				System.out.println("Digite o primeiro numero Decimal com mais casas 1:");
				numero1 = entrada.nextDouble();
				System.out.println("Digite o segundo numero Decimal com mais casas 2:");
				numero2 = entrada.nextDouble();
				compara(numero1, numero2);
				break;
			case 4:
				System.out.println("Digite o texto 1:");
				txt1 = entrada.next();
				System.out.println("Digite o texto 2:");
				txt2 = entrada.next();
				compara(txt1, txt2);
				break;
			case 5:
				System.out.println("Digite o primeiro valor logico:");
				exp1 = entrada.nextBoolean();
				System.out.println("Digite o segundo valor logico: ");
				exp2 = entrada.nextBoolean();
				compara(exp1, exp2);
				break;
		}
		
		}
	}
	
	public  void compara(int num1, int num2 ) {
		if(num1 == num2) {
			System.out.println("\nEstes numeros são iguais");
		}else {
			System.out.println("\nEstes numeros são diferentes");
		}
		
	}
		
	public void compara(boolean exp1, boolean exp2) {
		if(exp1 == exp2) {
			System.out.println("\nA primeira expressão e a segunda retornaram valores iguais");
		}else {
			System.out.println("\nAs expressões retornaram valores diferentes ");
		}
		
	}
	
	
	public static void compara(float num1, float num2) {
		if(num1 == num2) {
			System.out.println("\nEstes numeros são iguais");
		}else {
			System.out.println("\nEstes numeros são diferentes");
		}
			
	}
	
	
	public static void compara(String txt1, String txt2) {
		if(txt1 == txt2) {
			System.out.println("\nOs dois textos são iguais");
		}else {
			System.out.println("\nOs dois textos são diferentes");
		}
	
	}
	
	public static void compara(double num1, double num2) {
		if(num1 == num2) {
			System.out.println("\nEstes numeros são iguais");
		}else {
			System.out.println("\nEstes numeros são diferentes");
		}
	
	}
	
}
