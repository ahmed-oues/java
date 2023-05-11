public class Animal{
    int age;
    int ageMaxi=10;
    boolean vivant;
    void setage(int a0){
        age=a0;
        vivant=true;
    }
    void viellir(){
        if(age<ageMaxi){
           age=age+1;
        }
        if(age>=ageMaxi && vivant==true){
            vivant=false;
        }
    }
    void mourir(){
        if(age>=ageMaxi){
            vivant=false;
        }
    }
    void crier(){
        if(vivant==false){
            
            System.out.println("cette animal est mort de l'age"+age);
        }else System.out.println("cui cui");
        
    
    }

    
    public static void main(String args[]){
        Animal A1=new Animal();
        A1.setage(0);
        A1.viellir();
        A1.crier();
        A1.viellir();
        A1.crier();
        A1.viellir();
        A1.crier();
        A1.viellir();
        A1.crier();
        A1.viellir();
        A1.crier();
        A1.viellir();
        A1.crier();
        A1.viellir();
        A1.crier();
        A1.viellir();
        A1.crier();
        A1.viellir();
        A1.crier();
        A1.viellir();
        A1.crier();
        A1.mourir();
        A1.viellir();
        A1.crier();
        A1.mourir();
        A1.viellir();
        A1.crier();
 
    }
}