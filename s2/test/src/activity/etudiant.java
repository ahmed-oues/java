package activity;

public class etudiant {
	private String prenom;
	private String nom;
	private String classe;
	private String login;
	private String password;
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public etudiant(String prenom, String nom, String classe, String login, String password) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.classe = classe;
		this.login = login;
		this.password = password;
	}
	@Override
	public String toString() {
		return "etudiant [prenom=" + prenom + ", nom=" + nom + ", classe=" + classe + ", login=" + login + ", password="
				+ password + "]";
	}

	
	
	

}
