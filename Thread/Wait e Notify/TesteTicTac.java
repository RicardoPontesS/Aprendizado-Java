package videoaulas;

public class TesteTicTac {

	public static void main(String[] args) {
		
		TicTac tt = new TicTac();
		ThreadTicTac tic = new ThreadTicTac("tic", tt);
		ThreadTicTac tac = new ThreadTicTac("tac", tt);
		
		try {
			tic.t.join();
			tac.t.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}

}
