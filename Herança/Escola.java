package videoaulas;

public class Escola {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		aluno.setEndereco("Rua 41 , Alameda verde");
		professor.setEndereco("Rua 4, parque alburqueque");
		
		System.out.println(aluno.obterEndereco());
		System.out.println(professor.obterEndereco());

	}

}
