package videoaulas;

public class TesteWrapper {

	public static void main(String[] args) {
		
		/* Exemplos de tipos primitivos básicos
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000;
		float num5 = 4.5f;
		double num6 = 4.5;
		boolean flag = true;
		char a = 'a'; 
		*/

		Short num = Short.valueOf("1");
		Byte num1 = Byte.valueOf("10");
		Integer num2 = Integer.valueOf(100);
		Long num3 = Long.valueOf(10000);
		Float num4 = Float.valueOf(3.5f);
		Double num5 = Double.valueOf(3.5);
		Boolean num6 = Boolean.valueOf(true);
		Character num7 = Character.valueOf('c');
		
		//conversão de valores na própria classe Wrapper
		System.out.println(num4.longValue());
	}

}
