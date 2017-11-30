package fr.unice.miage.master1.sd.tp2;

public class Voiture implements Runnable {
	public void run() {
	int nombreVoiture = 5;
	for (int i=0; i<nombreVoiture; i++) {
		String laVoiture = "voiture"+i;
		System.out.println(laVoiture);
	}
	
}
	public static void main(String[] args) {
		Thread TA = new Thread(new Voiture());
		TA.start();
	}
}