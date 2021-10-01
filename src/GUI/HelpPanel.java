package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelpPanel extends JPanel {
	Image ZombieNote = LoadingImage("/Help/ZombieNote.png");
	Image GrassBG  = LoadingImage("/Help/4X3grass.jpg");
	Image ZombieNoteHelp =LoadingImage("/Help/ZombieNoteHelp.png");
	Image imgMenubutton= LoadingImage("/button/button.png");
	ImageIcon Menubutton= new ImageIcon(imgMenubutton);
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(GrassBG, 0, 0, null);
		g.drawImage(ZombieNote, 50, 50, null);
		g.drawImage(ZombieNoteHelp, 90, 90, null);	
		
	}
	public JLabel CreateMenuButton() {
		JLabel menubutton = new JLabel();
		menubutton.setIcon(Menubutton);
	    menubutton.setBounds(310, 600-Menubutton.getIconWidth(), Menubutton.getIconWidth(), Menubutton.getIconHeight());
	    menubutton.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
			    menubutton.setBounds(310, 600-Menubutton.getIconWidth()+2, Menubutton.getIconWidth(), Menubutton.getIconHeight());
				super.mousePressed(e);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			    menubutton.setBounds(310, 600-Menubutton.getIconWidth(), Menubutton.getIconWidth(), Menubutton.getIconHeight());
				super.mouseReleased(e);
			}
	    	
		});
	    return menubutton;
	}
	public void ADDALL() {
		this.add(CreateMenuButton());
	}
	public HelpPanel() throws IOException{
		setLayout(null);
		JLabel menutexe = new JLabel();
	    menutexe.setText("Ö÷²Ëµ¥");
	    menutexe.setBounds(335, 480, Menubutton.getIconWidth(), Menubutton.getIconHeight());
	    menutexe.setFont(new Font("Î¢ÈíÑÅºÚ", 1, 20));
	    menutexe.setForeground(Color.GREEN);
        add(menutexe);
	
	}
	public  Image LoadingImage (String s ) throws IOException
	{
	
		URL url = getClass().getResource(s);
		BufferedImage image = ImageIO.read(url);
		return image;
	}

}
