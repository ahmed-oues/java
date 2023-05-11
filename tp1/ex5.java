import javax.swing.JOptionPane;
import java.io.*;
public class ex5 {
   static int litint(){
        String s = "";
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try{
            s=b.readLine();
            
        }
        catch(java.io.IOException e){
            System.out.println("erreur de lcture");
            //System.exit(0);
        }
        return Integer.parseInt(s);
    }
    public static void main(String args[]){ 
        int z,y,x,min;
          x= litint();
          z= litint();
          y= litint();
        min = x;
        if(min>y){
            min=y;

        } else if (min>z){
            min = z;
        }
        JOptionPane.showMessageDialog(
            null,"le minimome: "+min);
            System.exit(0);


    }
}