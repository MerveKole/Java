package JavaProje;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cicek extends JLabel{

	public int mGenislik=50;
	Cicek()
	{
		setPosition(50,50);
	}
	//çiçek resmi ekleme
	@Override
	public void paint(Graphics g)
	{
	
		Graphics2D g2=(Graphics2D)g;
		//Ellipse2D elipse=new Ellipse2D.Double(0,0,mGenislik-2,mGenislik-2);
		Image image =new ImageIcon("images/flower.png").getImage();
		g2.drawImage(image,2,2,null);
	}
	//pozisyonu belirlemek için gerekli olan setPosition komutu
	public void setPosition(int PosX, int PosY)
	{
		setBounds(PosX+50,PosY+50,mGenislik,mGenislik);
	}
}


