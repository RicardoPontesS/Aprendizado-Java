package videoaulas;

public class FrotaVans {

	private String PCD;
	private String SpinPCD;
	private String kombi;

	public void calculaValor(String PCD, String SpinPCD) {
		System.out.printf("Valor da locação do carro 'Spin PCD' é de %d a diária.",70);
	}
	
	public void calculaValor(String kombi) {
		System.out.printf("Valor da locação do carro 'Kombi' é de %d a diária.",50);
	}

	public String getPCD() {
		return PCD;
	}

	public void setPCD(String pCD) {
		PCD = pCD;
	}
	
	public String getSpinPCD() {
		return SpinPCD;
	}

	public void setSpinPCD(String spinPCD) {
		SpinPCD = spinPCD;
	}

	public String getKombi() {
		return kombi;
	}

	public void setKombi(String kombi) {
		this.kombi = kombi;
	}

}
