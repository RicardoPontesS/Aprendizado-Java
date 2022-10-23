package videoaulas;

public class Aluno extends DadosBasicos {

	private String cursos;
	private double[] notas;

	public double calcularMedia() {

		return 0;
	}

	public boolean verificaAprovado() {

		return true;
	}

	// ------------------------------------
	public Aluno() {
		
	}
	
	public Aluno(String nome, String endereco, String telefone, String cpf,String curso) {
		super(nome, endereco, telefone, cpf);
		this.cursos = curso;
	}
	
	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
//-----------------------------------
}
