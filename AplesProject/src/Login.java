import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.util.Calendar;
import java.awt.Window.Type;  

public class Login {

	public JFrame frmSuperShopManagement;
    private JLabel clock;
    private JLabel date;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmSuperShopManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public void Clock() {
		
		Thread olock = new Thread() {
			public void run() {
				try {
					for(;;) {
						Calendar cal = Calendar.getInstance();
						int year = cal.get(Calendar.YEAR);
						int Month = cal.get(Calendar.MONTH);
						int day = cal.get(Calendar.DAY_OF_MONTH);
						
						int hour = cal.get(Calendar.HOUR);
						int minit = cal.get(Calendar.MINUTE);
						int second = cal.get(Calendar.SECOND);
						String format="";
						if(hour<12) {
							format="AM";
						}
						else if(hour>12) {
							hour= hour-12;
							format="PM";
						}
						clock.setText(hour+" : "+minit+" : "+second+" : "+format);
						int month=Month+1;
						date.setText(day+"/"+month+"/"+year);
						sleep(1000);
					}
					
				}catch(Exception e) {
					
				}
			}
		};
		
		olock.start();
		
	}
	
	public Login() {
		initialize();
		Clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSuperShopManagement = new JFrame();
		frmSuperShopManagement.setResizable(false);
		frmSuperShopManagement.setType(Type.POPUP);
		frmSuperShopManagement.setTitle("Super Shop Management System\r\n");
		frmSuperShopManagement.getContentPane().setBackground(new Color(25, 25, 112));
		frmSuperShopManagement.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Log In");
		btnLogin.setBackground(new Color(255, 255, 204));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin.setIcon(null);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstLogin fstl=new firstLogin();
				fstl.Firstmain(null);
			}
		});
		btnLogin.setBounds(496, 349, 105, 44);
		frmSuperShopManagement.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/1stpic.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 640, 278);
		frmSuperShopManagement.getContentPane().add(lblNewLabel);
		
	     clock = new JLabel("Clock");
		clock.setFont(new Font("Tahoma", Font.BOLD, 20));
		clock.setForeground(new Color(0, 255, 51));
		clock.setBounds(36, 298, 252, 63);
		frmSuperShopManagement.getContentPane().add(clock);
		
		date = new JLabel("Date\r\n");
		date.setFont(new Font("Tahoma", Font.BOLD, 20));
		date.setForeground(new Color(0, 255, 51));
		date.setBounds(36, 374, 223, 50);
		frmSuperShopManagement.getContentPane().add(date);
		frmSuperShopManagement.setBounds(50, 50, 646, 474);
		frmSuperShopManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
