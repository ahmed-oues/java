package TP2;

public interface Iterateur {
    void init(); 
    Object suivant(); 
    boolean fini(); 
    Object courant();
}

public abstract class Agregat {

    public abstract boolean inf(Object x, Object y);

    protected abstract Iterateur getIterateur();    
}

