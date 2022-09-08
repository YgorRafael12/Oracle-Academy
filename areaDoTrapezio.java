package cursoDeJava;

import java.util.Scanner;

public class areaDoTrapezio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe a base maior do trapezio");
		double baseMaior = input.nextDouble();

		System.out.println("Informe a base menor do trapezio");
		double baseMenor = input.nextDouble();

		System.out.println("Informe a altura do trapezio");
		double altura = input.nextDouble();

		double adicaoEMultiplicacao = baseMaior + baseMenor * altura;
		double resultadoFinal = adicaoEMultiplicacao / 2;

		System.out.println("A area do trapezio é de:" + resultadoFinal);
	}
}