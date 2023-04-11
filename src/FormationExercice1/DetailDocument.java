package FormationExercice1;

public class DetailDocument {
	
	private int idLigneCommande;
	private int quantite;
	private Produit produit;
	private double prix;

	public DetailDocument() {
		super();
	}

	public DetailDocument(int idLigneCommande, int quantite, Produit produit, double prix) {
		super();
		this.idLigneCommande = idLigneCommande;
		this.quantite = quantite;
		this.produit = produit;
		this.prix = prix;
	}

	public int getIdLigneCommande() {
		return idLigneCommande;
	}

	public void setIdLigneCommande(int idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	

}
