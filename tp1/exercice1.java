import javax.swing.JOptionPane;
public class exercice1 {
 public static void main(String args[]){   
      int x ;
      int y ;
      int z ;
      //les sring
      String xval;
      String yval;
      String zval;
      //input 
      xval=JOptionPane.showInputDialog(null,"put your num hear");
      
       yval=JOptionPane.showInputDialog(null,"put your num hear");
       
        zval=JOptionPane.showInputDialog(null,"put your num hear");
        
        //change var
      x=Integer.parseInt(xval);
      y=Integer.parseInt(yval);
      z=Integer.parseInt(zval);
      int result= x*y*z;
    //outpu;
        JOptionPane.showMessageDialog(
            null,"le prod vant:\n "+result);
            System.exit(0);


    } 
}