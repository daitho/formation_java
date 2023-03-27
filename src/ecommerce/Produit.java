package ecommerce;

public class Produit {
	private int code;
	private String nom;
	private double prix_achat;
	private double prix_vente_ht;
	private double prix_vente_ttc;
	private double taux;
	private Sous_categorie sous_categorie;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(int code, String nom, double prix_achat, double prix_vente_ht, double prix_vente_ttc, double taux,
			Sous_categorie sous_categorie) {
		super();
		this.code = code;
		this.nom = nom;
		this.prix_achat = prix_achat;
		this.prix_vente_ht = prix_vente_ht;
		this.prix_vente_ttc = prix_vente_ttc;
		this.taux = taux;
		this.sous_categorie = sous_categorie;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix_achat() {
		return prix_achat;
	}

	public void setPrix_achat(double prix_achat) {
		this.prix_achat = prix_achat;
	}

	public double getPrix_vente_ht() {
		return prix_vente_ht;
	}

	public void setPrix_vente_ht(double prix_vente_ht) {
		this.prix_vente_ht = prix_vente_ht;
	}

	public double getPrix_vente_ttc() {
		return prix_vente_ttc;
	}

	public void setPrix_vente_ttc(double prix_vente_ttc) {
		this.prix_vente_ttc = prix_vente_ttc;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public Sous_categorie getSous_categorie() {
		return sous_categorie;
	}

	public void setSous_categorie(Sous_categorie sous_categorie) {
		this.sous_categorie = sous_categorie;
	}
	
	
	

}
