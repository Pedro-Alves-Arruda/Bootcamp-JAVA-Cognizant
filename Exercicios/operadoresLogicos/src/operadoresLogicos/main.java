package operadoresLogicos;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String cargo;
		
		System.out.println("Bom dia, vamos começar"
				+ "\nDigite o seu cargo: (Pião ou chefe)");
		
		cargo = entrada.next();
		
		if(cargo.equals("Pião")){
			funcionario fun = new funcionario(cargo);
		}else {
			chefe chefe = new chefe(cargo);
		}
		
	}
}
