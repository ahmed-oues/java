import javax.swing.JOptionPane;
public class exercice3 {
public static void main(String args[]){ 
    int i,res,y;
    String x;
    res = 1;
    if (args.length == 0){
        x=JOptionPane.showInputDialog(null,"put your num hear");
        y=Integer.parseInt(x);
        } 
    else{
        y=Integer.parseInt(args[0]);
        }
    for(i=y;i>0;i--){
        res=res*i; 
    }
    JOptionPane.showMessageDialog(
            null,"le factoriiiell vant: "+res);
            System.exit(0);
}
}
