package TpProducteurConsommateur;

public class Producteur extends Thread {
	private String nom;
	private Lettre lettre;
	private BoiteLettre boiteLettre;
	
	public Producteur(String nom,Lettre lettre,BoiteLettre boiteLettre) {
		super();
		this.nom = nom;
		this.lettre = lettre;
		this.boiteLettre = boiteLettre;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			boiteLettre.deposer(lettre);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
