package videoaulas;

public class TesteStrings {

	public static void main(String[] args) {

		String java = new String("JAVA");
		System.out.println(java);

		String java1 = new String(java);
		System.out.println(java1);

		char[] chars = { 'J', 'A', 'V', 'A' };
		String java2 = new String(chars);
		System.out.println(java2);

		char[] alfabeto = { 'A', 'B', 'C', 'D' };
		String letras = new String(alfabeto, 0, 3);
		System.out.println(letras);

		byte[] ascii = { 65, 66, 67, 68, 69 };
		String abcde = new String(ascii);
		System.out.println(abcde);

		// Concatenação
		String firstName = new String("Ricardo Willian ");
		String lastName = new String("Pontes da Silva");
		String fullName = new String(firstName + lastName);
		System.out.println(fullName);

		// Conversão em String
		String converte = new String(String.valueOf(1));
		System.out.println(converte);

		// Extraindo Chars
		for (int i = 0; i < java.length(); i++) {
			System.out.printf("", java.charAt(i), "%n");
		}

		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0);
		System.out.println(jav);

		// Comparação
		String ola1 = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";

		System.out.println("Olá é igual a OLÁ? " + ola1.equals(ola2));
		System.out.println("Olá é igual a Olá? " + ola1.equals(ola3));
		System.out.println("Olá é igual a OLÁ? " + ola1.equalsIgnoreCase(ola2));

		String banana = "banana";
		String ban = "ban";
		String ana = "Ana";

		System.out.println(banana.regionMatches(1, ana, 0, 3));
		System.out.println(banana.regionMatches(true, 1, ana, 0, 3));

		System.out.println(banana.endsWith(ana));
		System.out.println(banana.startsWith(ban));

		String a = "a";
		String b = "b";
		String A = "A";

		System.out.println(a.compareTo(b)); // - 1 quando x > y
		System.out.println(a.compareTo(A)); // 32 quando y > x
		System.out.println(a.compareToIgnoreCase(A)); // 0 quando x = y
	}

}
