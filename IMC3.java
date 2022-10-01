package cursoDeJava;

public class IMC3 {
	public static void main(String[] args) {
		double massa = 145;
		double altura = 1.33;
		double imc = massa / (altura * altura);

		System.out.println("Seu IMC é de: " + imc);

		if (imc < 18.5) {
			System.out.println("Seu índice é magreza");
		} else if (imc >= 18.5 &&  imc < 24.9) {
			System.out.println("Seu índice é normal");
		} else if (imc >= 24.9 && imc < 30) {
			System.out.println("Seu índice é sobrepeso");
		} else
			System.out.println("Seu indice é obesidade");
		}
	}