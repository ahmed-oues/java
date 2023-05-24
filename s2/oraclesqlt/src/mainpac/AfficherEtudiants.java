package mainpac;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AfficherEtudiants extends JFrame {

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
    			
                if (le != null) {
                    
             	   for(int i = 0; i < le.size(); i++) {
                    String prenom = le.get(i).getPrenom();
                    String nom = le.get(i).getNom();
                    String classe = le.get(i).getClasse();
                    String login = le.get(i).getLogin();
                    String password = le.get(i).getPassword();

                  
                    Object[] rowData = {prenom, nom, classe, login, password};

                 
                    tableModel.addRow(rowData);
                }
					
				}else {
					System.out.print("errrrrrrrrrreeeeerrrrrreeeee");
				}

      
    }

    public static void main(String[] args) {
			    new AfficherEtudiants();
    }
}
