package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;




	 public class BGPanel extends JPanel{
	 		Image BG =null;
	 	//开始冒险吧	
	 	public JLabel CreatelabelSAH () {
	 		URL UrlStartAdventureHighlight = getClass().getResource("/Icon/StartAdventureHighlight.png");
	        ImageIcon StartAdventureHighlight = new ImageIcon(UrlStartAdventureHighlight);
	        StartAdventureHighlight.setImage(StartAdventureHighlight.getImage().getScaledInstance((int) ((int)StartAdventureHighlight.getIconWidth()*0.80),(int) ((int) StartAdventureHighlight.getIconHeight()*0.80), Image.SCALE_DEFAULT));
	        URL UrlStartAdventureLowlight = getClass().getResource("/Icon/StartAdventureLowlight.png");
	        ImageIcon StartAdventureLowlight = new ImageIcon(UrlStartAdventureLowlight);
	        StartAdventureLowlight.setImage(StartAdventureLowlight.getImage().getScaledInstance((int) ((int)StartAdventureLowlight.getIconWidth()*0.80),(int) ((int) StartAdventureLowlight.getIconHeight()*0.80), Image.SCALE_DEFAULT));
	 		JLabel labelSAH = new JLabel();
			labelSAH.setIcon(StartAdventureLowlight);
			labelSAH.setBounds(420, 120, StartAdventureLowlight.getIconWidth(),StartAdventureLowlight.getIconHeight());
			labelSAH.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseExited(MouseEvent e) {
					labelSAH.setIcon(StartAdventureLowlight);
					super.mouseExited(e);
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					labelSAH.setIcon(StartAdventureHighlight);
					super.mouseMoved(e);
				}

				@Override
				public void mousePressed(MouseEvent e) {
					labelSAH.setBounds(420, 122, StartAdventureLowlight.getIconWidth(),StartAdventureLowlight.getIconHeight());
					super.mousePressed(e);
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					labelSAH.setBounds(420, 120, StartAdventureLowlight.getIconWidth(),StartAdventureLowlight.getIconHeight());
					super.mouseReleased(e);
				}
				
			});
			return labelSAH;
	 	}
	 	//玩玩小游戏
	 	public JLabel  CreatelabelSGH() {
	 		URL UrlSmallGameHighlight = getClass().getResource("/Icon/SmallGameHighlight.png");
		    ImageIcon SmallGameHighlight = new ImageIcon(UrlSmallGameHighlight);
		    SmallGameHighlight.setImage(SmallGameHighlight.getImage().getScaledInstance((int) ((int)SmallGameHighlight.getIconWidth()*0.81),(int) ((int) SmallGameHighlight.getIconHeight()*0.81), Image.SCALE_DEFAULT));
		    
			URL UrlSmallGameLowlight = getClass().getResource("/Icon/SmallGameLowlight.png");
		    ImageIcon SmallGameLowlight = new ImageIcon(UrlSmallGameLowlight);
		    SmallGameLowlight.setImage(SmallGameLowlight.getImage().getScaledInstance((int) ((int)SmallGameLowlight.getIconWidth()*0.81),(int) ((int) SmallGameLowlight.getIconHeight()*0.81), Image.SCALE_DEFAULT));
		    
		    JLabel labelSGH = new JLabel();
	    	labelSGH.setIcon(SmallGameLowlight);
		    labelSGH.setBounds(415, 210, SmallGameHighlight.getIconWidth(),SmallGameHighlight.getIconHeight());
		    labelSGH.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseEntered(MouseEvent e) {
			    	labelSGH.setIcon(SmallGameHighlight);
					super.mouseEntered(e);
				}

				@Override
				public void mouseExited(MouseEvent e) {
					labelSGH.setIcon(SmallGameLowlight);
					super.mouseExited(e);
				}

				@Override
				public void mousePressed(MouseEvent e) {
				    labelSGH.setBounds(415, 212, SmallGameHighlight.getIconWidth(),SmallGameHighlight.getIconHeight());
					super.mousePressed(e);
				}

				@Override
				public void mouseReleased(MouseEvent e) {
				    labelSGH.setBounds(415, 210, SmallGameHighlight.getIconWidth(),SmallGameHighlight.getIconHeight());
					super.mouseReleased(e);
				}
		    	
			});
		    return labelSGH;
			
		}
	 	//解密模式
	 	public JLabel CreatelabelSMH(){
	 		  URL UrlSecretModeHighlight = getClass().getResource("/Icon/SecretModeHighlight.png");
	 		    ImageIcon SecretModeHighlight = new ImageIcon(UrlSecretModeHighlight);
	 		    SecretModeHighlight.setImage(SecretModeHighlight.getImage().getScaledInstance((int) ((int)SecretModeHighlight.getIconWidth()*0.82),(int) ((int) SecretModeHighlight.getIconHeight()*0.82), Image.SCALE_DEFAULT));
	 		    
	 		    URL UrlSecretModeLowlight = getClass().getResource("/Icon/SecretModeLowlight.png");
	 		    ImageIcon SecretModeLowlight = new ImageIcon(UrlSecretModeLowlight);
	 		    SecretModeLowlight.setImage(SecretModeLowlight.getImage().getScaledInstance((int) ((int)SecretModeLowlight.getIconWidth()*0.82),(int) ((int) SecretModeLowlight.getIconHeight()*0.82), Image.SCALE_DEFAULT));
	 		    
	 		    JLabel labelSMH = new JLabel();
	 	    	labelSMH.setIcon(SecretModeLowlight);
	 		    labelSMH.setBounds(420, 285, SecretModeHighlight.getIconWidth(),SecretModeHighlight.getIconHeight());
	 		    
	 		    labelSMH.addMouseListener(new MouseAdapter() {

	 				@Override
	 				public void mouseEntered(MouseEvent e) {
	 					labelSMH.setIcon(SecretModeHighlight);
	 					super.mouseEntered(e);
	 				}

	 				@Override
	 				public void mouseExited(MouseEvent e) {
	 					labelSMH.setIcon(SecretModeLowlight);
	 					super.mouseExited(e);
	 				}

	 				@Override
	 				public void mousePressed(MouseEvent e) {
	 				    labelSMH.setBounds(420, 287, SecretModeHighlight.getIconWidth(),SecretModeHighlight.getIconHeight());
	 					super.mousePressed(e);
	 				}

	 				@Override
	 				public void mouseReleased(MouseEvent e) {
	 				    labelSMH.setBounds(420, 285, SecretModeHighlight.getIconWidth(),SecretModeHighlight.getIconHeight());
	 					super.mouseReleased(e);
	 				}
	 		    	
	 			});
	 		    return labelSMH;
	 	}
	 	//生存模式
	 	public JLabel CreatelabelSuMH() {
	 		  URL UrlSurvivalModeHighlight = getClass().getResource("/Icon/SurvivalModeHighlight.png");
	 		    ImageIcon SurvivalModeHighlight = new ImageIcon(UrlSurvivalModeHighlight);
	 		    SurvivalModeHighlight.setImage(SurvivalModeHighlight.getImage().getScaledInstance((int) ((int)SurvivalModeHighlight.getIconWidth()*0.83),(int) ((int) SurvivalModeHighlight.getIconHeight()*0.81+2), Image.SCALE_DEFAULT));
	 		    
	 		    URL UrlSurvivalModeLowlight = getClass().getResource("/Icon/SurvivalModeLowlight.png");
	 		    ImageIcon SurvivalModeLowlight = new ImageIcon(UrlSurvivalModeLowlight);
	 		    SurvivalModeLowlight.setImage(SurvivalModeLowlight.getImage().getScaledInstance((int) ((int)SurvivalModeLowlight.getIconWidth()*0.83),(int) ((int) SurvivalModeLowlight.getIconHeight()*0.81+2), Image.SCALE_DEFAULT));
	 		    
	 		    JLabel labelSuMH = new JLabel();
	 	    	labelSuMH.setIcon(SurvivalModeLowlight);
	 		    labelSuMH.setBounds(420, 350, SurvivalModeHighlight.getIconWidth(),SurvivalModeHighlight.getIconHeight());
	 		    
	 		    labelSuMH.addMouseListener(new MouseAdapter() {

	 				@Override
	 				public void mouseEntered(MouseEvent e) {
	 					labelSuMH.setIcon(SurvivalModeHighlight);
	 					super.mouseEntered(e);
	 				}

	 				@Override
	 				public void mouseExited(MouseEvent e) {
	 					labelSuMH.setIcon(SurvivalModeLowlight);
	 					super.mouseExited(e);
	 				}

	 				@Override
	 				public void mousePressed(MouseEvent e) {
	 				    labelSuMH.setBounds(420, 352, SurvivalModeHighlight.getIconWidth(),SurvivalModeHighlight.getIconHeight());
	 					super.mousePressed(e);
	 				}

	 				@Override
	 				public void mouseReleased(MouseEvent e) {
	 				    labelSuMH.setBounds(420, 350, SurvivalModeHighlight.getIconWidth(),SurvivalModeHighlight.getIconHeight());
	 					super.mouseReleased(e);
	 				}
	 		    	
	 			});
	 		    return labelSuMH;
		}
	 	//选项
	 	public JLabel CreateLabelOption() {
	 		JLabel labelOption = new JLabel();
			labelOption.setText("选项");
			labelOption.setFont(new Font("华文琥珀", 1, 20));//设置字体
			labelOption.setForeground(Color.BLACK);//设置颜色
			labelOption.setBounds(555, 470, 50, 20);
			labelOption.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseEntered(MouseEvent arg0) {
					labelOption.setForeground(Color.GREEN);
					super.mouseEntered(arg0);
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					labelOption.setForeground(Color.BLACK);
					super.mouseExited(arg0);
				}
				
				
			});
			return labelOption;
	 	}
	 	//帮助
	 	public JLabel CreateLabelHelp() {
	 		JLabel labelHelp = new JLabel();
			labelHelp.setText("帮助");
			labelHelp.setFont(new Font("华文琥珀", 1, 20));//设置字体
			labelHelp.setForeground(Color.BLACK);//设置颜色
			labelHelp.setBounds(607, 490, 50, 20);
			labelHelp.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseEntered(MouseEvent arg0) {
					labelHelp.setForeground(Color.GREEN);
					super.mouseEntered(arg0);
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					labelHelp.setForeground(Color.BLACK);
					super.mouseExited(arg0);
				}
				
				
			});
			return labelHelp;
		}
	 	public JLabel CreatelabelExit() {
	 		JLabel labelExit = new JLabel();
	 		labelExit.setText("退出");
			labelExit.setFont(new Font("华文琥珀", 1, 20));//设置字体
			labelExit.setForeground(Color.BLACK);//设置颜色
			labelExit.setBounds(666, 480, 50, 20);
			labelExit.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseEntered(MouseEvent arg0) {
					labelExit.setForeground(Color.GREEN);
					super.mouseEntered(arg0);
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					labelExit.setForeground(Color.BLACK);
					super.mouseExited(arg0);
				}
				
			});
			return labelExit;
	 	}
	 	public void ADDALL() {
			this.add(CreatelabelExit());
			this.add(CreateLabelHelp());
			this.add(CreateLabelOption());
			this.add(CreatelabelSAH());
			this.add(CreatelabelSGH());
			this.add(CreatelabelSMH());
			this.add(CreatelabelSuMH());
		}
	 		public BGPanel()
	 		{      
	 	
                setLayout(null);
	 			URL BGUrl = getClass().getResource("/img/BG.png");
	 			try {
	 				BG = ImageIO.read(BGUrl);
	 			} catch (IOException e) {
	 				e.printStackTrace();
	 			}
	 		    URL UrlWoodSign1 = getClass().getResource("/Icon/WoodSign1.png");
	 		    ImageIcon WoodSign1 = new ImageIcon(UrlWoodSign1);
	 		    WoodSign1.setImage(WoodSign1.getImage().getScaledInstance((int) ((int)WoodSign1.getIconWidth()),(int) ((int) WoodSign1.getIconHeight()), Image.SCALE_DEFAULT));
	 		    JLabel labelWS1 = new JLabel();
	 		    labelWS1.setIcon(WoodSign1);
	 		    labelWS1.setBounds(0, 0, WoodSign1.getIconWidth(),WoodSign1.getIconHeight());
	 		    add(labelWS1);
	 		    //木牌2
	 		    URL UrlWoodSign2 = getClass().getResource("/Icon/WoodSign2.png");
	 		    ImageIcon WoodSign2 = new ImageIcon(UrlWoodSign2);
	 		    WoodSign2.setImage(WoodSign2.getImage().getScaledInstance((int) ((int)WoodSign2.getIconWidth()),(int) ((int) WoodSign2.getIconHeight()), Image.SCALE_DEFAULT));
	 		    JLabel labelWS2 = new JLabel();
	 		    labelWS2.setIcon(WoodSign2);
	 		    labelWS2.setBounds(0, 142, WoodSign2.getIconWidth(),WoodSign2.getIconHeight()); 
	 		    add(labelWS2);
	 		 
	 			
	 		}
	 		protected void paintComponent(Graphics g) {
	 			g.drawImage(BG, 0, 0, 730, 560, null);
	 		}
	 		
	 	}


