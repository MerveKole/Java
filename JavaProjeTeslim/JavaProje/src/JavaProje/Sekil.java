package JavaProje;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import JavaProje.Sekil;
import JavaProje.KONUM;
public class Sekil extends JLabel{
	public int mGenislik=50;
	public int mYon=KONUM.SAG;
	public int skor;
	public int skor1;
	public int skorfinal;
	public int bestskor;
	public int bestskor1;
	public boolean gameOver;
		Sekil()
		{	
			setBounds(100,100,mGenislik,mGenislik);
		}
		@Override
		public void paint(Graphics g)
		{
			//paint ile
			Graphics2D g2=(Graphics2D)g;
			g2.setStroke(new BasicStroke(2));
			Image image =new ImageIcon("images/ari .jpg").getImage();
			g2.drawImage(image,2,2,null);
			
			
			g2.scale(3.0, 3.0);
		}
		public void SolaGit()
		{
			int PosX=getX();
			int PosY=getY();
			
			PosX-=mGenislik;
			setBounds(PosX,PosY,mGenislik,mGenislik);
			
		}
		public void SagaGit()
		{
			int PosX=getX();
			int PosY=getY();
			
			PosX+=mGenislik;
			setBounds(PosX,PosY,mGenislik,mGenislik);
			
		}
		public void YukariGit()
		{
			int PosX=getX();
			int PosY=getY();
			
			PosY-=mGenislik;
			setBounds(PosX,PosY,mGenislik,mGenislik);
		
		}
		public void AsagiGit()
		{
			int PosX=getX();
			int PosY=getY();
			
			PosY+=mGenislik;
			setBounds(PosX,PosY,mGenislik,mGenislik);
			

		}
		public Sekil SekilOlustur()
		{
			Sekil S=new Sekil();
			int X=getX();
			int Y=getY();
			S.setBounds(X,Y,mGenislik,mGenislik);
			S.mYon=-mYon;
			
			S.Hareket();
			S.mYon=mYon;
			
			
			return S;
		}
		public void Hareket()
		{
			if(mYon==KONUM.SOL)
				SolaGit();
			else if(mYon==KONUM.SAG)
				SagaGit();
			else if(mYon==KONUM.ASAGI)
				AsagiGit();
			else
				YukariGit();
		}
		
	}


