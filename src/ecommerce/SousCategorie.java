package ecommerce;

public class SousCategorie {
	private String code;
	private String libelle;
	private Categorie categorie;
	
	public SousCategorie() {
		super();
	}

	public SousCategorie(String code, String libelle, Categorie categorie) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.categorie = categorie;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
	

}
