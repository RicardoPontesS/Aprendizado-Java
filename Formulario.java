package videoaulas;

public enum Formulario {
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7),MASCULINO('M'), FEMININO('F');

	private char sexo;
	private int valor;

	Formulario(char sexo) {
		this.sexo = sexo;
	}
	
	Formulario(int valor){
		this.valor = valor;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
