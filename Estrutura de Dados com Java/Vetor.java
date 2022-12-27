package arrays;

import java.util.Arrays;

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

	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i=0;i<this.tamanho-1;i++) {
			s.append(this.elementos[i]);
			s.append(" ,");
		}
		
		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
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
