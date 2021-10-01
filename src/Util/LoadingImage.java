package Util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class LoadingImage {
	
	
	public  Image LoadingImage (String s )
	{
	
		URL url = getClass().getResource(s);
		BufferedImage image=null;
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return image;
	}

}
