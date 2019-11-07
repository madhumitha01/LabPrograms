import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

 
public class GUI {
 
	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
 
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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 326, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
 
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrencyConverter.setBounds(73, 11, 166, 17);
		frame.getContentPane().add(lblCurrencyConverter);
 
		JLabel lblUsDollarAmount = new JLabel("US Dollar amount  :");
		lblUsDollarAmount.setBounds(43, 50, 126, 14);
		frame.getContentPane().add(lblUsDollarAmount);
 
		tf1 = new JTextField();
		tf1.setBounds(179, 47, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
 
		JLabel lblEquivalentIn = new JLabel("Equivalent in : ");
		lblEquivalentIn.setBounds(43, 93, 101, 14);
		frame.getContentPane().add(lblEquivalentIn);
 
		tf2 = new JTextField();
		tf2.setEditable(false);
		tf2.setBounds(179, 90, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
 
		JRadioButton rb1 = new JRadioButton("Brazil");
		rb1.setBounds(35, 136, 109, 23);
		frame.getContentPane().add(rb1);
 
		JRadioButton rb2 = new JRadioButton("Canada");
		rb2.setBounds(35, 162, 109, 23);
		frame.getContentPane().add(rb2);
 
		JRadioButton rb3 = new JRadioButton("Europe Community");
		rb3.setBounds(35, 188, 115, 23);
		frame.getContentPane().add(rb3);
 
		JRadioButton rb4 = new JRadioButton("Japan");
		rb4.setBounds(35, 214, 109, 23);
		frame.getContentPane().add(rb4);
 
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);
 
 
 
		JButton b2 = new JButton("Clear");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
				rb1.setSelected(false);
				rb2.setSelected(false);
				rb3.setSelected(false);
				rb4.setSelected(false);
			}
		});
		b2.setBounds(179, 170, 89, 23);
		frame.getContentPane().add(b2);
 
		JButton b3 = new JButton("Quit");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		b3.setBounds(179, 202, 89, 23);
		frame.getContentPane().add(b3);
 
		JButton b1 = new JButton("Compute");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String us=tf1.getText();
				if(us.length()>10){
					tf2.setText("Invalid");
					System.out.println("Invalid");
				}
				else{
					try{
						int i=Integer.parseInt(us);
						if(rb1.isSelected())
						{
							Double d=3.78*i;
							tf2.setText(d.toString());
						}
						if(rb2.isSelected())
						{
							Double d=1.32*i;
							tf2.setText(d.toString());
						}
						if(rb3.isSelected())
						{
							Double d=0.9*i;
							tf2.setText(d.toString());
						}
						if(rb4.isSelected())
						{
							Double d=108.60*i;
							tf2.setText(d.toString());
						}
					}
					catch(Exception ep){
						tf2.setText("Invalid");
						System.out.println("Invalid");
					}
				}
			}
		});
		b1.setBounds(179, 136, 89, 23);
		frame.getContentPane().add(b1);
	}
}