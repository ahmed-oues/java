package TP2_String;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Arrays;

public class EX5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Combien de mots ? ");
	        int n = scanner.nextInt();
	        
	        String[] mots = new String[n];
	        System.out.println("Donnez vos mots :");
	        
	        for (int i = 0; i < n; i++) {
	            mots[i] = scanner.next();
	        }
	        Arrays.sort(mots);
	        
	        for (String mot : mots) {
	            System.out.println(mot);
	        }
	        
//	        String snbr= JOptionPane.showInputDialog("donner le noblre de mots ");
//	        int nbr = Integer.parseInt(snbr);
//	        String[] mots = new String(nbr);
 // after this same gose on and on        
	}

}
