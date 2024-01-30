package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setForeground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 512, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.WHITE);
		textPane.setBackground(Color.BLACK);
		textPane.setEditable(false);
		textPane.setBounds(43, 138, 404, 249);
		frame.getContentPane().add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to our Campaign system! We hope you enjoy the experience!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Elephant", Font.ITALIC, 11));
		lblNewLabel_1.setBounds(10, 25, 459, 69);
		frame.getContentPane().add(lblNewLabel_1);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setFont(new Font("Bell MT", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Print Camp info", "Add Campaign", "Print Associate info", "Print Organizer info", "Print Mission info", "Print Resources info"}));
		comboBox.setBounds(43, 105, 218, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("To start, please choose one of the following services:");
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 11));
		lblNewLabel.setBounds(41, 74, 295, 39);
		frame.getContentPane().add(lblNewLabel);
		
		//creating an example objects
		final Campaign campaign = new  Campaign("762391", "FIRE CampX");
        final Associate associate =new Organizer("9388844", "FIRE CampX", "Will Smith", "Wakanda", "011777665", "WillSmith@gmail.com", 8, 500000);  
		final Mission mission = new Mission("9442111","name", "refunds", "in progress");
		final Organizer organizer = new  Organizer("9388844", "FIRE CampX", "Walt Disney", "Tokyo-Japan_Tokayakogi street-2235", "0003511889", "WaltDisney@gmail.com", 8, 5000);
		final Resources resource = new Resources("5555", "Royal Albert Hall ", "FIRE CampX", "52218", "6666432", "in progress");
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Bell MT", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String choice = (String) comboBox.getSelectedItem();
				switch(choice) {
				case "Print Camp info":
					textPane.setText(campaign.toString());
					break;
				case "Add Campaign":
					CampaignAdd frame2 = new CampaignAdd();
					frame2.setVisible(true);
					break;
				case "Print Associate info":
					textPane.setText(associate.toString()); 
					break;
				case "Print Organizer info":
					textPane.setText(organizer.toString());
					break;
				case "Print Mission info":
					textPane.setText(mission.toString());
					break;
				case "Print Resources info":
					textPane.setText(resource.toString());
					break;
				}
			     	
			}
		});
		btnNewButton.setBounds(357, 105, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}



