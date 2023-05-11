package TP2;

public class rationnel {

    private int numerateur;
    private int denominateur;

    public rationnel(int numerateur, int denominateur) {

        this.numerateur = numerateur;
        this.denominateur = denominateur;
        
    }

    

	public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }



	@Override
	public String toString() {
		
		return ""+numerateur+"/"+denominateur;
	}
    
}
