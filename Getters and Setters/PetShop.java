package videoaulas;

import java.util.Random;
import java.util.Scanner;

public class PetShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random gerador = new Random();
		
		Animal cadastroAnimal = new Animal();

		System.out.println("Por favor, digite o endere�o de resid�ncia do tutor do animal: ");
		cadastroAnimal.setEnderecoDono(input.nextLine());
		
		System.out.print("Esp�cie do animal: ");
		cadastroAnimal.setEspecie(input.nextLine());
		
		cadastroAnimal.setIdColeira(gerador.nextInt(100));
		
		System.out.print("Ra�a do animal: ");
		cadastroAnimal.setRaca(input.nextLine());
		
		System.out.println("---------------------------------------------");
		
		cadastroAnimal.ImprimeInformacoes();
		
	}

}
