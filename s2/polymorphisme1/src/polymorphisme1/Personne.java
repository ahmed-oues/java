package polymorphisme1;

public class Personne {

	  private String name;
	  
	   Personne (String name){
		   this.name = name;
	   }
	   public String toString() {
		return this.name;
		   
        }
   public void affiche () {
	   System.out.println("je souis "+toString());	
   }

   
}
