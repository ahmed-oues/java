package TP2;

public class tablaurationelle extends Tablau {

	  public tablaurationelle(rationnel[] tableau) {
	        super(tableau);
	    }

	    public Boolean inf(Object x, Object y) {
	        rationnel r1 = (rationnel) x;
	        rationnel r2 = (rationnel) y;
	        return (r1. getNumerateur() * r2.getDenominateur() < r2.getNumerateur() * r1.getDenominateur());
	    }

	    public static void main(String[] args) {
	    	
	    	
	        rationnel[] tableau = new rationnel[5];
	        tablaurationelle tr = new tablaurationelle(tableau);
	        
	        tableau[0] = new rationnel(1, 2);
	        tableau[1] = new rationnel(3, 4);
	        tableau[2] = new rationnel(2, 3);
	        tableau[3] = new rationnel(5, 6);
	        tableau[4] = new rationnel(7, 8);
	        
	        
	        
//	        rationnel min = (rationnel) tr.minimum();
	        System.out.println("Le plus petit élément du tableau est : " + tr.minimum());
	    }
}