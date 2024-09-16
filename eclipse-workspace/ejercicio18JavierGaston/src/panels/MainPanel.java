package panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel panel = null;
	private JTextField textFieldLocalTeam;
	private JTextField textFieldVisitingTeam;
	private JTextField textFieldLocalGoals;
	private JTextField textFieldVisitingGoals;
	private JTextField textFieldPlace;
	private JTextField textFieldDate;

	private ArrayList<String> textFieldStrings;

	/**
	 * Create the panel.
	 */
	public MainPanel(ArrayList<JPanel> panels) {
		panel = new JPanel();
		panel.setBounds(0, 0, 650, 850);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 650, 850);
		mainPanel.setLayout(null);
		panel.add(mainPanel);

		JLabel lblLocalTeam = new JLabel("Equipo local");
		lblLocalTeam.setBounds(60, 70, 100, 14);
		mainPanel.add(lblLocalTeam);

		JLabel lblVisitingTeam = new JLabel("Equipo visitante");
		lblVisitingTeam.setBounds(60, 110, 100, 14);
		mainPanel.add(lblVisitingTeam);

		JLabel lblLocalGoals = new JLabel("Goles local");
		lblLocalGoals.setBounds(60, 150, 100, 14);
		mainPanel.add(lblLocalGoals);

		JLabel lblVisitingGoals = new JLabel("Goles visitante");
		lblVisitingGoals.setBounds(60, 190, 100, 14);
		mainPanel.add(lblVisitingGoals);

		JLabel lblPlace = new JLabel("Lugar");
		lblPlace.setBounds(60, 230, 100, 14);
		mainPanel.add(lblPlace);

		JLabel lblDate = new JLabel("Fecha");
		lblDate.setBounds(60, 270, 100, 14);
		mainPanel.add(lblDate);

		textFieldLocalTeam = new JTextField();
		textFieldLocalTeam.setBounds(210, 67, 120, 20);
		mainPanel.add(textFieldLocalTeam);
		textFieldLocalTeam.setColumns(10);

		textFieldVisitingTeam = new JTextField();
		textFieldVisitingTeam.setBounds(210, 107, 120, 20);
		mainPanel.add(textFieldVisitingTeam);
		textFieldVisitingTeam.setColumns(10);

		textFieldLocalGoals = new JTextField();
		textFieldLocalGoals.setColumns(10);
		textFieldLocalGoals.setBounds(210, 147, 120, 20);
		mainPanel.add(textFieldLocalGoals);

		textFieldVisitingGoals = new JTextField();
		textFieldVisitingGoals.setColumns(10);
		textFieldVisitingGoals.setBounds(210, 187, 120, 20);
		mainPanel.add(textFieldVisitingGoals);

		textFieldPlace = new JTextField();
		textFieldPlace.setColumns(10);
		textFieldPlace.setBounds(210, 227, 120, 20);
		mainPanel.add(textFieldPlace);

		textFieldDate = new JTextField();
		textFieldDate.setBounds(210, 267, 120, 20);
		mainPanel.add(textFieldDate);
		textFieldDate.setColumns(10);

		JButton btnAdd = new JButton("Añadir");
		btnAdd.setBounds(400, 106, 89, 23);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textFieldLocalTeamString = textFieldLocalTeam.getText().trim();
				String textFieldVisitingTeamString = textFieldVisitingTeam.getText().trim();
				String textFieldLocalGoalsString = textFieldLocalGoals.getText().trim();
				String textFieldVisitingGoalsString = textFieldVisitingGoals.getText().trim();
				String textFieldPlaceString = textFieldPlace.getText().trim();
				String textFieldDateString = textFieldDate.getText().trim();
				if (textFieldLocalTeamString.isEmpty() || textFieldVisitingTeamString.isEmpty()
						|| textFieldLocalGoalsString.isEmpty() || textFieldVisitingGoalsString.isEmpty()
						|| textFieldPlaceString.isEmpty() || textFieldDateString.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");
				} else {
					try {
						int textFieldLocalGoalsInt = Integer.parseInt(textFieldLocalGoalsString);
						int textFieldVisitingGoalsInt = Integer.parseInt(textFieldVisitingGoalsString);
						if (textFieldLocalGoalsInt < 0 || textFieldLocalGoalsInt > 99 || textFieldVisitingGoalsInt < 0
								|| textFieldVisitingGoalsInt > 99) {
							JOptionPane.showMessageDialog(null, "Los goles deben ser entre 0 y 99");
						}
					} catch (NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Los goles deben ser números");
					}

				}
			}
		});
		mainPanel.add(btnAdd);

		JButton btnCharge = new JButton("Cargar");
		btnCharge.setBounds(400, 186, 89, 23);
		mainPanel.add(btnCharge);

		JButton btnSave = new JButton("Guardar");
		btnSave.setBounds(400, 266, 89, 23);
		mainPanel.add(btnSave);

		panel.setLayout(null);
	}

	public JPanel getPanel() {
		return panel;
	}
}
