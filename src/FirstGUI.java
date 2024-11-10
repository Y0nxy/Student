import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;

public class FirstGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		
		ImageIcon image = new ImageIcon("JC2.png");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(0x313338));
		frame.setVisible(true);
		frame.setTitle("Title!");
		JButton button = new JButton();
		
	}

}
