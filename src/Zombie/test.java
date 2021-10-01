package Zombie;


import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.JFrame;

import Card.PlantCard;
import GUI.CommingSoonPanel;
import Plant.Nuts;
import Plant.PeaShooter;
import Plant.SunFlower;

public class test {
	public static void main(String[] args) {
		//CommonZombie commonZombie = new CommonZombie();
		//CommonZombie commonZombie1 = new CommonZombie();
	//	commonZombie1.setY(500);
		JFrame jFrame = new JFrame();    
		jFrame.setLayout(null);
		
		GamePanel gamePanel = new GamePanel();
	    PlantCard plantCard = new PlantCard(new SunFlower());
	    PlantCard plantCard2 = new PlantCard(new PeaShooter());
	    PlantCard plantCard3 = new PlantCard(new Nuts());
	    gamePanel.add(plantCard);
	    gamePanel.add(plantCard2);
        gamePanel.add(plantCard3);                                                           
     
	   
	    jFrame.add(gamePanel);
	   
		//ZombieController zombieController = new ZombieController(commonZombie);
		
		//jFrame.addKeyListener(zombieController);
	
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		//jFrame.addKeyListener(gamePanel.zb);
		
		jFrame.setVisible(true);
		jFrame.setBounds(0, 0, 750, 600);
	
		
	}

}
