package videoaulas;

public class Animal {
	
	private String especie;
	private String raca;
	private int idColeira;
	private String enderecoDono;
	
	public void ImprimeInformacoes() {
		System.out.printf("Id de indentifica��o do animal: %d\n",idColeira);
		System.out.printf("Endere�o do tutor: %s\n",enderecoDono);
		System.out.printf("Ra�a: %s\n",raca);
		System.out.printf("Esp�cie: %s\n",especie);
	}
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getIdColeira() {
		return idColeira;
	}
	public void setIdColeira(int idColeira) {
		this.idColeira = idColeira;
	}
	public String getEnderecoDono() {
		return enderecoDono;
	}
	public void setEnderecoDono(String enderecoDono) {
		this.enderecoDono = enderecoDono;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
}
