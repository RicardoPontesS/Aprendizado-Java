package videoaulas;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		Endereco dadosEnd = new Endereco();
		Telefone dadosTelefone1 = new Telefone();
		Telefone dadosTelefone2 = new Telefone();
		Telefone[] telefones = new Telefone[2];
		telefones[0] = dadosTelefone1;
		telefones[1] = dadosTelefone2;

		contato.setNome("Ricardo Pontes");

		dadosEnd.setRua("Av alberto lamego");
		dadosEnd.setNumero("405");
		dadosEnd.setComplemento("Bloco A2 Ap 104");
		dadosEnd.setCidade("Campos dos Goytacazes");
		dadosEnd.setEstado("Rio de Janeiro");

		dadosTelefone1.setTipo("Celular");
		dadosTelefone1.setDdd("22");
		dadosTelefone1.setNumero("992558278");

		dadosTelefone2.setTipo("Residêncial");
		dadosTelefone2.setDdd("22");
		dadosTelefone2.setNumero("0000-0000");

		contato.setEndereco(dadosEnd);
		contato.setTelefones(telefones);

		System.out.println("-----------------------------");
		System.out.println(contato.getNome());

		if (contato.getEndereco() != null && contato != null) {
			System.out.println(contato.getEndereco().getCidade());

		}
		if (contato != null && contato.getTelefones() != null) {

			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getTipo() + " " + t.getDdd() + " " + t.getNumero());
			}

		}
		obterMemoria();
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();
		obterMemoria();
	}
	
	public static void obterMemoria() {
		final int MB = 1024 * 1024;
		
		Runtime runtime = Runtime.getRuntime();
		System.out.println((runtime.totalMemory()- runtime.freeMemory())/MB);
		
		
	}

}
