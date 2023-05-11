public class point{
     private double x,y;
     double getx(){
        return x;
     }
     double gety(){
        return y;
     }
     void setx(double x0){
        x=x0;
     }
     void sety(double y0){
        y=y0;
     }
     void affiche(){
        System.out.println("AFFICHER X ET Y");
     }
     void translate(double dx, double dy){
        x=x+dx;
        y=y+dy;
     }
}