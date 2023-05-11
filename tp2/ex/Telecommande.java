import java.util.Scanner;
public class Telecommande{
    boolean Ouvfer;
    int poste,volume;
    void ouvfer(){
        if(Ouvfer=true){
            Ouvfer=false;
        }
        else Ouvfer=true;
    }
    void volumA(){
        if(volume<30 && Ouvfer=true){
            volume=volume+1;
        }
    }
    void volumD(){
         if(volume>0 && Ouvfer=true){
            volume=volume-1;
        }
    }
    void posteA(){
       if(poste<13 && Ouvfer=true){
        poste=poste+1;
       }
    }
    void posteD(){
        if(poste>=1 && Ouvfer=true){
            poste=poste-1;
        }
    }
    void Afficher(){
        if(Ouvfer=true){
            System.out.println("La TV est Ouvert");
            System.out.println("Volume="+volume);
            System.out.println("Npostet="+poste);
        }
        else{
            System.out.println("La TV est Ferme");
        //     System.out.println("Volume="+volume);
        //     System.out.println("Npostet="+poste);
            }
    }
    public static void main(String args[]){
        Telecommande Sony=new Telecommande();;
        int choix;
        System.out.println("Donner votre choix");

        switch (choix){
                
            case 1:
            Sony.ouvfer();
            break;
            case 2:
            Sony.volumA();
            break;
            case 3:
            Sony.volumD();
            break;
            case 4:
            Sony.posteA();
            break;
            case 5:
            Sony.posteD();
            break;
            case 6:
            Sony.Afficher();
            break;
            case 7:
            break;
            Telecommande();
        }
    }
 
}