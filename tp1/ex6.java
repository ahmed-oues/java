import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
public class ex6 {
public static void main(String args[]){ 
        int z,y,x,min;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
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