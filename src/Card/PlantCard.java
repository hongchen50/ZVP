package Card;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Plant.Plant;
import Plant.PlantUpdate;
import Sun.Sun;
import Util.Grass;
import Util.LoadingImage;
import Util.PlantUtil;
import Zombie.GamePanel;

public class PlantCard extends JPanel {
	Plant plant;
	int Price;

	
	//草地类参数
    int i;
    int j;
	//定义本面板中组件位置
	int x=0;
	int y=0;
	//定义窗口中位置
	static int frameX=0;
	static int frameY=50;
	LoadingImage loadingImage=new LoadingImage();
	Image CardBG=loadingImage.LoadingImage("/img/CardBG.png");
	
	Image imgPlant;
	//偏移量调整
	static int k=0;
	public PlantCard(Plant plant) {
		setLayout(null);
		setBounds(frameX, frameY, CardBG.getWidth(null), CardBG.getHeight(null));
		frameY+=CardBG.getHeight(null);
		int r;
		r=k;
		//setBackground(Color.BLACK);
		this.plant=plant;
		this.Price=plant.getPrice();
		this.imgPlant=plant.getImgPlant();
		//setBackground(Color.black);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
			j=Grass.ReturnX(e.getX());
			i=Grass.ReturnY(e.getY()+r);
		if(i!=-1&&j!=-1) {
		
			if(Sun.SunNumber>=plant.getPrice()&&Grass.grasses[i][j].exist==false) {
				Grass.grasses[i][j].exist=true;
				Plant RealPlant = PlantUtil.CreateRealPlant(plant);
				RealPlant.setX(Grass.grasses[i][j].x);
				RealPlant.setY(Grass.grasses[i][j].y);
			    GamePanel.plants.add(RealPlant);	
			    new PlantUpdate(RealPlant).start();
			    Sun.SunNumber-=RealPlant.getPrice();
			    GamePanel.SunLabel.setText(Sun.SunNumber+"");
		        
			    
			    
			    }
			}
			
			}
			
		});
		JLabel PlantPrice = new JLabel();
		PlantPrice.setText(Price+"");
	    PlantPrice.setBounds(x+(CardBG.getWidth(null)-40)/2, y+CardBG.getHeight(null)-29, 40, 20);
	    PlantPrice.setFont(new Font("微软雅黑", 1, 20));
		add(PlantPrice);
	    k+=140;
	}
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(CardBG, x, y, null);
		g.drawImage(imgPlant, x+7, y+10, 85, 98, null);
		
	}
	

}
