package activity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EtudiantDAO  {
	
	String getHIGHid() {
		Connection con= MySQLConnection.getConnection();
		Statement stm = null;
		ResultSet	rs = null;
		try {
			stm = (Statement) con.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		 String sql = "SELECT MAX(id) from etudiant";
		 try {
			rs = ((java.sql.Statement) stm).executeQuery(sql);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 String id = null;
		 try {
			rs.next();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 try {
			id = rs.getString("id");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 return id;
		 
	}
	 
	
	 void insert (etudiant e) {
		
      	Connection con= MySQLConnection.getConnection();
      	  
      	Statement stm = null;
      	try {
			stm = (Statement) con.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
      	String id = getHIGHid();
      	
 	    String sql = "INSERT INTO  etudiant (prenom, nom, class, login, password) VALUES ('"+e.getPrenom()+"', '"+e.getNom()+"', '"+e.getClasse()+"', '"+e.getLogin()+"', '"+e.getPassword()+"');";
 	    
 	 try {
 		 int i = stm.executeUpdate(sql);
			if (i >0 ) {
				JOptionPane.showMessageDialog(null, "Eudiant added!!");
			}else {
				JOptionPane.showMessageDialog(null, "Errer accured make sure to inter your informaton correct!!!");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      	
	}
	 public ArrayList<etudiant> getAllEtudiant(){
		 ArrayList<etudiant> le =null;
		 
		 Statement st;
		 Connection c =MySQLConnection.getConnection();
		 
		 try {
		 st = c.createStatement() ;
		 }
		 catch (SQLException t){
		   System.out.println ("Erreur de Statement"+t.getMessage());
		   return le;
		 }
		 /*Exécution de la requête de sélection puis
		 stock du résultat dans le
		 ResultSet rs et affichage*/
		 try {
		 ResultSet rs = st.executeQuery("select * from etudiant;");
		 
		 while (rs.next() ){
			 if(le == null){

			 le = new ArrayList(); }

			 etudiant e = new etudiant(rs.getString("prenom"), rs.getString("nom"), rs.getString("class"), rs.getString("login"),rs.getString("password"));
			   le.add(e);
			 }
			 }
			 catch (Exception er){
			 System.out .println("Erreur ResultSet"+er.getMessage ( ) );
			 }

			 return le;
	 }
	 void supprimer (String e) {
		 Connection con= MySQLConnection.getConnection();
     	  
	      	Statement stm = null;
	      	try {
				stm = (Statement) con.createStatement();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
	      	
	 	    String sql ="DELETE FROM etudiant WHERE id ='"+e+"'";
	 	   try {
	 	 		 int i = stm.executeUpdate(sql);
	 				if (i >0 ) {
	 					JOptionPane.showMessageDialog(null, "student deleted sucsessfully");
	 				}else {
	 					JOptionPane.showMessageDialog(null, "no student found!!!");
	 				}
	 			} catch (SQLException e1) {
	 				// TODO Auto-generated catch block
	 				e1.printStackTrace();
	 			}
	 }
	 

}
