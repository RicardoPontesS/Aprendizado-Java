package videoaulas;

public class Animal {
	
	private String especie;
	private String raca;
	private int idColeira;
	private String enderecoDono;
	
	public void ImprimeInformacoes() {
		System.out.printf("Id de indentificação do animal: %d\n",idColeira);
		System.out.printf("Endereço do tutor: %s\n",enderecoDono);
		System.out.printf("Raça: %s\n",raca);
		System.out.printf("Espécie: %s\n",especie);
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
