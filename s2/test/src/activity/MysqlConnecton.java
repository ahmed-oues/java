package activity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlConnecton {
	static Connection con;
	Statement st;
	ResultSet rs;

	public static void main(String[] args) {
		try{
			/*chargement du driver*/
			Class.forName("com.mysql.jdbc.Driver") ;
			}
			catch(Exception e){
			System.out .println("Erreur driver: "+e.getMessage() ) ;
			}
			/*Connexion à la base de données maBD avec l'utilisateur root et le mot de
			passe vide */
			try {
			con = DriverManager.getConnection(
			"jdbc:mysql://localhost/bookdb","sammy","password") ;
			System.out.print("connecton workes");
			}
			catch (Exception ez ){
			System.out.println("Erreur de connexion "+ ez.getMessage());
			}
	

	}

}
