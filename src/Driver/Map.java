package Driver;

import java.awt.Color;
import java.awt.Graphics;

public class Map
{
	int[][] obsticals = new int[6][4];
	Main ref;
	
	public Map(Main main)
	{
		ref = main;
		obsticals[0][0] = 150;
		obsticals[0][1] = 150;
		obsticals[0][2] = 200;
		obsticals[0][3] = 200;
		
		obsticals[1][0] = 300;
		obsticals[1][1] = 200;
		obsticals[1][2] = 250;
		obsticals[1][3] = 300;
		
		obsticals[2][0] = 100;
		obsticals[2][1] = 550;
		obsticals[2][2] = 100;
		obsticals[2][3] = 100;
		
		obsticals[3][0] = 350;
		obsticals[3][1] = 250;
		obsticals[3][2] = 100;
		obsticals[3][3] = 200;
		
		obsticals[4][0] = 550;
		obsticals[4][1] = 150;
		obsticals[4][2] = 100;
		obsticals[4][3] = 100;
		
		obsticals[5][0] = 550;
		obsticals[5][1] = 550;
		obsticals[5][2] = 100;
		obsticals[5][3] = 100;
	}
	
	public void drawMe(Graphics g)
	{
		g.setColor(Color.BLACK);
		for (int i = 0; i < obsticals.length; i++ )
		{
			g.fillRect(obsticals[i][0], obsticals[i][1], obsticals[i][2], obsticals[i][3]);
		}
	}
}
