package br.com.fatec;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;



import java.awt.event.MouseListener;

@SuppressWarnings("serial")
public class Janela extends JFrame{
	private JRadioButton borracha;
	
	public Janela(){	
		
		Rabisco rab1 = new Rabisco(Color.RED);
		Rabisco rab2 = new Rabisco(Color.BLUE);
		
		//Borracha br1 = new Borracha(Color.WHITE);
		//Borracha br2 = new Borracha(Color.WHITE);
	 
		rab1.setBorder(BorderFactory.createLineBorder(Color.RED));
		rab2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		getContentPane().setLayout(new GridLayout(1,2));
		getContentPane().add(rab1);
		getContentPane().add(rab2);
		pack();
		setVisible(true);
		setSize(1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Botao botao1 = new Botao();
		
		//botao1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//botao1.setSize(150,80);
		//botao1.setVisible(true);
		//br1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		//br2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		
		
		//public Botao()
		
        
            	
                
         
        //Janela.add(eraserButton);
		
		
		
	}
	




	public static void main(String[] args){
		new Janela();
		
		
	}
}
