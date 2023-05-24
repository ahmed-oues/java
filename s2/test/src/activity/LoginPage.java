package activity;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.sql.Statement;


public class LoginPage extends JFrame implements ActionListener {

    private JButton cancel;
    private JButton signIn;
    private JButton login;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JTextField passwordField;

    public LoginPage() {
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");

        usernameField = new JTextField(20);
        passwordField = new JTextField(20);

        login = new JButton("Login");
        login.addActionListener(this);

        signIn = new JButton("Sign In");
        signIn.addActionListener(this);

        cancel = new JButton("Cancel");
        cancel.addActionListener(this);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(login);
        panel.add(signIn);
        panel.add(cancel);

        this.setContentPane(panel);
        this.setSize(300, 200);
        this.setTitle("Login Page");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String username = usernameField.getText();
            String password = passwordField.getText();
            
                ResultSet rs= null;
            	Connection con;
            	
            	 con = MySQLConnection.getConnection();
            	  
            		 Statement stm = null;
					try {
						stm = (Statement) con.createStatement();
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
            		 
            	 
            	 String sql = "select * from etudiant where login='"+username+"'and password='"+password+"'";
            	 try {
					rs = ((java.sql.Statement) stm).executeQuery(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
           try {
			if (rs.next()) {
			        dispose();
			        Homepage hop = new Homepage();
			        hop.main(new String[]{});
			    } else {
			        JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
			    }
		} catch (HeadlessException e1) {
			
			e1.printStackTrace();
		} catch (SQLException e1) {
		
			e1.printStackTrace();
		}
        }

        if (e.getSource() == signIn) {

            Fenetre sign = new Fenetre();
	        sign.main(new String[]{});
        }

        if (e.getSource() == cancel) {
            this.dispose();
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        new LoginPage();
    }
}
