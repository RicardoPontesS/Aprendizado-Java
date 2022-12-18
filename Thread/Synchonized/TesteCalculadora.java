package videoaulas;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5};
		
		ThreadCalculadora thread1 = new ThreadCalculadora("Thread #1", array);
		ThreadCalculadora thread2 = new ThreadCalculadora("Thread #2", array);
	}

}
