package videoaulas;

public class MinhaThread extends Thread {

	private String nome;
	private int tempo;

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(nome + "Contador" + i);
			try {
				Thread.sleep(tempo);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Theread terminada");
	}

	public MinhaThread(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

}
