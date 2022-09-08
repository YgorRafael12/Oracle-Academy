package cursoDeJava;

public class ICM2 {

	public static void main(String[] args) {
		double massa = 98;
		double altura = 2.04;
		double imc = massa / (altura * altura);

		System.out.println("Seu indice é de:" + imc);
		if (imc < 18.5) {
			System.out.println("Seu indice é magreza");
		} else {
			if (imc >= 18.5 && imc < 24.9) {
				System.out.println("Seu indice é normal");
			} else {
				if (imc >= 18.5 && imc < 24.9) {
					System.out.println("Seu indice é sobrepeso");
				} else {
					if (imc >= 30) {
						System.out.println("Seu indice é obesidade");
					}
				}
			}
		}
	}
}