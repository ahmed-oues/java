package TP2;

public abstract class Tablau {
	private Object T[];
	
	public Tablau (Object T[]) {
		this.T = T;
	}
	
	abstract public Boolean inf(Object x,Object y);
	

	
	
	public Object minimum() {
	    Object min = T[0];
	    for (int i = 1; i < T.length; i++) {
	        if (inf(T[i], min)) {
	            min = T[i];
	        }
	    }
	    return min;
	}
	
	
}

