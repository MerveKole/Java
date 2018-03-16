package JavaProje;
import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

import JavaProje.Sekil;
import JavaProje.KONUM;
import JavaProje.Ari.TimerKontrol;
import JavaProje.Cicek;


public class Ari extends JLabel{
	private static final JOptionPane JOption = null;
	private static final Timer Application = null;
	private static final String JoptionPane = null;
	public int puan =-10;
	public Sekil sekil=new Sekil();
	public Timer mTimer=null;
	public Cicek cicek=new Cicek();
	public Random mRandom=null;
	public int skor=0;
	public ArrayList<Sekil> Liste=new ArrayList<Sekil>();
	
	@Override
	public void paintComponent(Graphics g) {
			
		super.paintComponent(g);
		g.setColor(Color.PINK);
		g.setFont(new Font("bauhaus 93",Font.PLAIN,40));
		g.drawString("SKOR : "+skor,50,60);
		
		int W=getWidth();	
		Graphics2D g2=(Graphics2D)g;
		Rectangle2D rect=new Rectangle2D.Double(5,5,getWidth()-50,getHeight()-50);
		
	}
		Ari()
		{
			
			mRandom=new Random(System.currentTimeMillis());
			
			addKeyListener(new KlavyeKontrol());
			setFocusable(true);
			
			mTimer=new Timer(400,new TimerKontrol());
			mTimer.start();
			
			Liste.add(sekil);
		
			add(cicek);
			add(sekil);
			
		}
		

public void CicekEkle()
{ 
	int Width=getWidth()-100-cicek.mGenislik;
	int Height=getHeight()-100-cicek.mGenislik;
	
	
	int PosX=25+Math.abs(mRandom.nextInt())%Width;
	int PosY=25+Math.abs(mRandom.nextInt())%Height;
	PosX=PosX-PosX%50;
	PosY=PosY-PosY%50;
	
	for(int i=0;i<Liste.size();i++)
	{
		if((PosX==Liste.get(i).getX()) && (PosY==Liste.get(i).getX())) 
				{
			
			 CicekEkle();
			
				
			 return;
				}
	}//skor++;

	
	int yanit = 0;
	
	cicek.setPosition(PosX, PosY); 
	puan = puan+10;
	//skor+=10;
	//skor++;
	   System.out.println(puan);
	   
	    if(puan ==10)
	    {
	
	    	System.out.println("1.level bitmiþtir...");
	    	JOptionPane.showMessageDialog(null,"1.level bitti...SKOR : 10");
	    	//skor+=10;
	    	mTimer.stop();
	    	  JOptionPane.showConfirmDialog(null, "OYUNA DEVAM EDÝLSÝN MÝ?", "ÞAMPÝYON'A", 1,1);
	    	 skor+=10;
	    	
	    	   if(yanit == JOptionPane.YES_OPTION)
	    	   {
	    		   mTimer=new Timer(250,new TimerKontrol());
					mTimer.start();
					
					 skor+=10;
	    	   }
	    	   else  
	    	   {
	    	   System.out.println("Çýkýþ Tuþu Sað Üst");
	    	   }
	    	
	    } 
	    if(puan==20)
	    {
	    	skor+=10;
	    }
	    if(puan ==30)
	    {
	    	System.out.println("2.level bitmiþtir...");
	    	JOptionPane.showMessageDialog(null,"2.level bitti...SKOR : 30");
	    	
	    	//seviyeye +1 için buraya yazýcaz skor++;
	    	 JOptionPane.showConfirmDialog(null, "OYUNA DEVAM EDÝLSÝN MÝ?", "ÞAMPÝYONA", 1, 1);
	    	 skor+=10;
	    	 mTimer.stop();
	    	   if(yanit == JOptionPane.YES_OPTION)
	    	   {
	    		   
	    		   mTimer=new Timer(200,new TimerKontrol());
					mTimer.start();
					 
	    		   
	    	   }
	    	   else
	    	   {		
	    		   System.out.println("Çýkýþ Tuþu Sað Üst");   
	    		  
	    		   
	    	   }
	    	   skor+=10;
	    }
	    if(puan==40)
	    {
	    	skor+=10;
	    }
	    if(puan ==50)
	    {
	    	System.out.println("3.level bitmiþtir...");
	    	JOptionPane.showMessageDialog(null,"3.level bitti...SKOR : 50");
	    	//skor; buraya
	    	 mTimer.stop();
	    	 JOptionPane.showConfirmDialog(null, "OYUNA DEVAM EDÝLSÝN MÝ?", "ÞAMPÝYONA", 1, 1);
	    	
	    	
	    	   if(yanit == JOptionPane.YES_OPTION)
	    	   {
	    		   mTimer=new Timer(100,new TimerKontrol());
					mTimer.start();
					//skor+=10;
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Çýkýþ Tuþu Sað Üst"); 
	    	   }
	    	   skor+=10;
	    	  
	    	   if(puan==60)
	    	   {
	    		   skor+=10;
	    	   }
	    	   if(puan==70)
	    	   {
	    		   skor+=10;
	    	   }
	    }
	    if(puan ==80)
	    
	    {
	    	System.out.println("4.level bitmiþtir...");
	    	JOptionPane.showMessageDialog(null,"4.level bitti...SKOR : 80");
	    	//skor++; buraya
	    	 mTimer.stop();
	    	 JOptionPane.showConfirmDialog(null, "OYUNA DEVAM EDÝLSÝN MÝ?", "ÞAMPÝYONA", 1, 1);
	    	 
	    	
	    	   if(yanit == JOptionPane.YES_OPTION)
	    	   {
	    		   mTimer=new Timer(80,new TimerKontrol());
					mTimer.start();
					
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Çýkýþ Tuþu Sað Üst");	    		   
	    	   }
	    	   skor+=10;
	    }
	    if(puan==90)
 	   {
 		   skor+=10;
 	   }
	    if(puan ==140)
	    {
	    	System.out.println("5.level bitmiþtir...");
	    	JOptionPane.showMessageDialog(null,"5.level bitti...SKOR : 140");
	    	 //skor++; burasý
	    	 mTimer.stop();
	    	 JOptionPane.showConfirmDialog(null, "TEBRÝKLER ÞAMPÝYON!OYUNU BEÐENDÝN MÝ ?", "ÞAMPÝYONA", 1, 1);
	    	
	    	 mTimer.stop();
	    	   if(yanit == JOptionPane.YES_OPTION)
	    	   {
	    		   JOptionPane.showInputDialog(puan,"HARÝKASIN!!!GÖRÜÞMEK ÜZERE...");
	    			 mTimer.stop(); 
	    			 
	    	   }
	    	   else
	    	   {
	    		   JOptionPane.showInputDialog(puan,"HARÝKASIN!!!GÖRÜÞMEK ÜZERE...");
	    			 mTimer.stop();
	    	   }
	    	   //sayac+=10;
	    }
	    skor = puan;
	    repaint();
}
int sayac=0;
public void HepsiniYurut()
{
	
	for(int i=Liste.size()-1;i>0;i--)
	{
		Sekil Onceki=Liste.get(i-1);
		Sekil Sonraki=Liste.get(i);
	
		Liste.get(i).Hareket();
		Sonraki.mYon=Onceki.mYon;
		
	}
	sekil.Hareket();
	
}
public boolean CarpismaVarmi()
{
	int Kalem=10;
	int genislik=getWidth();
	int Yukseklik=getHeight();
	
	if(sekil.getX()<=10)
		return true;
	if(sekil.getX()+sekil.mGenislik>=genislik-Kalem)
		return true;
	if(sekil.getY()<=10)
		return true;
	if(sekil.getY()+sekil.mGenislik>=Yukseklik-Kalem)
		return true;
	for(int i=1;i<Liste.size();i++)
	{
		int X=Liste.get(i).getX();
		int Y=Liste.get(i).getY();
		
		if((X==sekil.getX()) && (Y==sekil.getY()))
		return true;
	}
	if((cicek.getX()==sekil.getX())&&(cicek.getY()==sekil.getY()))
	{
		CicekEkle();	
	}
	return false;
}
class KlavyeKontrol implements KeyListener
{
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_S)
		{
			CicekEkle();	
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			
			sekil.mYon=KONUM.SOL;	
		}	
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			
			sekil.mYon=KONUM.SAG;	
		}
		if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			
			sekil.mYon=KONUM.YUKARI;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			
			sekil.mYon=KONUM.ASAGI;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
class TimerKontrol implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		HepsiniYurut();
		if(CarpismaVarmi())
			mTimer.stop();
}
	}
}