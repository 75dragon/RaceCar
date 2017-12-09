package Driver;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FirstFrame extends JFrame {
	
	public FirstFrame( int x, int y )
	{
		this.setVisible(true);
		this.setSize(x, y);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}


