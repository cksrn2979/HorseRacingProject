package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import controller.HorseMoverThread;
import model.Horse;
import service.HorseRunners;

public class RacingPanel extends JPanel{
	public final int WIDTH=900;
	public final int HEIGHT=300;
	
	public RacingPanel(){
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.setBackground(null);
		this.setLayout(null);
		
		HorseRunners horses=HorseRunners.getInstance();
		
		Horse horse1=horses.getHorse(0);
	
		horse1.setLocation(horse1.getMeter(),0);
		this.add(horse1.getGraphic());
		
		Horse horse2=horses.getHorse(1);
		horse2.setLocation(horse2.getMeter(),75);
		this.add(horse2.getGraphic());
		
		Horse horse3=horses.getHorse(2);
		horse3.setLocation(horse3.getMeter(),160);
		this.add(horse3.getGraphic());
		
		Horse horse4=horses.getHorse(3);
		horse4.setLocation(horse4.getMeter(),240);
		this.add(horse4.getGraphic());
		
	}
	
	public void paintComponent(Graphics g){
		ImageIcon icon=new ImageIcon("images/background.jpg");
		Image img=icon.getImage();
		super.paintComponent(g);
		g.drawImage(img, 0,0,this);
	}
	
}
