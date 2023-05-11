package polymorphisme1;

public class TestMetier {

	public static void main(String[] args) {
		Personne[] personnes= new Personne[4];
		personnes[0] = new Personne("saleh");
		personnes[1] = new forgeron("ali");
		personnes[2] = new menuisier("mohamed");
		personnes[3] = new forgeron("amor");
		for (int i = 0; i < personnes.length; i++) {
			personnes[i].affiche();
		}
	}

}
