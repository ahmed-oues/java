package TP3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class FenetreAvecEcouteur extends JFrame implements ActionListener
{
JButton affiche, supprime;
JLabel message;
public FenetreAvecEcouteur(){
setTitle("Ma 4ème fenêtre");
setSize(300, 150);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
affiche = new JButton("Afficher");
affiche.addActionListener(this);
message = new JLabel("");
supprime = new JButton("Supprimer");
supprime.addActionListener(this);
JPanel pano = new JPanel();
pano.add(affiche);
pano.add(message);
pano.add(supprime);
setContentPane(pano);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
	 if(e.getSource() == affiche){
	 message.setText("Bonjour");
	 } else if(e.getSource() == supprime){
	 message.setText(" ");
	 }
	}
	public static void main(String[] args){
	new FenetreAvecEcouteur();
	}
	}