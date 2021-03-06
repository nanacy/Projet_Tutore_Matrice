package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PanelMatrice extends JPanel{
	private JPanel panelMatrice; //la partie o� on entre la matrice
	private JPanel panelInstructions; // la partie avec les instructions et  le bouton valider
	private JLabel instruction;//instruction
	
	public PanelMatrice(/*Matrice pMatrice*/) {
		
		panelMatrice = new JPanel();
		panelInstructions = new JPanel();
		instruction = new JLabel("Veuillez compl�ter votre Matrice");
		
		//ce panel est divis� en 2
		this.setLayout(new BorderLayout());
		this.setBorder(new EmptyBorder(100, 100, 100, 100));
		
		//le tableau avec tous les champs pour remplir la matrice
		InputField[] champsInput = new InputField[4*4];
		
		//le bouton valider
		JButton boutonValider = new JButton("Valider");
		boutonValider.setPreferredSize(new Dimension(300, 100));
		boutonValider.setFont(new Font(Font.SERIF, 20, 60));
		
		//prend en param�tre une matrice afin de pouvoir cr�er le nombre de champs n�cessaires pour remplir la matrice
		panelMatrice.setLayout(new GridLayout(4, 4,40,40));
		
		//on ajoute les champs au panel pour remplir la matrice
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				champsInput[j] = new InputField();
				panelMatrice.add(champsInput[j]);
			}
		}
		
		//le panel instruction sera g�r� par un bordere layout
		panelInstructions.setLayout(new BorderLayout(20,20));
		
		//on personnalise l'instruction
		instruction.setFont(new Font(Font.SERIF, 20, 30));
		
		//on lui ajoute le bouton valider et l'instruction
		panelInstructions.add(instruction, BorderLayout.CENTER);
		panelInstructions.add(boutonValider,BorderLayout.SOUTH);
		
		//on ajoute les panel au panelMatrice
		this.add(panelMatrice, BorderLayout.WEST);
		this.add(panelInstructions, BorderLayout.EAST);
	}
}
