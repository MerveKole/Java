package JavaProje;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import JavaProje.FormEkrani;
import JavaProje.Panel;
import JavaProje.Ari;

public class Main {

	public static void main(String[] args) {
		//Form ekran� olu�tur
		FormEkrani F=FormEkrani.FormGetir();
		F.setVisible(true);
	    Ari ari=new Ari();	 
	    //Ar� s�n�f�n� �a��r
	    
	    Panel panel =new Panel();
	    JFrame jf=new JFrame();
	    jf = F;
	    jf.add(panel);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   ari.CicekEkle();
	  
	  
	   //System.out.println("bu yen� proje eee ee");
	    }
}