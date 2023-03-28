package ecommerce;

public class Client {
	private String idClient;
	private String nom;
	private String prenom;
	private String code_postale;
	private String ville;
	private String pays;
	private String region;
	
	public Client() {
		super();
	}

	public Client(String idClient, String nom, String prenom, String code_postale, String ville, String pays,
			String region) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.code_postale = code_postale;
		this.ville = ville;
		this.pays = pays;
		this.region = region;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCode_postale() {
		return code_postale;
	}

	public void setCode_postale(String code_postale) {
		this.code_postale = code_postale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	

}
