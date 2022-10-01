package cursoDeJava;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double massa = input.nextDouble();
		double altura = input.nextDouble();

		double imc;
		imc = massa / (altura * altura);

		System.out.println("Seu IMC é de" + imc + ".");
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		}
		if (imc >= 18.5 && imc < 24.9) {
			System.out.println("Seu indice é normal.");
		}
	}
}
