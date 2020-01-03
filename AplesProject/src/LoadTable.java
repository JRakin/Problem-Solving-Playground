import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.JCheckBox;

public class LoadTable extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void Loadmain(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoadTable frame = new LoadTable();
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
	Connection con = null;
	private JTextField search;
	private JTextField p_id;
	private JTextField p_name;
	private JTextField p_type;
	private JTextField quantity;
	private JTextField price;
	private JTextField email;
	JComboBox comboBox = new JComboBox();
	private JInternalFrame internalFrame_1;
	private JLabel lblEmployeeId;
	private JLabel lblName;
	private JLabel lblPhone;
	private JLabel lblSalary;
	private JLabel lblEmail;
	private JLabel lblAddress;
	private JTextField e_id;
	private JTextField e_name;
	private JTextField e_phone;
	private JTextField e_address;
	private JTextField textField;
	private JTextField e_email;
	private JButton btnUpdate_1;
	private JButton btnDelete_1;
	private JInternalFrame internalFrame_2;
	private JLabel lblCustomerName;
	private JLabel lblNewLabel;
	private JLabel lblPhone_1;
	private JLabel lblEmail_1;
	private JLabel lblNewLabel_1;
	private JTextField c_id;
	private JTextField c_name;
	private JTextField c_phone;
	private JTextField c_email;
	private JTextField c_address;
	private JButton btnUpdate_2;
	private JButton btnDelete_2;
	private JInternalFrame internalFrame_3;
	private JLabel lblNewLabel_2;
	private JLabel lblSupplyId;
	private JLabel lblCompanyName;
	private JLabel lblAmount;
	private JLabel lblAddress_1;
	private JLabel lblPhone_2;
	private JTextField pr_id;
	private JTextField s_id;
	private JTextField c_nam;
	private JTextField s_amount;
	private JTextField s_address;
	private JTextField s_phone;
	private JButton btnUpdate_3;
	private JButton btnDelete_3;
	private JLabel lblSearch;
	private JLabel lblSelectTable;
	private JLabel lblIdRequired;
	private JButton btnNewButton_1;
	private JButton btnRecentAddedCustomer;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnBack;
	
	public LoadTable() {
		con = SqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox.setBounds(115, 21, 131, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Product Info");
		comboBox.addItem("Employee Info");
		comboBox.addItem("Customer Info");
		comboBox.addItem("Order");
		comboBox.addItem("Product Supplier");
		comboBox.setSelectedItem(null);
		JButton btnLoadTable = new JButton("Load Table ");
		btnLoadTable.setForeground(new Color(0, 51, 255));
		btnLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(comboBox.getSelectedItem().equals("Product Info")) {
						String query = "select * from ProductInfo";
						PreparedStatement pst = con.prepareStatement(query);
						ResultSet rs = pst.executeQuery();
						
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
					}
					
					if(comboBox.getSelectedItem().equals("Employee Info")) {
						String query = "select * from EmployeeInfo";
						PreparedStatement pst = con.prepareStatement(query);
						ResultSet rs = pst.executeQuery();
						
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
					}
					
					if(comboBox.getSelectedItem().equals("Customer Info")) {
						String query = "select * from CutomerInfo";
						PreparedStatement pst = con.prepareStatement(query);
						ResultSet rs = pst.executeQuery();
						
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
					}
					if(comboBox.getSelectedItem().equals("Order")) {
						String query = "select * from Order01";
						PreparedStatement pst = con.prepareStatement(query);
						ResultSet rs = pst.executeQuery();
						
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
					}
					if(comboBox.getSelectedItem().equals("Product Supplier")) {
						String query = "select * from Supllier";
						PreparedStatement pst = con.prepareStatement(query);
						ResultSet rs = pst.executeQuery();
						
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
					}
					
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnLoadTable.setBounds(261, 20, 103, 23);
		contentPane.add(btnLoadTable);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(388, 91, 502, 360);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					if(comboBox.getSelectedItem().equals("Product Info")) {
						
						try {
						int row = table.getSelectedRow();
						String PID = (table.getModel().getValueAt(row, 0).toString());
						String query = "select * from ProductInfo where ProductId = '"+PID+"' ";
						PreparedStatement pst = con.prepareStatement(query);
						ResultSet rs = pst.executeQuery();
						
						JInternalFrame internalFrame = new JInternalFrame("Product Information");
						internalFrame.getContentPane().setBackground(new Color(0, 128, 0));
						internalFrame.getContentPane().setForeground(Color.GRAY);
						internalFrame.setBorder(null);
						internalFrame.setClosable(true);
						internalFrame.setBounds(27, 76, 326, 323);
						contentPane.add(internalFrame);
						internalFrame.getContentPane().setLayout(null);
						
						JLabel lblProductId = new JLabel("Product ID");
						lblProductId.setFont(new Font("Tahoma", Font.BOLD, 11));
						lblProductId.setForeground(new Color(0, 255, 255));
						lblProductId.setBackground(new Color(0, 0, 139));
						lblProductId.setBounds(27, 33, 70, 14);
						internalFrame.getContentPane().add(lblProductId);
						
						JLabel lblProductName = new JLabel("Product Name");
						lblProductName.setFont(new Font("Tahoma", Font.BOLD, 11));
						lblProductName.setForeground(new Color(0, 255, 255));
						lblProductName.setBounds(27, 70, 90, 14);
						internalFrame.getContentPane().add(lblProductName);
						
						JLabel lblProductType = new JLabel("Product Type ");
						lblProductType.setFont(new Font("Tahoma", Font.BOLD, 11));
						lblProductType.setForeground(new Color(0, 255, 255));
						lblProductType.setBounds(27, 115, 90, 14);
						internalFrame.getContentPane().add(lblProductType);
						
						JLabel lblQuantity = new JLabel("Quantity");
						lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 11));
						lblQuantity.setForeground(new Color(0, 255, 255));
						lblQuantity.setBounds(27, 159, 70, 14);
						internalFrame.getContentPane().add(lblQuantity);
						
						JLabel lblPrice = new JLabel("Price");
						lblPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
						lblPrice.setForeground(new Color(0, 255, 255));
						lblPrice.setBounds(27, 209, 46, 14);
						internalFrame.getContentPane().add(lblPrice);
						
						p_id = new JTextField();
						p_id.setBounds(146, 30, 113, 20);
						internalFrame.getContentPane().add(p_id);
						p_id.setColumns(10);
						
						JButton btnUpdate = new JButton("Update");
						btnUpdate.setBackground(new Color(0, 139, 139));
						btnUpdate.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								int p = JOptionPane.showConfirmDialog(null, "Do you want Update this Information ? ","Update", JOptionPane.YES_NO_OPTION);
								if(p==0) {
								try {
									
									String query = "Update ProductInfo  set ProductName = '"+p_name.getText()+"', ProductType = '"+p_type.getText()+"',Quantity = '"+quantity.getText()+"', Price = '"+price.getText()+"' where ProductId = '"+p_id.getText()+"'" ;
									PreparedStatement pst = con.prepareStatement(query);
									pst.execute();
									
									pst.close();
									
								}
								catch(Exception e1) {
									JOptionPane.showMessageDialog(null, e1);
								}
								refreshable();
							}
							}
						});
						btnUpdate.setBounds(42, 259, 89, 23);
						internalFrame.getContentPane().add(btnUpdate);
						JButton btnDelete = new JButton("Delete");
						btnDelete.setBackground(new Color(0, 139, 139));
						btnDelete.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								int p = JOptionPane.showConfirmDialog(null,"Do you want to Delete this Information ? ", "Delete", JOptionPane.YES_NO_OPTION);
								if(p==0) {
								try {
									
									String query = "delete from ProductInfo where ProductId = '"+p_id.getText()+"' ";
									PreparedStatement pst = con.prepareStatement(query);
									pst.execute();
									
									p_id.setText(null);
									p_name.setText(null);
									p_type.setText(null);
									quantity.setText(null);
									price.setText(null);
									pst.close();
								}
								catch(Exception e2) {
									JOptionPane.showMessageDialog(null, e2);
								}
								refreshable();
							}
							}
						});
						btnDelete.setBounds(170, 259, 89, 23);
						internalFrame.getContentPane().add(btnDelete);
						
						p_name = new JTextField();
						p_name.setBounds(143, 67, 116, 20);
						internalFrame.getContentPane().add(p_name);
						p_name.setColumns(10);
						
						p_type = new JTextField();
						p_type.setBounds(144, 112, 115, 20);
						internalFrame.getContentPane().add(p_type);
						p_type.setColumns(10);
						
						quantity = new JTextField();
						quantity.setBounds(143, 156, 116, 20);
						internalFrame.getContentPane().add(quantity);
						quantity.setColumns(10);
						
						price = new JTextField();
						price.setBounds(144, 206, 115, 20);
						internalFrame.getContentPane().add(price);
						price.setColumns(10);
						
						
						while(rs.next()) {
							p_id.setText(rs.getString("ProductId"));
							p_name.setText(rs.getString("ProductName"));
							p_type.setText(rs.getString("ProductType"));
							quantity.setText(rs.getString("Quantity"));
							price.setText(rs.getString("Price"));
						}
						internalFrame.setVisible(true);
						pst.close();
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null, e);
						}
						
					}
					
					
					if(comboBox.getSelectedItem().equals("Employee Info")) {
						
						
							try {
								
								int row = table.getSelectedRow();
								String PID = (table.getModel().getValueAt(row, 0).toString());
								String query = "select * from EmployeeInfo where EmployeeId = '"+PID+"' ";
								PreparedStatement pst = con.prepareStatement(query);
								ResultSet rs = pst.executeQuery();
							
						internalFrame_1 = new JInternalFrame("Employee Information");
						internalFrame_1.getContentPane().setBackground(new Color(250, 240, 230));
						internalFrame_1.setResizable(true);
						internalFrame_1.setClosable(true);
						internalFrame_1.setBounds(10, 74, 346, 394);
						contentPane.add(internalFrame_1);
						internalFrame_1.getContentPane().setLayout(null);
						
						lblEmployeeId = new JLabel("Employee ID");
						lblEmployeeId.setBounds(27, 44, 78, 14);
						internalFrame_1.getContentPane().add(lblEmployeeId);
						
						lblName = new JLabel("Name");
						lblName.setBounds(35, 88, 46, 14);
						internalFrame_1.getContentPane().add(lblName);
						
						lblPhone = new JLabel("Phone");
						lblPhone.setBounds(35, 131, 46, 14);
						internalFrame_1.getContentPane().add(lblPhone);
						
						lblSalary = new JLabel("Salary");
						lblSalary.setBounds(35, 215, 46, 14);
						internalFrame_1.getContentPane().add(lblSalary);
						
						lblEmail = new JLabel("Email");
						lblEmail.setBounds(35, 263, 46, 14);
						internalFrame_1.getContentPane().add(lblEmail);
						
						lblAddress = new JLabel("Address");
						lblAddress.setBounds(35, 171, 70, 14);
						internalFrame_1.getContentPane().add(lblAddress);
						
						e_id = new JTextField();
						e_id.setBounds(131, 41, 189, 20);
						internalFrame_1.getContentPane().add(e_id);
						e_id.setColumns(10);
						
						e_name = new JTextField();
						e_name.setBounds(131, 85, 189, 20);
						internalFrame_1.getContentPane().add(e_name);
						e_name.setColumns(10);
						
						e_phone = new JTextField();
						e_phone.setBounds(131, 128, 189, 20);
						internalFrame_1.getContentPane().add(e_phone);
						e_phone.setColumns(10);
						
						e_address = new JTextField();
						e_address.setBounds(131, 168, 189, 20);
						internalFrame_1.getContentPane().add(e_address);
						e_address.setColumns(10);
						
						textField = new JTextField();
						textField.setBounds(131, 215, 189, 20);
						internalFrame_1.getContentPane().add(textField);
						textField.setColumns(10);
						
						e_email = new JTextField();
						e_email.setBounds(132, 260, 188, 20);
						internalFrame_1.getContentPane().add(e_email);
						e_email.setColumns(10);
						
						btnUpdate_1 = new JButton("Update");
						btnUpdate_1.setBackground(new Color(255, 255, 0));
						btnUpdate_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								int p = JOptionPane.showConfirmDialog(null, "Do you want Update this Information ? ","Update", JOptionPane.YES_NO_OPTION);
								if(p==0) {
                                try {
									
									String query = "Update EmployeeInfo  set EmployeeName = '"+e_name.getText()+"', Phone = '"+e_phone.getText()+"',Address = '"+e_address.getText()+"', Salary = '"+textField.getText()+"',Email = '"+e_email.getText()+"' where EmployeeId = '"+e_id.getText()+"'" ;
									PreparedStatement pst = con.prepareStatement(query);
									pst.execute();
							
									pst.close();
									
								}
								catch(Exception e1) {
									JOptionPane.showMessageDialog(null, e1);
								}
								refreshable();
								
							}
							}
						});
						btnUpdate_1.setBounds(65, 326, 89, 23);
						internalFrame_1.getContentPane().add(btnUpdate_1);
						
						btnDelete_1 = new JButton("Delete");
						btnDelete_1.setBackground(new Color(220, 20, 60));
						btnDelete_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								int p = JOptionPane.showConfirmDialog(null,"Do you want to Delete this Information ? ", "Delete", JOptionPane.YES_NO_OPTION);
								if(p==0) {
                                   try {
									
									String query = "delete from EmployeeInfo where EmployeeId = '"+e_id.getText()+"' ";
									PreparedStatement pst = con.prepareStatement(query);
									pst.execute();
								
									e_id.setText(null);
									e_name.setText(null);
									e_phone.setText(null);
									e_address.setText(null);
									textField.setText(null);
									e_email.setText(null);
									pst.close();
								}
								catch(Exception e2) {
									JOptionPane.showMessageDialog(null, e2);
								}
								refreshable();
							}
							}
						});
						btnDelete_1.setBounds(206, 326, 89, 23);
						internalFrame_1.getContentPane().add(btnDelete_1);
						internalFrame_1.setVisible(true);
						while(rs.next()) {
							e_id.setText(rs.getString("EmployeeId"));
							e_name.setText(rs.getString("EmployeeName"));
							e_phone.setText(rs.getString("Phone"));
							e_address.setText(rs.getString("Address"));
							textField.setText(rs.getString("Salary"));
							e_email.setText(rs.getString("Email"));
						}
						
						
					  }catch(Exception e3) {
						  JOptionPane.showMessageDialog(null,e3);
					  }
							
					
					}
					
					if(comboBox.getSelectedItem().equals("Customer Info")) {
				          
						try {
							int row = table.getSelectedRow();
							String PID = (table.getModel().getValueAt(row, 0).toString());
							String query = "select * from CutomerInfo where CustomerId = '"+PID+"' ";
							PreparedStatement pst = con.prepareStatement(query);
							ResultSet rs = pst.executeQuery();
						internalFrame_2 = new JInternalFrame("Customer Information");
						internalFrame_2.getContentPane().setBackground(new Color(51, 102, 204));
						internalFrame_2.setResizable(true);
						internalFrame_2.setBorder(null);
						internalFrame_2.setClosable(true);
						internalFrame_2.setBounds(52, 85, 309, 341);
						contentPane.add(internalFrame_2);
						internalFrame_2.getContentPane().setLayout(null);
						
						lblCustomerName = new JLabel("Customer ID");
						lblCustomerName.setForeground(new Color(255, 255, 255));
						lblCustomerName.setBackground(new Color(255, 255, 51));
						lblCustomerName.setBounds(27, 35, 94, 14);
						internalFrame_2.getContentPane().add(lblCustomerName);
						
						lblNewLabel = new JLabel("Name");
						lblNewLabel.setForeground(new Color(255, 255, 255));
						lblNewLabel.setBounds(27, 78, 46, 14);
						internalFrame_2.getContentPane().add(lblNewLabel);
						
						lblPhone_1 = new JLabel("Phone");
						lblPhone_1.setForeground(new Color(255, 255, 255));
						lblPhone_1.setBounds(27, 126, 46, 14);
						internalFrame_2.getContentPane().add(lblPhone_1);
						
						lblEmail_1 = new JLabel("Email");
						lblEmail_1.setForeground(new Color(255, 255, 255));
						lblEmail_1.setBounds(27, 170, 46, 14);
						internalFrame_2.getContentPane().add(lblEmail_1);
						
						lblNewLabel_1 = new JLabel("Address");
						lblNewLabel_1.setForeground(new Color(255, 255, 255));
						lblNewLabel_1.setBounds(27, 215, 71, 14);
						internalFrame_2.getContentPane().add(lblNewLabel_1);
						
						c_id = new JTextField();
						c_id.setBounds(131, 32, 139, 20);
						internalFrame_2.getContentPane().add(c_id);
						c_id.setColumns(10);
						
						c_name = new JTextField();
						c_name.setBounds(130, 75, 140, 20);
						internalFrame_2.getContentPane().add(c_name);
						c_name.setColumns(10);
						
						c_phone = new JTextField();
						c_phone.setBounds(130, 123, 140, 20);
						internalFrame_2.getContentPane().add(c_phone);
						c_phone.setColumns(10);
						
						c_email = new JTextField();
						c_email.setBounds(131, 167, 139, 20);
						internalFrame_2.getContentPane().add(c_email);
						c_email.setColumns(10);
						
						c_address = new JTextField();
						c_address.setBounds(129, 212, 141, 20);
						internalFrame_2.getContentPane().add(c_address);
						c_address.setColumns(10);
						
						btnUpdate_2 = new JButton("Update");
						btnUpdate_2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								int p = JOptionPane.showConfirmDialog(null, "Do you want Update this Information ? ","Update", JOptionPane.YES_NO_OPTION);
								if(p==0) {
                                try {
									
									String query = "Update CutomerInfo  set CustomerName = '"+c_name.getText()+"', Phone = '"+c_phone.getText()+"',Email = '"+c_email.getText()+"', Address = '"+c_address.getText()+"' where CustomerId = '"+c_id.getText()+"'" ;
									PreparedStatement pst = con.prepareStatement(query);
									pst.execute();
								
									pst.close();
									
								}
								catch(Exception e1) {
									JOptionPane.showMessageDialog(null, e1);
								}
								refreshable();
								
							}
							}
						});
						btnUpdate_2.setBounds(53, 263, 89, 23);
						internalFrame_2.getContentPane().add(btnUpdate_2);
						
						btnDelete_2 = new JButton("Delete");
						btnDelete_2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								int p = JOptionPane.showConfirmDialog(null,"Do you want to Delete this Information ? ", "Delete", JOptionPane.YES_NO_OPTION);
								if(p==0) {
                                   try {
									
									String query = "delete from CutomerInfo where CustomerId = '"+c_id.getText()+"' ";
									PreparedStatement pst = con.prepareStatement(query);
									pst.execute();
									
									c_id.setText(null);
									c_name.setText(null);
									c_phone.setText(null);
									c_email.setText(null);
									c_address.setText(null);
									pst.close();
								}
								catch(Exception e2) {
									JOptionPane.showMessageDialog(null, e2);
								}
								refreshable();
								
							}
							}
						});
						btnDelete_2.setBounds(181, 263, 89, 23);
						internalFrame_2.getContentPane().add(btnDelete_2);
						internalFrame_2.setVisible(true);
						
						while(rs.next()) {
							c_id.setText(rs.getString("CustomerId"));
							c_name.setText(rs.getString("CustomerName"));
							c_phone.setText(rs.getString("Phone"));
							c_email.setText(rs.getString("Email"));
							c_address.setText(rs.getString("Address"));
						}
						
						
						}catch(Exception e)
						{
							JOptionPane.showMessageDialog(null, e);
						}
						
						
					}
					
					if(comboBox.getSelectedItem().equals("Product Supplier")) {
                           try {
							
							int row = table.getSelectedRow();
							String PID = (table.getModel().getValueAt(row, 0).toString());
							String query = "select * from Supllier where SuplyId = '"+PID+"' ";
							PreparedStatement pst = con.prepareStatement(query);
							ResultSet rs = pst.executeQuery();
							
							internalFrame_3 = new JInternalFrame("Supplier Information");
							internalFrame_3.setResizable(true);
							internalFrame_3.getContentPane().setBackground(new Color(0, 102, 204));
							internalFrame_3.setBackground(new Color(51, 204, 204));
							internalFrame_3.setClosable(true);
							internalFrame_3.setBounds(21, 72, 346, 359);
							contentPane.add(internalFrame_3);
							internalFrame_3.getContentPane().setLayout(null);
							
							lblNewLabel_2 = new JLabel("Suply ID");
							lblNewLabel_2.setForeground(new Color(255, 255, 51));
							lblNewLabel_2.setBounds(31, 34, 76, 14);
							internalFrame_3.getContentPane().add(lblNewLabel_2);
							
							lblSupplyId = new JLabel("Product ID");
							lblSupplyId.setForeground(new Color(255, 255, 51));
							lblSupplyId.setBounds(31, 70, 55, 14);
							internalFrame_3.getContentPane().add(lblSupplyId);
							
							lblCompanyName = new JLabel("Company Name");
							lblCompanyName.setForeground(new Color(255, 255, 51));
							lblCompanyName.setBounds(10, 114, 97, 14);
							internalFrame_3.getContentPane().add(lblCompanyName);
							
							lblAmount = new JLabel("Amount");
							lblAmount.setForeground(new Color(255, 255, 51));
							lblAmount.setBounds(31, 155, 55, 14);
							internalFrame_3.getContentPane().add(lblAmount);
							
							lblAddress_1 = new JLabel("Address");
							lblAddress_1.setForeground(new Color(255, 255, 51));
							lblAddress_1.setBounds(31, 194, 55, 14);
							internalFrame_3.getContentPane().add(lblAddress_1);
							
							lblPhone_2 = new JLabel("Phone");
							lblPhone_2.setForeground(new Color(255, 255, 51));
							lblPhone_2.setBounds(31, 236, 55, 14);
							internalFrame_3.getContentPane().add(lblPhone_2);
							
							pr_id = new JTextField();
							pr_id.setBounds(127, 31, 181, 20);
							internalFrame_3.getContentPane().add(pr_id);
							pr_id.setColumns(10);
							
							s_id = new JTextField();
							s_id.setBounds(127, 67, 181, 20);
							internalFrame_3.getContentPane().add(s_id);
							s_id.setColumns(10);
							
							c_nam = new JTextField();
							c_nam.setBounds(127, 111, 181, 20);
							internalFrame_3.getContentPane().add(c_nam);
							c_nam.setColumns(10);
							
							s_amount = new JTextField();
							s_amount.setBounds(127, 152, 181, 20);
							internalFrame_3.getContentPane().add(s_amount);
							s_amount.setColumns(10);
							
							s_address = new JTextField();
							s_address.setBounds(127, 191, 181, 20);
							internalFrame_3.getContentPane().add(s_address);
							s_address.setColumns(10);
							
							s_phone = new JTextField();
							s_phone.setBounds(127, 233, 181, 20);
							internalFrame_3.getContentPane().add(s_phone);
							s_phone.setColumns(10);
							
							btnUpdate_3 = new JButton("Update");
							btnUpdate_3.setBackground(new Color(102, 204, 204));
							btnUpdate_3.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									int p = JOptionPane.showConfirmDialog(null, "Do you want Update this Information ? ","Update", JOptionPane.YES_NO_OPTION);
									if(p==0) {
									try {
										
										String query = "Update Supllier  set ProductId = '"+s_id.getText()+"', CompanyName = '"+c_nam.getText()+"',Amount = '"+s_amount.getText()+"', Address = '"+s_address.getText()+"',Phone = '"+s_phone.getText()+"' where SuplyId = '"+pr_id.getText()+"'" ;
										PreparedStatement pst = con.prepareStatement(query);
										pst.execute();
										pst.close();
										
									}
									catch(Exception e1) {
										JOptionPane.showMessageDialog(null, e1);
									}
									refreshable();
								}
							}
							});
							btnUpdate_3.setBounds(63, 295, 89, 23);
							internalFrame_3.getContentPane().add(btnUpdate_3);
							
							btnDelete_3 = new JButton("Delete");
							btnDelete_3.setBackground(new Color(51, 255, 51));
							btnDelete_3.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									int p = JOptionPane.showConfirmDialog(null,"Do you want to Delete this Information ? ", "Delete", JOptionPane.YES_NO_OPTION);
									if(p==0) {
									try {
										
										String query = "delete from Supllier where SuplyId = '"+pr_id.getText()+"' ";
										PreparedStatement pst = con.prepareStatement(query);
										pst.execute();
										pr_id.setText(null);
										s_id.setText(null);
										c_nam.setText(null);
										s_amount.setText(null);
										s_address.setText(null);
										s_phone.setText(null);
										pst.close();
									}
									catch(Exception e2) {
										JOptionPane.showMessageDialog(null, e2);
									}
									refreshable();
									
								}
							}
							});
							btnDelete_3.setBounds(208, 295, 89, 23);
							internalFrame_3.getContentPane().add(btnDelete_3);
							internalFrame_3.setVisible(true);
							
							
							
							
							while (rs.next()) {
								pr_id.setText(rs.getString("SuplyId"));
								s_id.setText(rs.getString("ProductId"));
								c_nam.setText(rs.getString("CompanyName"));
								s_amount.setText(rs.getString("Amount"));
								s_address.setText(rs.getString("Address"));
								s_phone.setText(rs.getString("Phone"));
							}
							rs.close();
							pst.close();
							
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null, e);
						}
                           
					}
					
			}
		});
		scrollPane.setViewportView(table);
		
		search = new JTextField();
		search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try {
					
					if(comboBox.getSelectedItem().equals("Product Info")) {
						String query = "select * from ProductInfo where ProductId = ?";
						PreparedStatement pst = con.prepareStatement(query);
						pst.setString(1,search.getText());
						ResultSet rs = pst.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));
						pst.close();
					}
					if(comboBox.getSelectedItem().equals("Employee Info")) {
						String query = "select * from EmployeeInfo where EmployeeId = ?";
						PreparedStatement pst = con.prepareStatement(query);
						pst.setString(1,search.getText());
						ResultSet rs = pst.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));
						pst.close();
					}
					if(comboBox.getSelectedItem().equals("Customer Info")) {
						String query = "select * from CutomerInfo where CustomerId = ?";
						PreparedStatement pst = con.prepareStatement(query);
						pst.setString(1,search.getText());
						ResultSet rs = pst.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));
						pst.close();
					}
					if(comboBox.getSelectedItem().equals("Product Supplier")) {
						String query = "select * from Supllier where SuplyId = ?";
						PreparedStatement pst = con.prepareStatement(query);
						pst.setString(1,search.getText());
						ResultSet rs = pst.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));
						pst.close();
					}
					
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});
		search.setBounds(432, 41, 103, 20);
		contentPane.add(search);
		search.setColumns(10);
		
		lblSearch = new JLabel("Search");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSearch.setBounds(376, 44, 46, 14);
		contentPane.add(lblSearch);
		
		lblSelectTable = new JLabel("Select Table");
		lblSelectTable.setForeground(new Color(0, 51, 255));
		lblSelectTable.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelectTable.setBounds(10, 24, 95, 14);
		contentPane.add(lblSelectTable);
		
		lblIdRequired = new JLabel("ID Required");
		lblIdRequired.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdRequired.setBounds(444, 24, 103, 14);
		contentPane.add(lblIdRequired);
		
		JButton btnNewButton = new JButton("Company ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String query = "select CompanyName,Address,Amount,Phone from Supllier inner join ProductInfo on ProductInfo.ProductId = Supllier.ProductId where Supllier.ProductId = ?";
					PreparedStatement pst = con.prepareStatement(query);
					pst.setString(1,search.getText());
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e) {
					
				}
			}
		});
		btnNewButton.setBounds(555, 40, 108, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("show order");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String query ="select OrderDate,DeliveryDate,Items,UnitPrice,Quantity from Order01 inner join CutomerInfo on CutomerInfo.CustomerId = Order01.CustomerId where Order01.CustomerId=?";
					PreparedStatement pst = con.prepareStatement(query);
					pst.setString(1,search.getText());
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
				}
			}
		});
		btnNewButton_1.setBounds(673, 40, 103, 23);
		contentPane.add(btnNewButton_1);
		
		btnRecentAddedCustomer = new JButton("Recent Added Customer");
		btnRecentAddedCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 String query = "select * from CutomerInfo order by CustomerId desc";
					 PreparedStatement pst = con.prepareStatement(query);
					 ResultSet rs = pst.executeQuery();
					 table.setModel(DbUtils.resultSetToTableModel(rs));
					}
				catch(Exception e3) {
					
				}
			}
		});
		btnRecentAddedCustomer.setBounds(398, 462, 178, 23);
		contentPane.add(btnRecentAddedCustomer);
		
		btnNewButton_2 = new JButton("Recent Added Product");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 String query = "select * from ProductInfo order by ProductId desc";
					 PreparedStatement pst = con.prepareStatement(query);
					 ResultSet rs = pst.executeQuery();
					 table.setModel(DbUtils.resultSetToTableModel(rs));
					}
				catch(Exception e3) {
					
				}
			}
		});
		btnNewButton_2.setBounds(607, 462, 221, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Today Delivery");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String query = "select * from Order01 where DeliveryDate in (select date('now'))";
					PreparedStatement pst = con.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e4) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnNewButton_3.setBounds(786, 40, 114, 23);
		contentPane.add(btnNewButton_3);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginActivity ly = new LoginActivity();
				ly.LoginActivatymain(null);
				dispose();
			}
		});
		btnBack.setBounds(10, 475, 89, 23);
		contentPane.add(btnBack);
		
		
		
	}
	
	public void refreshable()
	{
		try {
			if(comboBox.getSelectedItem().equals("Product Info")) {
				String query = "select * from ProductInfo";
				PreparedStatement pst = con.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
			}
			
			if(comboBox.getSelectedItem().equals("Employee Info")) {
				String query = "select * from EmployeeInfo";
				PreparedStatement pst = con.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
			}
			
			if(comboBox.getSelectedItem().equals("Customer Info")) {
				String query = "select * from CutomerInfo";
				PreparedStatement pst = con.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
			}
			if(comboBox.getSelectedItem().equals("Order")) {
				String query = "select * from Order01";
				PreparedStatement pst = con.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
			}
			if(comboBox.getSelectedItem().equals("Product Supplier")) {
				String query = "select * from Supllier";
				PreparedStatement pst = con.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
