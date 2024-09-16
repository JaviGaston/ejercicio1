package main;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import messageInformation.Message;
import panels.MainPanel;

public class Main {
	private JFrame frame;
	private ArrayList<JPanel> panels = null;
	public static ArrayList<Message> messages = new ArrayList<Message>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Main().frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panels = new ArrayList<JPanel>();
		
		MainPanel mainPanel = new MainPanel(panels);
		JPanel panel0 = mainPanel.getPanel();
		panel0.setVisible(true);
		
		panels.add(panel0);
		frame.getContentPane().add(panel0);
		}
}