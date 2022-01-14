package calculaArea;

public class operacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculaArea(2);
		calculaArea(2,4);
		calculaArea(2,4,4);

	}
	
	public static void calculaArea(int lados) {
		System.out.println("A area do quadrado de lado " + lados + " é igual á " + lados * lados);
	}
	
	public static void calculaArea(int base, int altura) {
		System.out.println("A area do triangulo de base " + base + " e altura " + altura+ " é igual a " + (base * altura)/2);
	}
	
	public static void calculaArea(int baseMaior, int baseMenor, int altura) {
		System.out.println("A area do trapezio de Base menor " + baseMenor+ " e base maior " + baseMaior+ " e altura "+altura+" é igual a "+ ((baseMaior+baseMenor)*altura)/2);
	}

}
