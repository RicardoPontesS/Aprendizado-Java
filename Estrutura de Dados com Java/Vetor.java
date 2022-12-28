package arrays;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public void adiciona(String elemento) {
		aumentaCapacidade();
		try {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} catch (Exception ArrayIndexOutOfBoundsException) {
			System.out.println("Erro ao alocar elemento.");
		}

	}

	public boolean adiciona(String elemento, int posicao) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		aumentaCapacidade();
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;

	}

	public void removeElemento(int posicao) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}

		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		tamanho--;
	}

	private void aumentaCapacidade() {

		if (this.tamanho == elementos.length) {
			String[] elementosNovos = new String[elementos.length * 2];
			for (int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = elementos[i];
			}
			this.elementos = elementosNovos;
		}

	}

	public int busca(String elemento) {

		int verificador = 0;

		for (int i = 0; i < this.tamanho; i++) {

			if (this.elementos[i].equalsIgnoreCase(elemento)) {
				System.out.println(elementos[i]);
				verificador = i;

			} else {
				verificador = -1;

			}

		}
		return verificador;
	}

	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(" ,");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append("]");
		return s.toString();
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

	public int getTamanho() {
		return tamanho;
	}
}
