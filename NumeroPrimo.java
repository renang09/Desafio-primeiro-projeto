import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um n?mero: ");
		int numero = scan.nextInt();

		System.out.println();
		if (numero % 2 == 0 || numero % 3 == 0) {
			System.out.println("Esse n?mero n?o ? primo");

		} else {
			System.out.println("Esse n?mero ? primo ");
		}

		System.out.println("Esse n?mero ? divis?vel por: ");
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				System.out.print(i + "," );
			}

		}
		System.out.print(numero);
	}

}
