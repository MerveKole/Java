package JavaProje;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image image =new ImageIcon("images/cim.png").getImage();
		int basX=0;
		int basY=0;
		int bitX=400;
		int bitY=400;
		//panel boyutlarý
		//ekrana çizdir
		g.drawImage(image, basX, basY, null);	
		
	}
}

