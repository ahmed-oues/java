package polymorphisme1;

public class menuisier extends Personne {

	menuisier(String name) {
		super(name);
	}
	public void affiche () {
		System.out.println("je souis "+super.toString()+" le menuisier");	
	   }
}
