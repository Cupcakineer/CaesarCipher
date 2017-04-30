import java.awt.*;
import javax.swing.*;

public class EncipherWindow {
	final static boolean windowfill = true;
	final static boolean fillweightx = true;
	final static boolean rightToLeft = false;

	public static void createComponents(Container menuWindow) {
		JButton functions;
		String[] buttonNames = {"Set Increase Encipher", "Set Decrease Encipher", "Randomized Assigned Letters", "Complete Random", "Morse Inverse",
		"Morse Reverse", "Morse Swap", "Integer Encipher"
		};
		if (rightToLeft) {
			menuWindow.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}
		
		menuWindow.setLayout(new GridBagLayout());
		GridBagConstraints cell = new GridBagConstraints();
		if (windowfill) {
			cell.fill = GridBagConstraints.HORIZONTAL;
		}
		cell.weighty=1;
		for (int i = 0; i < 8; i ++) {

			if (i % 2 == 0) {
				functions= new JButton(buttonNames[i]);
				cell.fill = GridBagConstraints.FIRST_LINE_START;
				cell.weightx = 0.5;
				cell.gridx = 0;
				cell.gridy = i/2;
				functions.setPreferredSize(new Dimension(300,50));
				menuWindow.add(functions, cell);
			}
			else if (i % 2 == 1) {
				functions= new JButton(buttonNames[i]);
				cell.fill = GridBagConstraints.FIRST_LINE_START;
				cell.weightx = 0.5;
				cell.gridx = 1;
				cell.gridy = i/2;
				functions.setPreferredSize(new Dimension(300,50));
				menuWindow.add(functions, cell);
			}
		}
		/*functions = new JButton("Button 1");
		cell.fill = GridBagConstraints.FIRST_LINE_START;
		cell.weightx = 0.5;
		cell.gridx = 0;
		cell.gridy = 0;
		functions.setPreferredSize(new Dimension(300,50));
		menuWindow.add(functions, cell);

		functions = new JButton("Button 2");
		cell.fill = GridBagConstraints.FIRST_LINE_START;
		cell.weightx = 0.5;
		cell.gridx = 1;
		cell.gridy = 0;
		functions.setPreferredSize(new Dimension(300,50));
		menuWindow.add(functions, cell);

		functions = new JButton("Button 3");
		cell.fill = GridBagConstraints.FIRST_LINE_START;
		cell.weightx = 0.5;
		cell.gridx = 0;
		cell.gridy = 1;
		functions.setPreferredSize(new Dimension(300,50));
		menuWindow.add(functions, cell);

		functions = new JButton("Button 4");
		cell.fill = GridBagConstraints.FIRST_LINE_START;
		cell.weightx = 0.5;
		cell.gridx = 1;
		cell.gridy = 1;
		functions.setPreferredSize(new Dimension(300,50));
		menuWindow.add(functions, cell);
		
*/
		functions = new JButton ("Display Enciphered Message and Key");
		cell.fill=GridBagConstraints.FIRST_LINE_START;
		cell.gridx=0;
		cell.gridy=6;
		cell.gridwidth=2;
		functions.setPreferredSize(new Dimension(300,50));
		menuWindow.add(functions, cell);
		
		JTextField inputMessage = new JTextField("Input Message Here", 60);
		cell.ipady = 20;
		cell.weighty = 1.0;
		cell.anchor = GridBagConstraints.PAGE_END;
		cell.gridx = 0;
		cell.gridy = 7;
		cell.gridwidth = 3;
		menuWindow.add(inputMessage, cell);
	}

	private static void displayComponents() {
		JFrame wholeWindow = new JFrame("Message Mystifier");
		wholeWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wholeWindow.setSize(600, 800);
		wholeWindow.setResizable(false);
		createComponents(wholeWindow.getContentPane());
		wholeWindow.pack();
		wholeWindow.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				displayComponents();
			}
		});
	}
}
