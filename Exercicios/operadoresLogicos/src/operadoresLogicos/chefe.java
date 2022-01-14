package operadoresLogicos;

import java.util.Scanner;

public class chefe extends operadoresLogicos.pessoa{
Scanner entrada = new Scanner(System.in);
	
	public chefe(String cargo) {
		System.out.println("Bom dia, digite seus dados:"
				+ "\nNome: (coloque '_' entre nome e sobrenome)");
		this.nome = entrada.next();
		
		System.out.println("Idade:");
		this.idade = entrada.nextInt();
		
		this.cargo = cargo;
		
		System.out.println("CPF:");
		this.cpf = entrada.next();
		
		System.out.println("Numero de dependentes:");
		this.numDependentes = entrada.nextInt();
		
		System.out.println("Anos de empresa:");
		this.anosEmpresa = entrada.nextFloat();
		
		showId();
		verificaAuxilio(this.numDependentes, this.anosEmpresa);
		
	}
	
	public void verificaAuxilio(int qtdDependentes,Float anosEmpresa) {
		if(qtdDependentes > 4 && anosEmpresa > 5) {
			System.out.println("Parabéns, o senhor se qualifica para o auxilio funcionario\n");
			for(int cont = 0; cont <= 4; cont++) {
				System.out.print(String.format("%.0f", 5 +  Math.random() * (10 - 5)));
				
			}
		System.out.println("\nGuarde o numero acima, ele é seu codigo de retirada do auxilio no RH");
		
		}else {
			System.out.println("Infelizmente o senhor não se qualifica para o auxilio da empresa"
					+ ", para o senhor se qualificar deve seguir as regras abaixo:"
					+ "\nQuantidade de dependentes: 3 ou +"
					+ "\nAnos de empresa: 1 ou +"
					+ "\nCargo: Pião");
		}
	}
	
	public void showId() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("CPF: "+ this.cpf);
		System.out.println("Idade: " + this.idade);
		System.out.println("Cargo: "+ this.cargo);
		System.out.println("Quantidade de dependentes: "+ this.numDependentes);
		System.out.println("Anos de empresa: "+ this.anosEmpresa+"\n\n");
	}
	

}
