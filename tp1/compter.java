import javax.swing.JOptionPane;
public class compter {
   static int val = 0 ;
static int clic(){
    val++;
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
compter c1 = new compter();
c1.clic();
c1.clic();
System.out.println("la valer est"+c1.valure());
c1.raz();
System.out.println("la valer est"+c1.valure());
}
}