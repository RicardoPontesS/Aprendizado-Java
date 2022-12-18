package videoaulas;
import java.util.Random;

public class TesteMatriz {

	public static void main(String[] args) {
	Random rand = new Random();
	
		int[][] matriz = new int[3][3];
		for(int i = 0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				matriz[i][j] = rand.nextInt(100);
			}
		}
		
		for(int i = 0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.printf("[%d]",matriz[i][j]);
			}
			System.out.println();
		}
		
		ThreadMatriz thread1 = new ThreadMatriz("Thread #1",matriz, 0);
		ThreadMatriz thread2 = new ThreadMatriz("Thread #2",matriz, 1);
		ThreadMatriz thread3 = new ThreadMatriz("Thread #3",matriz, 2);
	}

}
