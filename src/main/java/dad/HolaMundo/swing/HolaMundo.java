package dad.HolaMundo.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HolaMundo {

	public static void main(String[] args) {
		
		JLabel saludoLabel = new JLabel();
		saludoLabel.setText("Aquí saldrá el saludo");
		saludoLabel.setBounds(20,20, 120, 50);
		
		JButton saludarBoton = new JButton();
		saludarBoton.setText("Saludar");
		saludarBoton.setBounds(20,80, 120, 50);
		saludarBoton.setToolTipText("Como me pulses te saludo.");
		saludarBoton.addActionListener(e -> saludoLabel.setText("!!!HOLA MUNDO ¡¡¡"));
		
		JPanel rootPanel = new JPanel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludarBoton);
		
		JFrame frame = new JFrame();
		frame.setTitle("Hola Mundo con Swing");
		frame.setSize(320,200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(rootPanel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true); //Abrimos la ventana

	}

}
