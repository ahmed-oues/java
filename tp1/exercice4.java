import javax.swing.JOptionPane;
public class exercice4 {
   public int val ;
   val =0;
static int clic(){
    val= val +1;
    return val;
}
static int raz(){
    val = 0;
    return val;
}
static int valure(){
    return val;
}
public static void main(String args[]){ 
exercuce4 c1 = new exercuce4();
c1.clic();
c1.clic();
System.out.println("la valer est"+c1.valure);
c1.raz();
System.out.println("la valer est"+c1.valure);
}
}