package JavaProje;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import JavaProje.FormEkrani;
import JavaProje.Panel;
import JavaProje.Ari;

public class Main {

	public static void main(String[] args) {
		//Form ekraný oluþtur
		FormEkrani F=FormEkrani.FormGetir();
		F.setVisible(true);
	    Ari ari=new Ari();	 
	    //Arý sýnýfýný çaðýr
	    
	    Panel panel =new Panel();
	    JFrame jf=new JFrame();
	    jf = F;
	    jf.add(panel);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   ari.CicekEkle();
	  
	  
	   //System.out.println("bu yený proje eee ee");
	    }
}