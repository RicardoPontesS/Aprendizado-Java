package videoaulas;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {

		int[] vector = new int[4];
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Antes da exceção: ");
			vector[4] = 1;
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Erro ao acessar index do vetor. ");
		}
		System.out.println("Fora da exceção. ");
	}

}
