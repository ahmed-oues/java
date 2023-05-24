package activity;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Homepage extends JFrame implements ActionListener {

    private JButton btnAjouter;
    private JButton btnSupprimer;
    private JButton btnAfficher;
    private JButton btnQuitter;
    private JLabel welcomeLabel;

    public Homepage() {
        btnAjouter = new JButton("Ajouter etudiant");
        btnSupprimer = new JButton("Supprimer etudiant");
        btnAfficher = new JButton("Afficher etudiant");
        btnQuitter = new JButton("Quitter");
        welcomeLabel = new JLabel("Welcome to the Homepage!");

        btnAjouter.addActionListener(this);
        btnSupprimer.addActionListener(this);
        btnAfficher.addActionListener(this);
        btnQuitter.addActionListener(this);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JPanel welcomePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        buttonPanel.add(btnAjouter);
        buttonPanel.add(btnSupprimer);
        buttonPanel.add(btnAfficher);
        buttonPanel.add(btnQuitter);

        welcomePanel.add(welcomeLabel);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(welcomePanel, BorderLayout.WEST);

        add(mainPanel);

        setTitle("Homepage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAjouter) {

            Fenetre sign = new Fenetre();
	        sign.main(new String[]{});
	        
        } else if (e.getSource() == btnSupprimer) {
            JOptionPane.showMessageDialog(this, "Button 'Supprimer' clicked.");}
         else if (e.getSource() == btnAfficher) {

            AfficherEtudiants affch = new AfficherEtudiants();
            affch.main(new String[]{});
            
        } else if (e.getSource() == btnQuitter) {
            JOptionPane.showMessageDialog(this, "Button 'Quitter' clicked.");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Homepage();
    }
}
