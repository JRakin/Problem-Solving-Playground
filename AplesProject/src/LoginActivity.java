import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginActivity extends JFrame {

	private JPanel contentPane;
	private JTextField c_name;
	private JTextField c_phone;
	private JTextField c_email;
	private JTextField c_address;

	/**
	 * Launch the application.
	 */
	public static void LoginActivatymain(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginActivity frame = new LoginActivity();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Connection con=null;
	private JTextField e_name;
	private JTextField e_phone;
	private JTextField e_address;
	private JTextField e_salary;
	private JTextField e_email;
	private JTextField p_id;
	private JTextField c_nam;
	private JTextField s_amount;
	private JTextField s_address;
	private JTextField s_phone;
	private JTextField e_p_id;
	private JTable table;
	private JTextField inputQuantity;
	private JTextField o_c_id;
	private JTextField o_o_date;
	private JTextField o_d_d;
	private JTextField o_p_name;
	private JTextField o_price;
	private JTextField o_quantity;
	private JTextField p_name;
	private JTextField p_type;
	private JTextField p_quantity;
	private JTextField p_price;
	public LoginActivity() {
		con =  SqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 481);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JButton btnOrderProduct = new JButton("Order Product");
		btnOrderProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame internalFrame = new JInternalFrame("Order ");
				internalFrame.setResizable(true);
				internalFrame.setClosable(true);
				internalFrame.setBounds(317, 25, 301, 370);
				contentPane.add(internalFrame);
				internalFrame.getContentPane().setLayout(null);
				
				JLabel lblCustomerId = new JLabel("Customer ID");
				lblCustomerId.setBounds(28, 40, 89, 14);
				internalFrame.getContentPane().add(lblCustomerId);
				
				JLabel lblOrderDate = new JLabel("Order Date");
				lblOrderDate.setBounds(28, 82, 89, 14);
				internalFrame.getContentPane().add(lblOrderDate);
				
				JLabel lblDelivary = new JLabel("Delivery Date");
				lblDelivary.setBounds(28, 125, 89, 14);
				internalFrame.getContentPane().add(lblDelivary);
				
				JLabel lblNewLabel_1 = new JLabel("Product Name");
				lblNewLabel_1.setBounds(28, 172, 89, 14);
				internalFrame.getContentPane().add(lblNewLabel_1);
				
				JLabel lblUnitPrice = new JLabel("Unit Price");
				lblUnitPrice.setBounds(28, 221, 89, 14);
				internalFrame.getContentPane().add(lblUnitPrice);
				
				JLabel lblQuantity = new JLabel("Quantity");
				lblQuantity.setBounds(28, 266, 89, 14);
				internalFrame.getContentPane().add(lblQuantity);
				
				o_c_id = new JTextField();
				o_c_id.setBounds(127, 37, 134, 20);
				internalFrame.getContentPane().add(o_c_id);
				o_c_id.setColumns(10);
				
				o_o_date = new JTextField();
				o_o_date.setBounds(127, 79, 134, 20);
				internalFrame.getContentPane().add(o_o_date);
				o_o_date.setColumns(10);
				
				o_d_d = new JTextField();
				o_d_d.setBounds(127, 122, 134, 20);
				internalFrame.getContentPane().add(o_d_d);
				o_d_d.setColumns(10);
				
				o_p_name = new JTextField();
				o_p_name.setBounds(127, 169, 134, 20);
				internalFrame.getContentPane().add(o_p_name);
				o_p_name.setColumns(10);
				
				o_price = new JTextField();
				o_price.setBounds(127, 218, 134, 20);
				internalFrame.getContentPane().add(o_price);
				o_price.setColumns(10);
				
				o_quantity = new JTextField();
				o_quantity.setBounds(126, 263, 135, 20);
				internalFrame.getContentPane().add(o_quantity);
				o_quantity.setColumns(10);
				
				JButton btnOk_3 = new JButton("Ok");
				btnOk_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							String query  = "insert into Order01 (CustomerId,OrderDate,DeliveryDate,Items,UnitPrice,Quantity) values (?,?,?,?,?,?)";
							PreparedStatement pst = con.prepareStatement(query);
							pst.setString(1,o_c_id.getText());
							pst.setString(2, o_o_date.getText());
							pst.setString(3, o_d_d.getText());
							pst.setString(4, o_p_name.getText());
							pst.setString(5,o_price.getText());
							pst.setString(6, o_quantity.getText());
							pst.execute();
							JOptionPane.showMessageDialog(null, "Order has taken ");
							o_p_name.setText(null);
							o_price.setText(null);
							o_quantity.setText(null);
							pst.close();
						}
						catch(Exception e) {
							JOptionPane.showMessageDialog(null, e);
						}
					}
				});
				btnOk_3.setBounds(148, 306, 89, 23);
				internalFrame.getContentPane().add(btnOk_3);
				internalFrame.setVisible(true);
				
				
			}
		});
		btnOrderProduct.setBounds(45, 75, 193, 41);
		contentPane.add(btnOrderProduct);
		
		JButton btnEmployeeInfo = new JButton("Employee Info");
		btnEmployeeInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
				internalFrame.setBorder(null);
				internalFrame.setClosable(true);
				internalFrame.getContentPane().setBackground(new Color(102, 153, 102));
				internalFrame.getContentPane().setForeground(new Color(0, 0, 0));
				internalFrame.setBounds(277, 26, 361, 375);
				contentPane.add(internalFrame);
				internalFrame.getContentPane().setLayout(null);
				
				JLabel lblEmployeeName = new JLabel("Employee Name");
				lblEmployeeName.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblEmployeeName.setForeground(new Color(0, 51, 255));
				lblEmployeeName.setBackground(new Color(255, 255, 255));
				lblEmployeeName.setBounds(10, 35, 121, 14);
				internalFrame.getContentPane().add(lblEmployeeName);
				
				JLabel lblPhone_1 = new JLabel("Phone");
				lblPhone_1.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPhone_1.setForeground(new Color(0, 0, 255));
				lblPhone_1.setBounds(37, 87, 46, 14);
				internalFrame.getContentPane().add(lblPhone_1);
				
				JLabel lblAddress_1 = new JLabel("Address");
				lblAddress_1.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblAddress_1.setForeground(new Color(0, 0, 255));
				lblAddress_1.setBounds(37, 140, 75, 14);
				internalFrame.getContentPane().add(lblAddress_1);
				
				JLabel lblSalary = new JLabel("Salary");
				lblSalary.setForeground(new Color(0, 0, 255));
				lblSalary.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblSalary.setBounds(37, 193, 46, 14);
				internalFrame.getContentPane().add(lblSalary);
				
				JLabel lblEmail_1 = new JLabel("E-mail");
				lblEmail_1.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblEmail_1.setForeground(new Color(0, 0, 255));
				lblEmail_1.setBounds(37, 248, 46, 14);
				internalFrame.getContentPane().add(lblEmail_1);
				
				e_name = new JTextField();
				e_name.setBounds(141, 32, 194, 23);
				internalFrame.getContentPane().add(e_name);
				e_name.setColumns(10);
				
				e_phone = new JTextField();
				e_phone.setBounds(141, 84, 194, 23);
				internalFrame.getContentPane().add(e_phone);
				e_phone.setColumns(10);
				
				e_address = new JTextField();
				e_address.setBounds(141, 137, 194, 23);
				internalFrame.getContentPane().add(e_address);
				e_address.setColumns(10);
				
				e_salary = new JTextField();
				e_salary.setBounds(141, 190, 194, 23);
				internalFrame.getContentPane().add(e_salary);
				e_salary.setColumns(10);
				
				e_email = new JTextField();
				e_email.setBounds(141, 242, 194, 23);
				internalFrame.getContentPane().add(e_email);
				e_email.setColumns(10);
				
				JButton btnOk_1 = new JButton("OK");
				btnOk_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						try {
							
							String query = "Insert into EmployeeInfo (EmployeeName,Phone,Address,Salary,Email) values (?,?,?,?,?)";
							PreparedStatement pst = con.prepareStatement(query);
							pst.setString(1,e_name.getText());
							pst.setString(2,e_phone.getText());
							pst.setString(3,e_address.getText());
							pst.setString(4,e_salary.getText());
							pst.setString(5, e_email.getText());
							pst.execute();
							JOptionPane.showMessageDialog(null,"Successfully Registered");
							pst.close();
							
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null,e);
						}
						
					}
				});
				btnOk_1.setBounds(141, 295, 89, 23);
				internalFrame.getContentPane().add(btnOk_1);
				internalFrame.setVisible(true);
				
				
			}
		});
		btnEmployeeInfo.setBounds(45, 132, 193, 41);
		contentPane.add(btnEmployeeInfo);
		
		JButton btnSellProduct = new JButton("Sell product");
		btnSellProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame internalFrame = new JInternalFrame("Sell Product");
				internalFrame.setBorder(null);
				internalFrame.getContentPane().setBackground(new Color(0, 153, 153));
				internalFrame.setResizable(true);
				internalFrame.setClosable(true);
				internalFrame.setBounds(247, 11, 381, 369);
				contentPane.add(internalFrame);
				internalFrame.getContentPane().setLayout(null);
				
				JLabel lblEnterProductId = new JLabel("Enter Product  ID");
				lblEnterProductId.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblEnterProductId.setForeground(new Color(255, 255, 255));
				lblEnterProductId.setBounds(85, 11, 131, 14);
				internalFrame.getContentPane().add(lblEnterProductId);
				
				e_p_id = new JTextField();
				e_p_id.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent arg0) {
						try {
							 String query = "select ProductName, Quantity , Price from ProductInfo where ProductId = ?";
							 PreparedStatement pst = con.prepareStatement(query);
							 pst.setString(1,e_p_id.getText());
							 ResultSet rs = pst.executeQuery();
							 table.setModel(DbUtils.resultSetToTableModel(rs));
						}
						catch(Exception e) {
							
						}
					}
				});
				e_p_id.setBounds(68, 36, 131, 20);
				internalFrame.getContentPane().add(e_p_id);
				e_p_id.setColumns(10);
				
				table = new JTable();
				table.setBounds(30, 102, 316, 20);
				internalFrame.getContentPane().add(table);
				
				JLabel lblAvailableStock = new JLabel("Available Stock");
				lblAvailableStock.setForeground(new Color(255, 255, 255));
				lblAvailableStock.setFont(new Font("Tahoma", Font.PLAIN, 11));
				lblAvailableStock.setBounds(135, 77, 100, 14);
				internalFrame.getContentPane().add(lblAvailableStock);
				
				JLabel lblPricePerProduct = new JLabel("Price Per Product");
				lblPricePerProduct.setFont(new Font("Tahoma", Font.PLAIN, 11));
				lblPricePerProduct.setForeground(new Color(255, 255, 255));
				lblPricePerProduct.setBounds(245, 77, 101, 14);
				internalFrame.getContentPane().add(lblPricePerProduct);
				
				JLabel lblEnterQuantity = new JLabel("Enter Quantity");
				lblEnterQuantity.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblEnterQuantity.setForeground(new Color(255, 255, 255));
				lblEnterQuantity.setBounds(30, 156, 118, 14);
				internalFrame.getContentPane().add(lblEnterQuantity);
				
				inputQuantity = new JTextField();
				inputQuantity.setBounds(158, 154, 130, 20);
				internalFrame.getContentPane().add(inputQuantity);
				inputQuantity.setColumns(10);
				JLabel totalLevel = new JLabel("");
				totalLevel.setForeground(new Color(255, 255, 255));
				totalLevel.setFont(new Font("Tahoma", Font.BOLD, 12));
				JButton btnTotal = new JButton("Add to Cart");
				btnTotal.setForeground(new Color(51, 204, 255));
				btnTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnTotal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							String text = inputQuantity.getText();
							double returnQuantity = getQuan();
							double returnPrice = getPrice();
							double textConvert = Double.parseDouble(text);
							if(textConvert<=returnQuantity) {
								double sum = returnPrice*textConvert;
								String afterlevel = Double.toString(sum);
								//totalLevel.setText("Total Amount BDT = "+afterlevel+" /=");
								String query = "insert into Sell(ProductId,Price) values (?,?)";
								PreparedStatement pst = con.prepareStatement(query);
								pst.setString(1,e_p_id.getText());
								pst.setString(2, afterlevel);
								pst.execute();
								JOptionPane.showMessageDialog(null, "Add to Cart");
								e_p_id.setText(null);
								inputQuantity.setText(null);
								pst.close();
							}
							else if(textConvert>returnQuantity) {
								JOptionPane.showMessageDialog(null, "Sorry ! Out Of Stock");
							}
							
						}
						catch(Exception e) {
							JOptionPane.showMessageDialog(null, e);
						}
					}
				});
				btnTotal.setBounds(224, 196, 122, 37);
				internalFrame.getContentPane().add(btnTotal);
				
				JLabel lblProductName = new JLabel("Product Name");
				lblProductName.setFont(new Font("Tahoma", Font.PLAIN, 11));
				lblProductName.setForeground(new Color(255, 255, 255));
				lblProductName.setBackground(new Color(255, 0, 0));
				lblProductName.setBounds(30, 77, 84, 14);
				internalFrame.getContentPane().add(lblProductName);
				
				//JLabel totalLevel = new JLabel("New label");
				totalLevel.setBounds(51, 250, 238, 23);
				internalFrame.getContentPane().add(totalLevel);
				
				JButton btnNewButton = new JButton("Total");
				btnNewButton.setForeground(new Color(0, 204, 255));
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							
							String query = "select sum(Price) from Sell";
							PreparedStatement pst = con.prepareStatement(query);
							ResultSet rs = pst.executeQuery();
							while(rs.next()) {
								String sum = rs.getString("sum(Price)");
								totalLevel.setText("Totam Amount BDT/= : "+sum);
							}
							
						}
						catch(Exception e) {
							JOptionPane.showMessageDialog(null, e);
						}
					}
				});
				btnNewButton.setBounds(30, 196, 118, 37);
				internalFrame.getContentPane().add(btnNewButton);
				
				JButton btnRefresh = new JButton("Payment");
				btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnRefresh.setForeground(new Color(0, 204, 255));
				btnRefresh.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							String query = "Delete from Sell";
							PreparedStatement pst = con.prepareStatement(query);
							pst.execute();
							JOptionPane.showMessageDialog(null,"Paid ! Thank you ");
							totalLevel.setText(null);
							pst.close();
							
						}
						catch(Exception e) {
							JOptionPane.showMessageDialog(null, e);
						}
					}
				});
				btnRefresh.setBounds(123, 294, 93, 37);
				internalFrame.getContentPane().add(btnRefresh);
				internalFrame.setVisible(true);
				
				
			}
		});
		btnSellProduct.setBounds(45, 192, 193, 41);
		contentPane.add(btnSellProduct);
		
		JButton btnProductRegister = new JButton("Product Register");
		btnProductRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JInternalFrame internalFrame = new JInternalFrame("Product Register");
				internalFrame.setBorder(null);
				internalFrame.setResizable(true);
				internalFrame.setClosable(true);
				internalFrame.setBounds(292, 26, 337, 292);
				contentPane.add(internalFrame);
				internalFrame.getContentPane().setLayout(null);
				
				JLabel lblProductName_1 = new JLabel("Product Name");
				lblProductName_1.setBounds(27, 32, 84, 14);
				internalFrame.getContentPane().add(lblProductName_1);
				
				JLabel lblProductType = new JLabel("Product Type");
				lblProductType.setBounds(27, 83, 84, 14);
				internalFrame.getContentPane().add(lblProductType);
				
				JLabel lblQuantity_1 = new JLabel("Quantity");
				lblQuantity_1.setBounds(27, 127, 65, 14);
				internalFrame.getContentPane().add(lblQuantity_1);
				
				JLabel lblUnitPrice_1 = new JLabel("Unit Price");
				lblUnitPrice_1.setBounds(27, 178, 65, 14);
				internalFrame.getContentPane().add(lblUnitPrice_1);
				
				p_name = new JTextField();
				p_name.setBounds(121, 29, 160, 20);
				internalFrame.getContentPane().add(p_name);
				p_name.setColumns(10);
				
				p_type = new JTextField();
				p_type.setBounds(121, 80, 160, 20);
				internalFrame.getContentPane().add(p_type);
				p_type.setColumns(10);
				
				p_quantity = new JTextField();
				p_quantity.setBounds(121, 124, 160, 20);
				internalFrame.getContentPane().add(p_quantity);
				p_quantity.setColumns(10);
				
				p_price = new JTextField();
				p_price.setBounds(121, 175, 160, 20);
				internalFrame.getContentPane().add(p_price);
				p_price.setColumns(10);
				
				JButton btnOk_4 = new JButton("OK");
				btnOk_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try 
						{
							String query="insert into ProductInfo (ProductName,ProductType,Quantity,Price) values(?,?,?,?)";
							PreparedStatement pst = con.prepareStatement(query);
							pst.setString(1,p_name.getText());
							pst.setString(2, p_type.getText());
							pst.setString(3, p_quantity.getText());
							pst.setString(4, p_price.getText());
							pst.execute();
							JOptionPane.showMessageDialog(null, "Product Register Successfully");
							pst.close();
						}
						catch(Exception e1)
						{
							JOptionPane.showMessageDialog(null, e1);
						}
					}
				});
				btnOk_4.setBounds(125, 228, 89, 23);
				internalFrame.getContentPane().add(btnOk_4);
				internalFrame.setVisible(true);
			
			}
		});
		btnProductRegister.setBounds(45, 26, 193, 38);
		contentPane.add(btnProductRegister);
		
		JButton btnCutomerInfo = new JButton("Cutomer Info");
		btnCutomerInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				   
				JInternalFrame internalFrame = new JInternalFrame("Customer Entry");
				internalFrame.getContentPane().setBackground(Color.CYAN);
				internalFrame.getContentPane().setForeground(Color.BLACK);
				internalFrame.setBorder(null);
				internalFrame.setClosable(true);
				internalFrame.setBounds(293, 26, 352, 306);
				contentPane.add(internalFrame);
				internalFrame.getContentPane().setLayout(null);
				
				JLabel lblCustomerName = new JLabel("Customer Name");
				lblCustomerName.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblCustomerName.setBounds(10, 40, 98, 14);
				internalFrame.getContentPane().add(lblCustomerName);
				
				c_name = new JTextField();
				c_name.setBounds(118, 37, 212, 29);
				internalFrame.getContentPane().add(c_name);
				c_name.setColumns(10);
				
				JLabel lblPhone = new JLabel("Phone");
				lblPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPhone.setBounds(10, 84, 79, 14);
				internalFrame.getContentPane().add(lblPhone);
				
				c_phone = new JTextField();
				c_phone.setBounds(118, 77, 212, 29);
				internalFrame.getContentPane().add(c_phone);
				c_phone.setColumns(10);
				
				JLabel lblEmail = new JLabel("E-mail");
				lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblEmail.setBounds(10, 124, 66, 14);
				internalFrame.getContentPane().add(lblEmail);
				
				c_email = new JTextField();
				c_email.setBounds(118, 117, 212, 29);
				internalFrame.getContentPane().add(c_email);
				c_email.setColumns(10);
				
				JButton btnOk = new JButton("OK");
				btnOk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
						String query = "insert into CutomerInfo (CustomerName,Phone,Email,Address) values (?,?,?,?)";
					   PreparedStatement pst = con.prepareStatement(query);
					      pst.setString(1, c_name.getText());
					      pst.setString(2,c_phone.getText());
					      pst.setString(3,c_email.getText());
					      pst.setString(4, c_address.getText());
					      pst.execute();
					      JOptionPane.showMessageDialog(null,"Customer Information saved");
					      pst.close();
						}
						catch(Exception e1) {
							JOptionPane.showMessageDialog(null, e1);
						}
					}
				});
				btnOk.setBackground(Color.LIGHT_GRAY);
				btnOk.setFont(new Font("Tahoma", Font.ITALIC, 12));
				btnOk.setBounds(169, 223, 89, 23);
				internalFrame.getContentPane().add(btnOk);
				
				JLabel lblAddress = new JLabel("Address");
				lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblAddress.setBounds(10, 166, 79, 14);
				internalFrame.getContentPane().add(lblAddress);
				
				c_address = new JTextField();
				c_address.setBounds(118, 157, 212, 29);
				internalFrame.getContentPane().add(c_address);
				c_address.setColumns(10);
				internalFrame.setVisible(true);
				
			}
		});
		btnCutomerInfo.setBounds(45, 252, 193, 41);
		contentPane.add(btnCutomerInfo);
		
		
		JButton btnSupplierRegister = new JButton("Supplier Register");
		btnSupplierRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame internalFrame = new JInternalFrame("Supllier Information");
				internalFrame.getContentPane().setBackground(new Color(0, 51, 102));
				internalFrame.setResizable(true);
				internalFrame.setClosable(true);
				internalFrame.setBounds(332, 39, 324, 303);
				contentPane.add(internalFrame);
				internalFrame.getContentPane().setLayout(null);
				
				JLabel lblProductId = new JLabel("Product ID");
				lblProductId.setForeground(new Color(255, 255, 204));
				lblProductId.setBackground(new Color(255, 255, 204));
				lblProductId.setBounds(21, 24, 70, 14);
				internalFrame.getContentPane().add(lblProductId);
				
				JLabel lblCompanyName = new JLabel("Company Name");
				lblCompanyName.setForeground(new Color(255, 255, 204));
				lblCompanyName.setBounds(10, 61, 96, 14);
				internalFrame.getContentPane().add(lblCompanyName);
				
				JLabel lblNewLabel = new JLabel("Amount");
				lblNewLabel.setForeground(new Color(255, 255, 204));
				lblNewLabel.setBounds(21, 107, 70, 14);
				internalFrame.getContentPane().add(lblNewLabel);
				
				JLabel lblAddress_2 = new JLabel("Address");
				lblAddress_2.setForeground(new Color(255, 255, 204));
				lblAddress_2.setBounds(21, 148, 70, 14);
				internalFrame.getContentPane().add(lblAddress_2);
				
				JLabel lblPhonr = new JLabel("Phone");
				lblPhonr.setForeground(new Color(255, 255, 204));
				lblPhonr.setBounds(21, 193, 46, 14);
				internalFrame.getContentPane().add(lblPhonr);
				
				p_id = new JTextField();
				p_id.setBounds(111, 21, 187, 20);
				internalFrame.getContentPane().add(p_id);
				p_id.setColumns(10);
				
				c_nam = new JTextField();
				c_nam.setBounds(111, 58, 187, 20);
				internalFrame.getContentPane().add(c_nam);
				c_nam.setColumns(10);
				
				s_amount = new JTextField();
				s_amount.setBounds(111, 104, 187, 20);
				internalFrame.getContentPane().add(s_amount);
				s_amount.setColumns(10);
				
				s_address = new JTextField();
				s_address.setBounds(111, 145, 187, 20);
				internalFrame.getContentPane().add(s_address);
				s_address.setColumns(10);
				
				s_phone = new JTextField();
				s_phone.setBounds(111, 190, 187, 20);
				internalFrame.getContentPane().add(s_phone);
				s_phone.setColumns(10);
				
				JButton btnOk_2 = new JButton("OK");
				btnOk_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							
							String query = "insert into Supllier (ProductId,CompanyName,Amount,Address,phone) values (?,?,?,?,?)";
							PreparedStatement pst = con.prepareStatement(query);
							pst.setString(1,p_id.getText());
							pst.setString(2,c_nam.getText());
							pst.setString(3, s_amount.getText());
							pst.setString(4,s_address.getText());
							pst.setString(5,s_phone.getText());
							pst.execute();
							JOptionPane.showMessageDialog(null, "Saved");
							pst.close();
						}
						catch(Exception e) {
							JOptionPane.showMessageDialog(null, e);
						}
					}
				});
				btnOk_2.setBounds(108, 239, 89, 23);
				internalFrame.getContentPane().add(btnOk_2);
			    internalFrame.setVisible(true);
			}
		});
		btnSupplierRegister.setBounds(45, 312, 193, 38);
		contentPane.add(btnSupplierRegister);
		
		JButton btnNewButton_1 = new JButton("Enter Data tables");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoadTable lt = new LoadTable();
				lt.Loadmain(null);
				dispose();
			}
		});
		btnNewButton_1.setBounds(45, 367, 193, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Successfully Logout");
				dispose();
			}
		});
		btnLogOut.setBounds(586, 408, 89, 23);
		contentPane.add(btnLogOut);
		
		
	}
	public double getPrice()
	{
		   String quantity="",price="";
		   double quan=0,prce=0;
		try {
			String query = "select Quantity , price from ProductInfo where ProductId = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,e_p_id.getText());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				quantity = rs.getString(1);
				price = rs.getString(2);
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		 prce = Double.parseDouble(price);
		return prce;
	}
	
	public double getQuan()
	{
		  String quantity="",price="";
		   double quan=0,prce=0;
		try {
			String query = "select Quantity , price from ProductInfo where ProductId = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,e_p_id.getText());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				quantity = rs.getString(1);
				price = rs.getString(2);
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		 quan = Double.parseDouble(quantity);
		return quan;
	}
}
