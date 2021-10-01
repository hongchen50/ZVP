package GUI;

import java.io.IOException;

import javax.swing.JFrame;

public class test {
 public static void main(String[] args) throws IOException {
		JFrame jFrame = new JFrame();
		CommingSoonPanel commingSoonPanel = new CommingSoonPanel();
		commingSoonPanel.ADDALL();
		jFrame.add(commingSoonPanel);
		jFrame.setVisible(true);
		jFrame.setBounds(0, 0, 750, 600);
		
}
	

}
