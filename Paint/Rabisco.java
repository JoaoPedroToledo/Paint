package br.com.fatec;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Rabisco extends JComponent implements 
		MouseListener, MouseMotionListener, ActionListener{
	private ArrayList<Point> pontos;
	private int tamanho = 8;
	private int metade = tamanho / 2;
	private Color cor;
	private JRadioButton borracha;
	private boolean borracha;
	
	
	
	
	public Rabisco(Color cor){
		this.cor = cor;
		pontos = new ArrayList<Point>(1024);
		addMouseListener(this);
		addMouseMotionListener(this);
		
	}
	public void Borracha(){
		JPanel pane = new JPanel();
		borracha = new JRadioButton("Borracha");
		borracha.addActionListener(new ColorActionListener());
		pane.add(borracha);
		setPreferredSize(new Dimension(100, 50));
	}
	
	@Override
	protected void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, getWidth(), getHeight());
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(cor);
		for(Point ponto : pontos){
			g2d.fillOval(ponto.x - metade, ponto.y - metade, tamanho, tamanho);
		}
		
		if(borracha == true){
			Point ponto = pontos;
			
		}
		
	    }

	

	@Override
	public void mouseDragged(MouseEvent e) {
		pontos.add(e.getPoint()); repaint();
		//xy.remove(e.getPoint()); repaint();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		pontos.add(e.getPoint()); repaint();
		//xy.remove(e.getPoint()); repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}




	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
