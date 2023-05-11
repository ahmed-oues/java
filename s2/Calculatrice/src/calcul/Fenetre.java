package calcul;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends javax.swing.JFrame {
	
		private static final long serialVersionUID = 1L;
		JButton bouton0, bouton1, bouton2, bouton3, bouton4, bouton5, bouton6, bouton7, bouton8, bouton9,
		        boutonadd, boutonmins, boutoneqals, boutondelete;
		public Fenetre(){
			JPanel pano = new JPanel();
			bouton1 = new JButton("1");
			bouton2 = new JButton("2");
			bouton3 = new JButton("3");
			bouton4 = new JButton("4");
			bouton5 = new JButton("5");
			bouton6 = new JButton("6");
			bouton7 = new JButton("7");
			bouton8 = new JButton("8");
			bouton9 = new JButton("9");
			bouton0 = new JButton("0");
			boutonadd = new JButton("+");
			boutonmins = new JButton("-");
			boutoneqals = new JButton("=");
			boutondelete = new JButton("C");
			
			pano.setLayout(new GridLayout(3,2));
			pano.add(bouton1); pano.add(bouton2); pano.add(bouton3);
			pano.add(bouton4); pano.add(bouton5);pano.add(bouton6);
			pano.add(bouton7); pano.add(bouton8);pano.add(bouton9);
			pano.add(bouton0); pano.add(boutonadd);pano.add(boutonmins);pano.add(boutoneqals);pano.add(boutondelete); 
			this.setTitle("GridLayout");
			this.setContentPane(pano);
			pack();
			this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			this.setVisible(true);
		}
	
	public static void main(String[] args) {
		new Fenetre();
		} 
}
