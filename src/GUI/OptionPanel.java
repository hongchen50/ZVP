package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.datatransfer.StringSelection;import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.security.KeyStore.TrustedCertificateEntry;
import java.util.ArrayList;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class OptionPanel extends JPanel {
	
	
	    
	    Image dialog_header = LoadingImage("/dialog/dialog_header.png");
		
		Image dialog_topleft = LoadingImage("/dialog/dialog_topleft.png");
		Image dialog_topmiddle = LoadingImage("/dialog/dialog_topmiddle.png");
		Image dialog_topright = LoadingImage("/dialog/dialog_topright.png");
		
		Image dialog_centerleft = LoadingImage("/dialog/dialog_centerleft.png");
		Image dialog_centermiddle = LoadingImage("/dialog/dialog_centermiddle.png");
		Image dialog_centerright = LoadingImage("/dialog/dialog_centerright.png");
		
		Image dialog_bottomleft = LoadingImage("/dialog/dialog_bottomleft.png");
		Image dialog_bottommiddle = LoadingImage("/dialog/dialog_bottommiddle.png");
		Image dialog_bottomright = LoadingImage("/dialog/dialog_bottomright.png");
		
		Image imgbutton = LoadingImage("/button/button.png");
		Image imglong_button = LoadingImage("/button/long_button.png");
	    
	    ImageIcon button = new ImageIcon(imgbutton);
	    ImageIcon long_button = new ImageIcon(imglong_button);
	    
	    Image imgBG= LoadingImage("/img/BG.png");
	    ImageIcon BackGrand= new ImageIcon(imgBG);
	
	@Override
	protected void paintComponent(Graphics g) {
	
	super.paintComponent(g);
	int x=0;
    int y=0;

	ArrayList<Image> images= new ArrayList<Image>();
	//images.add(dialog_header);
	
	images.add(dialog_topleft);
	images.add(dialog_topmiddle);
	images.add(dialog_topmiddle);
	images.add(dialog_topright);
	
	images.add(dialog_centerleft);
	images.add(dialog_centermiddle);
	images.add(dialog_centermiddle);
	images.add(dialog_centerright);
	
	images.add(dialog_bottomleft);
	images.add(dialog_bottommiddle);
	images.add(dialog_bottommiddle);
	images.add(dialog_bottomright);
	
	
	 // g.drawImage(images.get(0), x, y, null);
	 // x=x+images.get(0).getWidth(null);
	 // g.drawImage(images.get(1), x, y, null);
	 //g.drawImage(images.get(0), x, y, null);
	 g.drawImage(imgBG, 0, 0, 730, 560, null);
	  y=y+dialog_header.getHeight(null)-10;
	 for (int i = 0; i < images.size(); i++) {
		
		 g.drawImage(images.get(i), x, y, null);
	     x=x+images.get(i).getWidth(null);
		 if((i+1)%4==0)
		 {   x=0;
			 y=y+images.get(i).getHeight(null);
			 
		 }	 
		
	}  
	 
	 
	  g.drawImage(dialog_header,113, 0, null);
	  
	
	}
	
	
    public JLabel CreateExirButton() {
    	JLabel ExitButton = new JLabel();
 	    ExitButton.setIcon(long_button);
 	    ExitButton.setBounds(30, 234, long_button.getIconWidth(), long_button.getIconHeight());
 	    ExitButton.addMouseListener(new MouseAdapter() {

 			@Override
 			public void mousePressed(MouseEvent e) {
 			    ExitButton.setBounds(30, 236, long_button.getIconWidth(), long_button.getIconHeight());
 				super.mousePressed(e);
 			}

 			@Override
 			public void mouseReleased(MouseEvent e) {
 			    ExitButton.setBounds(30, 234, long_button.getIconWidth(), long_button.getIconHeight());
 				super.mouseReleased(e);
 			}
 	    	
 		});
 	    return ExitButton;
	}
	public JLabel CreateCancelButton() {

	    JLabel CancelButton = new JLabel();
	    CancelButton.setIcon(long_button);
	    CancelButton.setFont(new Font("华文琥珀",1,20));
	    CancelButton.setBounds(210, 234, long_button.getIconWidth(), long_button.getIconHeight());
	    CancelButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
			    CancelButton.setBounds(210, 236, long_button.getIconWidth(), long_button.getIconHeight());
				super.mousePressed(e);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			    CancelButton.setBounds(210, 234, long_button.getIconWidth(), long_button.getIconHeight());
			    
				super.mouseReleased(e);
			}
	    	
		});
	    return CancelButton;
	}
	public void ADDALL() {
		this.add(CreateCancelButton());
		this.add(CreateExirButton());
	}
	public OptionPanel () throws IOException {	
		setLayout(null);
		JLabel Exit1 = new JLabel();
		Exit1.setText("退出");
		Exit1.setFont(new Font("华文琥珀", 1, 36));                     //设置字体
		Exit1.setForeground(new Color(177,148,77));                     //设置颜色
		Exit1.setBounds(160, 60, 100, 100);                                                            
	    add(Exit1);
	    
	    JLabel Exit2 = new JLabel();
		Exit2.setText("确定要退出游戏吗");
		Exit2.setFont(new Font("华文琥珀", 1, 20));                     //设置字体
		Exit2.setForeground(new Color(177,148,77));                     //设置颜色
		Exit2.setBounds(112, 100, 180, 150);                                                            
	    add(Exit2);
	    
	    JLabel ExitText = new JLabel();
	    ExitText.setText("退出游戏");
	    ExitText.setFont(new Font("华文琥珀", 1, 20));                     //设置字体
	    ExitText.setForeground(Color.GREEN);                     //设置颜色
	    ExitText.setBounds(65, 205, 100, 100);
	    add(ExitText);
	    
	    JLabel CancelText = new JLabel();
	    CancelText.setText("取消");
	    CancelText.setFont(new Font("华文琥珀", 1, 20));                     //设置字体
	    CancelText.setForeground(Color.GREEN);                     //设置颜色
	    CancelText.setBounds(265, 205, 100, 100);
	    add(CancelText);
	
	  
	    
	    
	    
	}

	
	public  Image LoadingImage (String s ) throws IOException
	{
	
		URL url = getClass().getResource(s);
		BufferedImage image = ImageIO.read(url);
		return image;
	}
  
}
