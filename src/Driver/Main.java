package Driver;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Main
{
	Car[] drivers = new Car[4];
 	FirstPanel panel;
	FirstFrame frame;
	private static int xDimentionSize = 800;
	private static int yDimentionSize = 800;
	Car first = new Car(700, 200, 0, this, Color.ORANGE);
	Car second = new Car(700, 200, 0, this, Color.BLUE);
	Car third = new Car(700, 200, 0, this, Color.RED);
	Car fourth = new Car(700, 200, 0, this, Color.GREEN);
	Map map;
	
	public Main()
	{
		drivers[0] = first;
		drivers[1] = second;
		drivers[2] = third;
		drivers[3] = fourth;
		map = new Map(this);
		frame = new FirstFrame(xDimentionSize, yDimentionSize);
		panel = new FirstPanel(this);
		frame.add(panel, BorderLayout.CENTER);
		KeyListen lis = new KeyListen(this);
		frame.addKeyListener(lis);
		gameTime();
	}
	ActionListener actionListener = new ActionListener()
	{
		public void actionPerformed(ActionEvent actionEvent)
		{
			for(int z = 0; z < drivers.length; z++)
			{
				drivers[z].moveTick(.05);
			}
			panel.repaint();
		}
	};
	Timer timer = new Timer(20, actionListener);

	public void gameTime()
	{
		timer.start();
	}
	public static void main( String args[] )
	{
		new Main();
	}
}
