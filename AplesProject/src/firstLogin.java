import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.image.*;
import java.awt.Window.Type;
public class firstLogin extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;
     
	/**
	 * Launch the application.
	 */
	public static void Firstmain(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstLogin frame = new firstLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection c=null;
	public firstLogin() {
		setType(Type.UTILITY);
		setTitle("Login ");
		c=SqliteConnection.dbConnector();
		setBounds(100, 100, 460, 292); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 51));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setForeground(new Color(51, 204, 255));
		lblNewLabel.setBackground(new Color(153, 255, 0));
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 12));
		lblNewLabel.setBounds(163, 55, 72, 29);
		contentPane.add(lblNewLabel);
		
		user = new JTextField();
		user.setFont(new Font("Nirmala UI", Font.BOLD, 11));
		user.setBounds(268, 55, 171, 21);
		contentPane.add(user);
		user.setColumns(10);
		
		JLabel lblPasswor = new JLabel("Password");
		lblPasswor.setForeground(new Color(51, 204, 255));
		lblPasswor.setBackground(new Color(153, 255, 0));
		lblPasswor.setFont(new Font("Nirmala UI", Font.BOLD, 12));
		lblPasswor.setBounds(163, 106, 72, 21);
		contentPane.add(lblPasswor);
		
		pass = new JPasswordField();
		pass.setBounds(268, 107, 171, 21);
		contentPane.add(pass);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(51, 204, 255));
		btnLogin.setBackground(new Color(0, 0, 51));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
               try {
					
					String query="select * from admin where username=? and password = ?";
					PreparedStatement pst = c.prepareStatement(query);
					pst.setString(1,user.getText());
					pst.setString(2, pass.getText());
					
					ResultSet rs=pst.executeQuery();
					
					int count=0;
					while(rs.next()) {
						count++;
					}
					if(count==1) {
						JOptionPane.showMessageDialog(null,"Login Successfully");
						  dispose();
						 LoginActivity lft =new LoginActivity();
						 lft.LoginActivatymain(null);
						
					}
					else {
						JOptionPane.showMessageDialog(null,"Invalid User Name or Password");
						user.setText("");
					    pass.setText("");
					}
					rs.close();
					pst.close();
					    
				}
               catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
				
			}
		});
		btnLogin.setBounds(298, 156, 99, 34);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/key.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(27, 34, 114, 166);
		contentPane.add(lblNewLabel_1);
	}
}
