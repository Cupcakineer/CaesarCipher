import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Text implements  ActionListener {
	
	Text() {
		JFrame main = new JFrame();
		main.setSize(800, 800);
		main.setVisible(true);
		main.setTitle("Message Mystifier");
		main.setResizable(false);
		main.setLayout(null);
		//main.getContentPane().add(yellowLabel, BorderLayout.CENTER);
		
		ImageIcon logoicon = new ImageIcon("kenny.PNG");
		Image logo = logoicon.getImage();
		main.setIconImage(logo);
		
		JButton rot = new JButton("Encipher roation");
		rot.setBounds(200, 400, 150, 50);
		JButton morse = new JButton("Enciper Morse Code");
		morse.setBounds(400, 400, 150, 50);
		main.add(rot);
		main.add(morse);
		
		JPanel Pan = new JPanel();
		Pan.setLayout(new BorderLayout());
		main.add(Pan);
		
		JTextField inputtext = new JTextField("Input Message Here",200);
		inputtext.setBounds(250,200 , 300, 50);
		main.add(inputtext);
		//inputtext.addActionListener(encipherString);
		
		JButton encipheredText = new JButton("Display Enciphered Message and Key");
		encipheredText.setBounds(0, 700, 800, 100);
		main.add(encipheredText);
		encipheredText.addActionListener(this);
		Font encipherButton = new Font("serif", Font.PLAIN, 24);
		encipheredText.setFont(encipherButton);
		
		
		
		
		JLabel label = new JLabel("Mystify your Message!");
		Pan.add(label);
		
	}
	public void actionPerformed(ActionEvent e) {
		JFrame output = new JFrame();
		output.setVisible(true);
		output.setTitle("Result");
		output.setSize(400, 400);
		output.setResizable(false);
	}

	public static void main(String[] args) {
		new Text();
	}


	}
