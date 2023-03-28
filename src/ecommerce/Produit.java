package ecommerce;

public class Produit {
	private String code;
	private String nom;
	private double prixAchat;
	private double taux;
	private SousCategorie sousCategorie;
	
	public Produit() {
		super();
	}

	public Produit(String code, String nom, double prixAchat, double prixVenteHT, double taux,
			SousCategorie sousCategorie) {
		super();
		this.code = code;
		this.nom = nom;
		this.prixAchat = prixAchat;
		this.taux = taux;
		this.sousCategorie = sousCategorie;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public SousCategorie getSousCategorie() {
		return sousCategorie;
	}

	public void setSousCategorie(SousCategorie sousCategorie) {
		this.sousCategorie = sousCategorie;
	}

	
	
}
