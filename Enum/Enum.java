package videoaulas;

public class Enum {

	public static void main(String[] args) {
		
		Formulario dia = Formulario.SEGUNDA;
		Formulario sexo = Formulario.MASCULINO;
		
		System.out.println(dia.toString() +"-"+dia.getValor());
		System.out.println(sexo.toString()+"-"+sexo.getSexo());
	}
}
