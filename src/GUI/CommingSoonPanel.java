package GUI;



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class CommingSoonPanel extends JPanel{
	 
	 
	  
     @Override
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	OptionPanel optionPanel;
		try {
			optionPanel = new OptionPanel();
			optionPanel.paintComponent(g);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
    	
    }
     
     public JLabel CreateMenuButton() throws IOException{
      Image imglong_button = LoadingImage ("/button/long_button.png");
   	  ImageIcon long_button = new ImageIcon(imglong_button);
   	  
    	 JLabel ExitButton = new JLabel();
  	    ExitButton.setIcon(long_button);
  	    ExitButton.setBounds(110, 234, long_button.getIconWidth(), long_button.getIconHeight());
  	    ExitButton.addMouseListener(new MouseAdapter() {

  			@Override
  			public void mousePressed(MouseEvent e) {
  			    ExitButton.setBounds(110, 236, long_button.getIconWidth(), long_button.getIconHeight());
  				super.mousePressed(e);
  			}

  			@Override
  			public void mouseReleased(MouseEvent e) {
  			    ExitButton.setBounds(110, 234, long_button.getIconWidth(), long_button.getIconHeight());
  				super.mouseReleased(e);
  			}
  	    	
  		});
  	    return ExitButton;
     }
     
     public void ADDALL() throws IOException
     {
    	 this.add(CreateMenuButton());
     }
     
     public CommingSoonPanel() {
    	 setLayout(null);
    	 
    	 
    	 JLabel CommingSoon = new JLabel();
    	 CommingSoon.setText("敬请期待");
    	 CommingSoon.setFont(new Font("华文琥珀", 1, 48));
    	 CommingSoon.setForeground(new Color(177,148,77));
    	 CommingSoon.setBounds(100, 100, 300, 100);
    	 add(CommingSoon);
    	 
    	 JLabel MainMenu = new JLabel();
    	 MainMenu.setText("主菜单");
    	 MainMenu.setFont(new Font("华文琥珀", 1, 20));
    	 MainMenu.setForeground(Color.GREEN);
    	 MainMenu.setBounds(160, 235, 100, 40);
    	 add(MainMenu);
    	 
    	 
    	 
    	 
     }
     
     public  Image LoadingImage (String s ) throws IOException
 	{
 	
 		URL url = getClass().getResource(s);
 		BufferedImage image = ImageIO.read(url);
 		return image;
 	}
	

	
}
