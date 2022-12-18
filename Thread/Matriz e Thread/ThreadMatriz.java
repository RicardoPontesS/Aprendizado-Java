package videoaulas;

public class ThreadMatriz implements Runnable {

	private String nome;
	int[][] matriz = new int[3][3];
	int limite;

	public ThreadMatriz(String nome, int[][] matriz, int limite) {
		super();
		this.nome = nome;
		this.matriz = matriz;
		this.limite = limite;
		Thread thread = new Thread(this);
		thread.start();
	}

	synchronized void somaMatriz() {
		int soma = 0;
		int i = limite;
		int j = 0;
		System.out.println("Executando: " + nome);
		for (j = 0; j < matriz.length; j++) {
			soma = soma + matriz[i][j];
		}
		System.out.println("Soma: " + soma);
	}

	@Override
	public void run() {

		somaMatriz();
	}
}
