package videoaulas;

public class Professor extends DadosBasicos{
	
	private String departamento;
	private String nomeCurso;
	private double salario;
	
	public double calcularSalarioLiquido() {
		
		return 0;
	}
	
	public String obterEndereco() {
		String end = "Endereço do professor: " + super.getEndereco();
		return end;
	}
	
	
//----------------------------------------------------	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
//----------------------------------------------------		
	
}
