package Driver;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;

public class Car
{
	Main ref;
	double maxForwardVel = -10;
	double maxBackwardVel = 7;
	double xP;
	double vel = 0;
	double acc = 0;
	double yP;
	double theta;
	double thetaVel = 0;
	double thetaAcc = 0;
	double maxThetaVel = 60;
	int len = 60;
	int wid = 32;
	Color theC;

	public Car(double xpos, double ypos, double initdegree, Main main, Color color)
	{
		xP = xpos;
		yP = ypos;
		theta = initdegree;
		ref = main;
		theC = color;
	}

	public void onCol()
	{
		vel = 0;
		acc = 0;
		thetaVel = 0;
		thetaAcc = 0;
	}

	public boolean checkpoint(double x, double y)
	{
		for (int z = 0; z < ref.map.obsticals.length; z++)
		{
			if (x > ref.map.obsticals[z][0] && x < ref.map.obsticals[z][0] + ref.map.obsticals[z][2]
					&& y > ref.map.obsticals[z][1] && y < ref.map.obsticals[z][1] + ref.map.obsticals[z][3])
			{
				return true;
			}
			if (x < 0)
			{
				return true;
			}
			if (y < 0)
			{
				return true;
			}
			if (y > 760)
			{
				return true;
			}
			if (x > 785)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Resets the car's angular and vertical velocity.
	 */
	public void resetVelocitys()
	{
		thetaVel = 0;
		vel = 0;
	}

	public void moveTick(double t)
	{
		if (acc != 0)
		{
			vel = vel + acc * t;
		} else
		{
			vel = vel * (1 - t);
		}
		if (vel > maxBackwardVel)
		{
			vel = maxBackwardVel;
		}
		if (vel < maxForwardVel)
		{
			vel = maxForwardVel;
		}
		if (thetaAcc != 0)
		{
			thetaVel = thetaVel + thetaAcc * t;
		} else
		{
			thetaVel = thetaVel * (1 - t * 2);
		}
		if (thetaVel > maxThetaVel)
		{
			thetaVel = maxThetaVel;
		}
		if (thetaVel < -maxThetaVel)
		{
			thetaVel = -maxThetaVel;
		}
		theta = theta + thetaVel * t;
		xP = xP - vel * Math.sin(Math.toRadians(theta));
		yP = yP + vel * Math.cos(Math.toRadians(theta));

		if (checkpoint(xP + Math.cos(Math.toRadians(theta)) * wid / 2 - Math.sin(Math.toRadians(theta)) * len / 2,
				yP + Math.sin(Math.toRadians(theta)) * wid / 2 + Math.cos(Math.toRadians(theta)) * len / 2))
		{
			theta = theta - thetaVel * t;
			xP = xP + vel * Math.sin(Math.toRadians(theta));
			yP = yP - vel * Math.cos(Math.toRadians(theta));
			resetVelocitys();
		} else if (checkpoint(
				xP - (Math.cos(Math.toRadians(theta)) * wid / 2 - Math.sin(Math.toRadians(theta)) * len / 2),
				yP - (Math.sin(Math.toRadians(theta)) * wid / 2 + Math.cos(Math.toRadians(theta)) * len / 2)))
		{
			theta = theta - thetaVel * t;
			xP = xP + vel * Math.sin(Math.toRadians(theta));
			yP = yP - vel * Math.cos(Math.toRadians(theta));
			resetVelocitys();
		} else if (checkpoint(
				xP + (Math.cos(Math.toRadians(theta)) * wid / 2 + Math.sin(Math.toRadians(theta)) * len / 2),
				yP + (Math.sin(Math.toRadians(theta)) * wid / 2 - Math.cos(Math.toRadians(theta)) * len / 2)))
		{
			theta = theta - thetaVel * t;
			xP = xP + vel * Math.sin(Math.toRadians(theta));
			yP = yP - vel * Math.cos(Math.toRadians(theta));
			resetVelocitys();
		} else if (checkpoint(
				xP - (Math.cos(Math.toRadians(theta)) * wid / 2 + Math.sin(Math.toRadians(theta)) * len / 2),
				yP - (Math.sin(Math.toRadians(theta)) * wid / 2 - Math.cos(Math.toRadians(theta)) * len / 2)))
		{
			theta = theta - thetaVel * t;
			xP = xP + vel * Math.sin(Math.toRadians(theta));
			yP = yP - vel * Math.cos(Math.toRadians(theta));
			resetVelocitys();
		}
	}

	public void drawMe(Graphics g)
	{
		g.setColor(theC);
		Graphics2D g2d = (Graphics2D) g;
		AffineTransform old = g2d.getTransform();
		g2d.translate((int) xP, (int) yP);
		g2d.rotate(Math.toRadians(theta));
		Rectangle rect2 = new Rectangle((int) (-wid / 2), (int) (-len / 2), wid, len);
		g2d.draw(rect2);
		g2d.fill(rect2);
		g2d.setTransform(old);
		g.setColor(Color.GRAY);
	}
}
