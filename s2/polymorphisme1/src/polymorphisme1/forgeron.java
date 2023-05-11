package polymorphisme1;


public class forgeron extends Personne {

	forgeron(String name) {
		super(name);	
	}
	public void affiche () {
		System.out.println("je souis "+super.toString()+" le forgeron");	
	   }
}
