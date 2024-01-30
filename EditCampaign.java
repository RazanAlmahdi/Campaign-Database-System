package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class EditCampaign extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditCampaign frame = new EditCampaign();
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
	public EditCampaign() {
		setBackground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextPane mainlbl = new JTextPane();
		mainlbl.setToolTipText("CENTER");
		mainlbl.setEditable(false);
		mainlbl.setBackground(Color.PINK);
		mainlbl.setBounds(71, 121, 291, 72);
		contentPane.add(mainlbl);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(241, 79, 121, 20);
		contentPane.add(textField_1);
		
		final JLabel lblNewLabel_1_1 = new JLabel("New Name");
		lblNewLabel_1_1.setFont(new Font("Bell MT", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(87, 82, 121, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("Enter the new Campaign information ");
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setBounds(115, 26, 428, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New ID");
		lblNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 11));
		lblNewLabel_1.setBounds(87, 54, 121, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(241, 51, 121, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final Campaign camp = new  Campaign();
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Bell MT", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				camp.setCampId(textField.getText());
				camp.setCampName(textField_1.getText());
				mainlbl.setText("Campaign added successfully!" + "\nCampaign ID: " + camp.getCampId() + "\nCampaign Name: " + camp.getCampName());
				textField.setText("");
				textField_1.setText("");
				}
				catch (Exception e1){
					mainlbl.setText("Please Enter valid data");
				}
			}
		});
		btnNewButton.setBounds(57, 204, 121, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Okay");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Bell MT", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(267, 204, 114, 23);
		contentPane.add(btnNewButton_1);
		
  

	}
}
