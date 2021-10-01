package Zombie;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Bullet.Bullet;
import Card.PlantCard;
import Plant.Plant;
import Plant.SunFlower;
import Sun.CreateSun;
import Sun.Sun;
import Util.GAMEMAIN;
import Util.Grass;

public class GamePanel extends JPanel {
	
    public static ArrayList<Zombie> zombies = new ArrayList<Zombie>();
	public static ArrayList<Plant> plants= new ArrayList<Plant>();
	public static ArrayList<Bullet> bullets= new ArrayList<Bullet>();
    public static JLabel SunLabel=Sun.CreateSunLabel(); 
	static int LocationY[]= {0,120,240,360,480};
    
     
     
     
	
	public  GamePanel() {
		Grass.CreateGrass();
		Sun.SetGamePanel(this);
		new ZombieCreater().start();
		add(SunLabel);
		new UpdateGame().start();
		new CreateSun(this).start();
		
		setLayout(null);
		setBounds(0, 0, 2000, 2000);
	
		
	}
	
	
	
	//@Override
	protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		for(int i=0;i<zombies.size();i++) {
			zombies.get(i).DrawMe(g);
		}
		for(int i=0;i<plants.size();i++) {
			plants.get(i).DrawMe(g);
		}
		for(int i=0;i<bullets.size();i++) {
			bullets.get(i).DrawMe(g);
		}
		
		
	}
	
	
	class UpdateGame extends Thread{
		@Override
		public void run() {
			super.run();
			while(true) {
				repaint();
				//GAMEMAIN.BulletAndZombie();
				//GAMEMAIN.PlantAndZombie();
				try {
					sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			/*	try {
					sleep(15);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
		}
	}




}
