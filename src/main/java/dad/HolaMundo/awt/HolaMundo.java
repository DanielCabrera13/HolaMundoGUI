package dad.HolaMundo.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class HolaMundo {

	public static void main(String[] args) {

		// Creamos etiqueta para crear el saludo
		Label saludoLaber = new Label();
		saludoLaber.setText("Aquí saldrá el saludo.");
		saludoLaber.setBounds(20, 20, 120, 50); // medido en pixeles

		// Creamos boton para saludar
		Button saludarButton = new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		saludarButton.addActionListener(e -> saludoLaber.setText("Hola mundo !!!"));

		// Creamos panel (contenedor) que contiene la etiqueta y el boton
		Panel rootPanel = new Panel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLaber);
		rootPanel.add(saludarButton);

		// Creamos ventana
		Frame frame = new Frame();
		frame.setTitle("Hola Mundo");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(rootPanel);
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});

		frame.setVisible(true);

	}
}
