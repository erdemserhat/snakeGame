package Snake;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Kısaca bir sınıfın başka bir sınıftaki methodlara ve değişkenlere sahip
 * olabilmesi için yapılan işlemdir. Bir sınıf, daha genel bir kavramı ifade
 * eden bir sınıfın elemanlarına sahip olarak tekrar tanımlamak durumunda
 * kalmamaktadır. Bu işlem için Java'da extends keywordü kullanılmaktadır.
 * Aşağıdaki GameFrame class'i JFrame'de olan fonksiyon ve değişkenlere ulaşmamıza
 * imkan tanır.
 *
 * @author CyberWarrior
 *
 */
public class GameFrame extends JFrame {
	//Creating constructor of GameFrame class
	GameFrame(){
		//creating an object of GamePanel class.
		GamePanel panel = new GamePanel();
		//adding panel to frame as a component.
		this.add(panel);
		this.setTitle("Snake Game Version 1.0.0");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); // sets size **
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("C:\\Users\\serha\\Desktop\\logo.png");
		this.setIconImage(icon.getImage());




	}









}
