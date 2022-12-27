package arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public void adiciona(String elemento) {

		try {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} catch (Exception ArrayIndexOutOfBoundsException) {
			System.out.println("Erro ao alocar elemento.");
		}

	}

//---------------------------------------------
	public Vetor(int capacidade) {
		elementos = new String[capacidade];
		tamanho = 0;
	}

	public String[] getElementos() {
		return elementos;
	}

	public void setElementos(String[] elementos) {
		this.elementos = elementos;
	}

}
