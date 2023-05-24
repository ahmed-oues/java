package mainpac;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class EtudiantDAO {
	 void insert (etudiant e) {
			
	      	Connection con= OracleConnection.getConnection();
	      	  
	      	Statement stm = null;
	      	try {
				stm = (Statement) con.createStatement();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
	      	
	 	    String sql = "INSERT INTO  etudiant (prenom, nom, class, login, password) VALUES ('"+e.getPrenom()+"', '"+e.getNom()+"', '"+e.getClasse()+"', '"+e.getLogin()+"', '"+e.getPassword()+"');";
	 	    
	 	 try {
	 		 int i = stm.executeUpdate(sql);
				if (i >0 ) {
					JOptionPane.showMessageDialog(null, "Eudiant added!!");
				}else {
					JOptionPane.showMessageDialog(null, "Errer accured make sure to inter your informaton correct!!!");
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
	      	
		}
	 public ArrayList<etudiant> getAllEtudiant() {
		    ArrayList<etudiant> le = null;
		    Statement st;
		    Connection c = OracleConnection.getConnection();

		    try {
		        st = c.createStatement();
		    } catch (SQLException t) {
		        System.out.println("Erreur de Statement: " + t.getMessage());
		        return le;
		    }

		    try {
		        String sql = "SELECT * FROM etudiant";
		        ResultSet rs = st.executeQuery(sql);

		        while (rs.next()) {
		            if (le == null) {
		                le = new ArrayList<>();
		            }

		            etudiant e = new etudiant(rs.getString("prenom"), rs.getString("nom"), rs.getString("class"), rs.getString("login"), rs.getString("password"));
		            le.add(e);
		        }
		    } catch (SQLException er) {
		        System.out.println("Erreur ResultSet: " + er.getMessage());
		        er.printStackTrace();
		    }

		    return le;
		}
}
