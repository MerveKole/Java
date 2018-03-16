package JavaProje;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import JavaProje.FormEkrani;
import JavaProje.Ari;
//jframe pencere sýnýfý
//Oyun Ekraný Oluþturma
public class FormEkrani extends JFrame{
	private int Genislik=850;
	private int Yukseklik=714;
	
	
	private static FormEkrani form=null;
	
	private FormEkrani()
{
		//pencere kapatýldýðýnda, programa kapatýldý bilgisini ver yoksa arkada çalýþmaya devam ederler
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setDimension: Ýstediðimiz yükseklik ve geniþliði ayarlayabilmek için
		SetDimension(Genislik,Yukseklik);
		//pencerenin boyutunu sabitlemek için
		setResizable(false);
		
		//arý sýnýfý çaðýrýlýr arý eklenir oyun ekranýna
		Ari ari=new Ari();
		add(ari);
		
}
	//singleton: private eriþemiycez o yüzden static tanýmladýk ama þuandada her seferinde anapencere oluþturucak o yüzden yukarýda tanýmlamamýz gerek referansýný tanýmlayarak
	public static FormEkrani FormGetir()
	{
		//"Kontrol pencere oluþturuldu mu" kontrolü yapar.
		if(form==null)
			form=new FormEkrani();	
		return form;
	}
	public void SetDimension(int genislik,int yukseklik)
	{
		//Ekranýn tam ortasýna yerleþmesi için öncelikle toolkit ten çözünürlüðünü getirir.
		Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
		int PosX=0;
		int PosY=0;
		//girilen geniþlik ekranýn geniþliðinden küçük mü? Ekran 1000 ise max 900 olabilsin.
		if(Genislik+100> dimension.width)
			Genislik=dimension.width-100;
		if(Yukseklik+100>dimension.height)
			Yukseklik=dimension.height-100;
		//Pozisyon ne?
		PosX=(dimension.width-Genislik)/2;
		PosY=(dimension.height-Yukseklik)/2;
		//aktif hale getirilir.
		setBounds(PosX,PosY,Genislik,Yukseklik);
	}
}