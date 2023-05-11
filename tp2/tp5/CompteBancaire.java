public class CompteBancaire {
 private int numeroCompte;
 private double solde;
          
     public CompteBancaire() {
     
     }
     public CompteBancaire(int numeroCompte, double solde){
         this.numeroCompte=numeroCompte;
         this.solde=solde;
     }
    public void afficher(){
         System.out.println("numéro de compte: "+numeroCompte);
         System.out.println("solde: "+solde);
    }
        
     public int getNumeroCompte() {
         return numeroCompte;
     }
     public void setNumeroCompte(int numeroCompte) {
         this.numeroCompte = numeroCompte;
     }
     public double getSolde() {
         return solde;
     }
     public void setSolde(double solde) {
         this.solde = solde;
     }
}
     
     
public class CompteEpargne extends CompteBancaire {
     private double taux;
     public CompteEpargne(int numeroCompte, double solde, double taux) {
     
     super(numeroCompte,solde);
     this.taux=taux;
     }
     @Override
     public void afficher() {
         super.afficher();
         System.out.println("le taux="+taux);
     }
     public double getTaux() {
         return taux;
     }
     public void setTaux(double taux) {
         this.taux = taux;
     }
 }
          
          

public class Test {

     public static void main(String[] args) {
         // TODO Auto-generated method stub
         
         CompteEpargne ce1=new CompteEpargne(123,200,0.05);
         CompteBancaire c1 = new CompteBancaire(102, 1000);
         
         c1.afficher();
         //ce1.afficher();
         c1=ce1;
         c1.afficher();
     }

}