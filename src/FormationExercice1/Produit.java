package FormationExercice1;

public class Produit {
	
	private String codeProduit;
	private String libelle;
	private double prix;
	
	
	public Produit() {
		super();

	}

	public Produit(String codeProduit, String libelle, double prix) {
		super();
		this.codeProduit = codeProduit;
		this.libelle = libelle;
		this.prix = prix;
	}

	public String getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
}
