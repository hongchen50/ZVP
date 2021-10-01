package Sun;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Util.LoadingImage;
import Zombie.GamePanel;

public class Sun extends JLabel{
	public static int SunNumber;
	    LoadingImage l=new LoadingImage();
		Image imgsun=l.LoadingImage("/img/sun.png");
	    ImageIcon iconsun = new ImageIcon(imgsun);
	static GamePanel gamePanel;
	public  Sun() {
		Sun ThisSun=this;	    
	    setIcon(iconsun);
	    new DeleteSun(this).start();
	    addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				SunNumber+=50;
				GamePanel.SunLabel.setText(SunNumber+"");
				System.out.println(Sun.SunNumber);
				gamePanel.remove(ThisSun);
			}
		});
		
	    
  
	}
	
	public static GamePanel SetGamePanel(GamePanel gamePanel){
		Sun.gamePanel=gamePanel;
		return Sun.gamePanel;
	}
	
	public static GamePanel GetGamePanel() {
		return gamePanel;
	}
	
	
	
	public static JLabel CreateSunLabel() {
		JLabel sun = new JLabel();
		
		sun.setText(SunNumber+"");
		sun.setFont(new Font("»ªÎÄçúçê", 1, 20));
		sun.setForeground(Color.BLACK);
		sun.setBounds(0, 0, 20*10, 20);
		
		return sun;
	}
	
	


}
