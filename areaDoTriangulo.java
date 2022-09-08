package cursoDeJava;

import java.util.Scanner;

public class areaDoTriangulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe a base do triangulo");
		double base = input.nextDouble();

		System.out.println("Informe a altura do triangulo");
		double altura = input.nextDouble();

		System.out.println("Temos um triangulo com base e altura de " + base);
		System.out.println("E altura de" + altura);

		double resultadoMultiplicado = altura * base;
		double resolucao = resultadoMultiplicado / 2;

		System.out.println("A area do triangulo é de " + resolucao);
	}
}