package cursoDeJava;

public class ICM3 {
	public static void main(String[] args) {
		double massa = 67;
		double altura = 1.88;

		double icm = massa / (altura * altura);
		System.out.println("Seu ICM é" + icm);

		if (icm < 18.5) {
			System.out.println("Seu indice é magreza");
		} else if (icm >= 18.5 && icm < 24.9) {
			System.out.println("Seu indice é normal");
		} else if (icm >= 24.9 && icm < 30) {
			System.out.println("Seu indce é sobrepeso");
		} else {
			System.out.println("Seu indice é obesidade");
		}
	}
}