package fr.unice.miage.master1.sd.tp2;

public class Exercice1 implements Runnable {

	public void run() {
		int counterTA = 0;
		for (int i = 0; i < 1000; i++) {
			counterTA++;
			System.out.println(counterTA);
		}
	}

	public static void main(String[] args) throws Exception {
		Thread TA = new Thread(new Exercice1());
		TA.start();
		Thread TB = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1000; i >= 1; i--) {
					System.out.println(i);
				}
			}

		});
		TB.start();
	}
}