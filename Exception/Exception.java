package videoaulas;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

//Exception simples
		int[] vetor = new int[4];
		try {

			System.out.println("Antes da exceção: ");
			vetor[4] = 1;

		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Erro ao acessar index do vetor. ");
		}

		System.out.println("Fora da exceção. ");

//Multiplas exceções 
		int[] numeros = { 12, 4, 2, 7, 8, 0 };
		int[] denominadores = { 1, 2, 0, 4, 2 };

				for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.printf("%d / %d = %d\n", numeros[i], denominadores[i], numeros[i] / denominadores[i]);

			} catch (ArithmeticException exception) {
				System.out.println("\nErro de aritmética. ");
			} catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println("Erro ao acessar index do vetor. ");
			} catch (Throwable execpetion) {
				System.out.println("O correu um erro. ");
			} finally {
				System.out.println("Essa linha é impressa sempre após o try/catch");
			}
		}
	}
}
