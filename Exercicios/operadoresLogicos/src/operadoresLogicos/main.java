package operadoresLogicos;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String cargo;
		
		System.out.println("Bom dia, vamos come�ar"
				+ "\nDigite o seu cargo: (Pi�o ou chefe)");
		
		cargo = entrada.next();
		
		if(cargo.equals("Pi�o")){
			funcionario fun = new funcionario(cargo);
		}else {
			chefe chefe = new chefe(cargo);
		}
		
	}
}
