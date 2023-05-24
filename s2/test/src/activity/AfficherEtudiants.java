package activity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;


public class AfficherEtudiants extends JFrame {

    private static final long serialVersionUID = 1L;
	private JTable table;
    private DefaultTableModel tableModel;
    ResultSet rs= null;
	Connection con;

    public AfficherEtudiants() {
        String[] columnNames = {"Prenom", "Nom", "Classe", "Login", "password"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        // Add the students data to the table
        addStudentsToTable();

        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Afficher Etudiants");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addStudentsToTable() {
    	
                
                ArrayList<etudiant> le =null;
                EtudiantDAO DAO = new EtudiantDAO();
    			le = DAO.getAllEtudiant(); 
    			
                
             
            	   for(int i = 0; i < le.size(); i++) {
                   String prenom = le.get(i).getPrenom();
                   String nom = le.get(i).getNom();
                   String classe = le.get(i).getClasse();
                   String login = le.get(i).getLogin();
                   String password = le.get(i).getPassword();

                 
                   Object[] rowData = {prenom, nom, classe, login, password};

                
                   tableModel.addRow(rowData);
               }
      
    }

    public static void main(String[] args) {
			    new AfficherEtudiants();
    }
}
