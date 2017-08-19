import javax.swing.*;
import java.awt.*;

public class utama extends javax.swing.JFrame{
	
	public utama() {
		initComponent();
	}
	
	private void initComponent() {
		txtCari = new javax.swing.JTextField();
		btnCari = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1257, 720));
        
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel1.setText("Daftar itu.");
        
        JFrame myFrame = new JFrame("My Frame");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER); textLabel.setPreferredSize(new Dimension(300, 100));
        myFrame.getContentPane().add(textLabel, BorderLayout.CENTER);
        myFrame.setLocationRelativeTo(null);
        
        myFrame.pack();
        myFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new utama().setVisible(true);
			}
		});
	}
public javax.swing.JTextField txtCari;
public javax.swing.JButton btnCari;
public javax.swing.JLabel jLabel1;
}
