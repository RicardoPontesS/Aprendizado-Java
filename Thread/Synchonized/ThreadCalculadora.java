package videoaulas;

public class ThreadCalculadora implements Runnable {

	private String nome;
	private int[] numeros;
	private static Calculadora calculadora = new Calculadora();

	public ThreadCalculadora(String nome, int[] numeros) {
		this.nome = nome;
		this.numeros = numeros;
		Thread thread = new Thread(this, nome);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println(this.nome + " iniciada");
		int soma = calculadora.somaArray(this.numeros);
		System.out.println("O resultado da soma da thread é de: " + soma);
		System.out.println(this.nome + " Terminou a execução");
	}

}
