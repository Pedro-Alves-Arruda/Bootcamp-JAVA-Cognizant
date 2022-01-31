package exCalendario;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		verificaMes(entrada.nextInt());
		

	}
	
	public static void verificaMes(int numMes) {
		if (numMes == 1) {
			System.out.println("Janeiro");
		}
		if (numMes == 2) {
			System.out.println("Fevereiro");
		}
		if (numMes == 3) {
			System.out.println("Março");
		}
		if (numMes == 4) {
			System.out.println("Abril");
		}
		if (numMes == 5) {
			System.out.println("Maio");
		}
		if (numMes == 6) {
			System.out.println("Junho");
		}
		if (numMes == 7) {
			System.out.println("Julho");
		}
		if (numMes == 8) {
			System.out.println("Agosto");
		}
		if (numMes == 9) {
			System.out.println("Setembro");
		}
		if (numMes == 10) {
			System.out.println("Outubro");
		}
		if (numMes == 11) {
			System.out.println("Novembro");
		}
		if (numMes == 12) {
			System.out.println("Dezembro");
		}
		
		feriasOuNao(numMes);
			
		
	}
	
	public static void feriasOuNao(int numMes) {
		if(numMes == 1 || numMes == 12 || numMes == 7) {
			System.out.println("\n\nFERIASSSS !!!!!!!");
		}else {
			System.out.println("Ainda não está de ferias !!!!");
		}
	}

}
