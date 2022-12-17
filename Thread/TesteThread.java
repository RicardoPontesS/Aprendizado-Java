package videoaulas;

public class TesteThread {

	public static void main(String[] args) {
		
		MinhaThread thread1 = new MinhaThread("Thread #1",100);
		MinhaThread thread2 = new MinhaThread("Thread #2",600); 
		MinhaThread thread3 = new MinhaThread("Thread #3",1000); 
	}

}
