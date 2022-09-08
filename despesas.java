package cursoDeJava;

import java.util.Scanner;

public class despesas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Qual é sua renda mensal?");
		Double rendaMes = input.nextDouble();

		System.out.println("Qual é o valor de sua conta de luz?");
		Double contaLuz = input.nextDouble();

		System.out.println("Qual é o valor de sua conta de internet?");
		Double contaCelular = input.nextDouble();

		System.out.println("Qual é valor da sua conta de seguro?");
		Double contaSeguro = input.nextDouble();

		double gastoTotal = contaLuz + contaCelular + contaSeguro;
		System.out.println("Seu gasto mensal é de " + gastoTotal);

		if (gastoTotal > rendaMes) {
			System.out.println("Abaixar os custos");
		} else {
			System.out.println("Deu bom");

		}

	}

}
