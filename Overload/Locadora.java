package videoaulas;
import java.util.Scanner;

public class Locadora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FrotaVans ClienteArnaldo = new FrotaVans();
		
		System.out.print("O cliente possui algum tipo de deficiência? ");
		ClienteArnaldo.setPCD(input.nextLine());;
		
		System.out.println(ClienteArnaldo.getPCD());
		
		if(ClienteArnaldo.getPCD().equals("sim")) {
			ClienteArnaldo.calculaValor(ClienteArnaldo.getPCD(),ClienteArnaldo.getSpinPCD());
		}else {
			ClienteArnaldo.calculaValor(ClienteArnaldo.getKombi());
		}
	}

}
