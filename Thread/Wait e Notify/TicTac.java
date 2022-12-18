package videoaulas;

public class TicTac {

	boolean tic;

	synchronized void tic(boolean executanto) {

		if (!executanto) {
			tic = false;
			notify();
		}
		System.out.println("Tic");
		tic = true;

		notify();

		while(tic) {
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
	
	synchronized void tac(boolean executanto) {

		if (!executanto) {
			tic = false;
			notify();
		}
		System.out.println("Tac");
		tic = false;

		notify();

		while(tic) {
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
	
}
