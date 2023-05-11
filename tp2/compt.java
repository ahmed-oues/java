public class compt {
    private double numero;
    private double solde=0;
    public void depo (double value){
        if(value > 0){
            solde = solde + value;
        }
    }
    public void retvait(double value){
        if(value > 0){
            solde = solde - value;
        }
    }
    public double getsolde(){
        return (solde);
    }
    public void affichesolde(){
        System.out.println(" le solde du compte est egale a :"+solde+"dt");
    }
    public void vivex (double value,compt cpt){
        if (value > 0){
            cpt.depot(value);
            this.retrait(value);
        }
    }
    public static void main(String args[]){
        compt c1=new compt();
        compt c2=new compt();
        c1.depot(500);
        c1.affiche();
        c2.depot(1000);
    }
}