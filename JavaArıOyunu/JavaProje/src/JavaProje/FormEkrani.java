package JavaProje;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import JavaProje.FormEkrani;
import JavaProje.Ari;
//jframe pencere s�n�f�
//Oyun Ekran� Olu�turma
public class FormEkrani extends JFrame{
	private int Genislik=850;
	private int Yukseklik=714;
	
	
	private static FormEkrani form=null;
	
	private FormEkrani()
{
		//pencere kapat�ld���nda, programa kapat�ld� bilgisini ver yoksa arkada �al��maya devam ederler
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setDimension: �stedi�imiz y�kseklik ve geni�li�i ayarlayabilmek i�in
		SetDimension(Genislik,Yukseklik);
		//pencerenin boyutunu sabitlemek i�in
		setResizable(false);
		
		//ar� s�n�f� �a��r�l�r ar� eklenir oyun ekran�na
		Ari ari=new Ari();
		add(ari);
		
}
	//singleton: private eri�emiycez o y�zden static tan�mlad�k ama �uandada her seferinde anapencere olu�turucak o y�zden yukar�da tan�mlamam�z gerek referans�n� tan�mlayarak
	public static FormEkrani FormGetir()
	{
		//"Kontrol pencere olu�turuldu mu" kontrol� yapar.
		if(form==null)
			form=new FormEkrani();	
		return form;
	}
	public void SetDimension(int genislik,int yukseklik)
	{
		//Ekran�n tam ortas�na yerle�mesi i�in �ncelikle toolkit ten ��z�n�rl���n� getirir.
		Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
		int PosX=0;
		int PosY=0;
		//girilen geni�lik ekran�n geni�li�inden k���k m�? Ekran 1000 ise max 900 olabilsin.
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