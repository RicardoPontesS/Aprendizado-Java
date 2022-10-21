package videoaulas;

import java.util.Random;

public class Soma {

	public static void main(String[] args) {
		soma();
	}
	
	static void soma() {
		Random geradorAleatorio = new Random();

		int[] numeros = new int[5];
		int soma = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = geradorAleatorio.nextInt(50);
			soma += numeros[i];
		}
		System.out.printf("A soma dos números foi de: %d",soma);

	}
	
}
