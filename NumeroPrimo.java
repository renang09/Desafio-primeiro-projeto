import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = scan.nextInt();

		System.out.println();
		if (numero % 2 == 0 || numero % 3 == 0) {
			System.out.println("Esse número não é primo");

		} else {
			System.out.println("Esse número é primo ");
		}

		System.out.println("Esse número é divisível por: ");
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				System.out.print(i + "," );
			}

		}
		System.out.print(numero);
	}

}
