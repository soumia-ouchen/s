package TpProducteurConsommateur;

public class Consommateur extends Thread {
	private String nom;
	private Lettre lettre;
	private BoiteLettre boiteLettre;
	
		public Consommateur(String nom, Lettre lettre, BoiteLettre boiteLettre) {
		super();
		this.nom = nom;
		this.lettre = lettre;
		this.boiteLettre = boiteLettre;
	}

		@Override
	public void run() {
			try {
				Thread.sleep(1000);
				boiteLettre.retirer(nom);;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
