package GUI;

import java.awt.Button;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import Card.PlantCard;
import Plant.Nuts;
import Plant.PeaShooter;
import Plant.SunFlower;
import Zombie.GamePanel;

public class MenuFrame extends JFrame {
	public MenuFrame() throws IOException {
	
		//JLayeredPane Pane = new JLayeredPane();
		setVisible(true);
		setBounds(0, 0, 750, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HelpPanel helpPanel = new HelpPanel();
		BGPanel bgPanel = new BGPanel();
		OptionPanel optionPanel = new OptionPanel();
		CommingSoonPanel commingSoonPanel = new CommingSoonPanel();
		     add(bgPanel);
		
		//�����������
		JLabel MenuButton = helpPanel.CreateMenuButton();
		MenuButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				super.mouseReleased(arg0);
				remove(helpPanel);
				add(bgPanel);
				repaint();
				revalidate();
			}
			
		});
		helpPanel.add(MenuButton);
		//�����ڴ��������
		JLabel ExitButton = new JLabel();
		ExitButton = commingSoonPanel.CreateMenuButton();
		ExitButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {
				super.mouseReleased(e);
				remove(commingSoonPanel);
				add(bgPanel);
				repaint();
				revalidate();
			}
			
		});
	     commingSoonPanel.add(ExitButton);
		//ѡ��������
	    JLabel ExitGame = optionPanel.CreateExirButton();
	    ExitGame.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				super.mouseReleased(arg0);
				dispose();
			}
	    	
		});
	    optionPanel.add(ExitGame);
	    JLabel Cancel= optionPanel.CreateCancelButton();
	    Cancel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				super.mouseReleased(arg0);
				remove(optionPanel);
				add(bgPanel);
				repaint();
				revalidate();
			}
	    	
		});
	    optionPanel.add(Cancel);
		//���������
        JLabel HelpLabel=bgPanel.CreateLabelHelp();
       
        HelpLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				super.mouseReleased(arg0);
				remove(bgPanel);
				add(helpPanel);
				repaint();
				revalidate();
			}
        	
		});
        JLabel ExitLabel = bgPanel.CreatelabelExit();
        ExitLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent arg0) {
				super.mousePressed(arg0);
				add(optionPanel);
				remove(bgPanel);
				repaint();
				revalidate();
				
			}
        	
		});
        //��ʼð��
        JLabel SAH = bgPanel.CreatelabelSAH();
        SAH.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent arg0) {
				super.mousePressed(arg0);
				GamePanel gamePanel;
				add(gamePanel=new GamePanel());
				 PlantCard plantCard = new PlantCard(new SunFlower());
				 PlantCard plantCard2 = new PlantCard(new PeaShooter());
				 PlantCard plantCard3 = new PlantCard(new Nuts());
				  gamePanel.add(plantCard);
				  gamePanel.add(plantCard2);
			      gamePanel.add(plantCard3);                                                           
			     
				remove(bgPanel);
				repaint();
				revalidate();
			}
        	
		});
        
        //����С��Ϸ
        JLabel SGH = bgPanel.CreatelabelSGH();
        SGH.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {
				
				super.mouseReleased(e);
				remove(bgPanel);
				add(commingSoonPanel);
				repaint();
				revalidate();
				
			}
        	
		});
        //����ģʽ
        JLabel SMH = bgPanel.CreatelabelSMH();
        SMH.addMouseListener(new MouseAdapter() {
        	@Override
			public void mouseReleased(MouseEvent e) {
				
				super.mouseReleased(e);
				remove(bgPanel);
				add(commingSoonPanel);
				repaint();
				revalidate();
				
			}
        	
		});
        //����ģʽ
        JLabel SuMH = bgPanel.CreatelabelSuMH();
        SuMH.addMouseListener(new MouseAdapter() {
        	@Override
			public void mouseReleased(MouseEvent e) {
				
				super.mouseReleased(e);
				remove(bgPanel);
				add(commingSoonPanel);
				repaint();
				revalidate();
				
			}
        	
		});
        bgPanel.add(HelpLabel);
    	bgPanel.add(ExitLabel);
    	bgPanel.add(SAH);
    	bgPanel.add(SGH);
    	bgPanel.add(SMH);
    	bgPanel.add(SuMH);
      
    	
    	
    	//���´���
        revalidate();
		//repaint();
	}

}
