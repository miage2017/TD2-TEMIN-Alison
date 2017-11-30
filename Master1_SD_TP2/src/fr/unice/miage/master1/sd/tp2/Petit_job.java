package fr.unice.miage.master1.sd.tp2;

public class Petit_job implements Runnable {
	private static final String A = null;
	private static final String B = null;
	private ObjetEntier notre_entier;
	private int increment;
private String monNom;
	Petit_job(ObjetEntier notre_entier, int increment, String monNom) {
		this.increment = increment;
		this.notre_entier = notre_entier;
		this.monNom = monNom;
	}

	public void run() {
		for (int i = 0; i < 10000000; i++) {
			
				notre_entier.add(increment);
			
		}
		System.out.format("[%s] dit  %d\n", monNom, notre_entier.val());
	}

	public static void main(String[] args) {
		ObjetEntier Compteur = new ObjetEntier();
		String A = "A";
		String B = "B";
		Petit_job objex1 = new Petit_job(Compteur, 1, A);
		Petit_job objex2 = new Petit_job(Compteur, -1, B);
		Thread tache1 = new Thread(objex1, "incrementeur");
		Thread tache2 = new Thread(objex2, "decrementeur");

		tache1.start();
		tache2.start();

		System.out.format("Le compteur vaut %s\n", Compteur);
		System.out.format("Le compteur vaut %s\n", Compteur);
	}
}
