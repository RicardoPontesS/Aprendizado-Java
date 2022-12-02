package videoaulas;

public class Enum {

	public static void main(String[] args) {
		usandoEnum(); 
	}
	
	private static void usandoEnum(){
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	
	private static void imprimeDiaSemana(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda Feira");
			break;
		case TERCA:
			System.out.println("Terça Feira");
			break;
		case QUARTA:
			System.out.println("Quarta Feira");
			break;
		case QUINTA:
			System.out.println("Quinta Feira");
			break;
		case SEXTA:
			System.out.println("Sexta Feira");
			break;
		case SABADO:
			System.out.println("Sábado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
	 
		}
	}
}
