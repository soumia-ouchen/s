package TpProducteurConsommateur;

public class Lettre {

	private String contenu;
	private String consommateur;
	private String producteur;
	public Lettre() {}
	public Lettre(String contenu, String consommateur, String producteur) {
		super();
		this.contenu = contenu;
		this.consommateur = consommateur;
		this.producteur = producteur;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public String getConsommateur() {
		return consommateur;
	}
	public void setConsommateur(String consommateur) {
		this.consommateur = consommateur;
	}
	public String getProducteur() {
		return producteur;
	}
	public void setProducteur(String producteur) {
		this.producteur = producteur;
	}
	@Override
	public String toString() {
		return "Lettre [contenu=" + contenu + ", consommateur=" + consommateur + ", producteur=" + producteur + "]";
	}
	
	
}
