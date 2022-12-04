package videoaulas;

public class Enum {

	public static void main(String[] args) {
		
		Formulario dia = Formulario.SEGUNDA;
		Formulario sexo = Formulario.MASCULINO;
		
		System.out.println(dia.toString() +"-"+dia.getValor());
		System.out.println(sexo.toString()+"-"+sexo.getSexo());
		
		/*
		
		Formulario[] forms = Formulario.values(); //Retorna um array de todos os valores dentro do Enum
		
		for(int i = 0; i<forms.length; i++) { 
			System.out.println(forms[i]);
		}
		
		for(Formulario form: Formulario.values()) {
			System.out.println(form);
		}
		
		/*
	}
}
