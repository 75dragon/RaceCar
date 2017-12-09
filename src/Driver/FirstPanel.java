package Driver;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FirstPanel extends JPanel
{
	Main ref;
	public FirstPanel(Main get)
	{
		ref = get;
	}
	
	@Override
	public void paint(Graphics g)
	{
		super.paintComponent(g);
		for(int z = 0; z < ref.drivers.length; z++)
		{
			ref.drivers[z].drawMe(g);
		}
		ref.map.drawMe(g);
	}
	
}
