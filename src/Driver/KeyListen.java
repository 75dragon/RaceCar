package Driver;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListen implements KeyListener
{
	Main ref;
	public KeyListen(Main main)
	{
		ref = main;
	}
	@Override
	public void keyPressed(KeyEvent e)
	{
		switch ( e.getKeyCode() )
        {
            case KeyEvent.VK_LEFT:
                ref.drivers[0].thetaAcc = -60;
                break;
            case KeyEvent.VK_UP:
                ref.drivers[0].acc = -4;
                break;
            case KeyEvent.VK_RIGHT:
                ref.drivers[0].thetaAcc = 60;
                break;
            case KeyEvent.VK_DOWN:
            	ref.drivers[0].acc = 4;
                break;
            case KeyEvent.VK_A:
                ref.drivers[1].thetaAcc = -60;
                break;
            case KeyEvent.VK_W:
                ref.drivers[1].acc = -4;
                break;
            case KeyEvent.VK_D:
                ref.drivers[1].thetaAcc = 60;
                break;
            case KeyEvent.VK_S:
            	ref.drivers[1].acc = 4;
                break;
            case KeyEvent.VK_F:
                ref.drivers[2].thetaAcc = -60;
                break;
            case KeyEvent.VK_T:
                ref.drivers[2].acc = -4;
                break;
            case KeyEvent.VK_H:
                ref.drivers[2].thetaAcc = 60;
                break;
            case KeyEvent.VK_G:
            	ref.drivers[2].acc = 4;
                break;
            case KeyEvent.VK_J:
                ref.drivers[3].thetaAcc = -60;
                break;
            case KeyEvent.VK_I:
                ref.drivers[3].acc = -4;
                break;
            case KeyEvent.VK_L:
                ref.drivers[3].thetaAcc = 60;
                break;
            case KeyEvent.VK_K:
            	ref.drivers[3].acc = 4;
                break;
        }
		System.out.println("hello");
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		switch ( e.getKeyCode() )
        {
            case KeyEvent.VK_LEFT:
            	ref.drivers[0].thetaAcc = 0;
            	ref.drivers[0].thetaVel = 0;
                break;
            case KeyEvent.VK_UP:
            	ref.drivers[0].acc = 0;
            	ref.drivers[0].vel = 0;
                break;
            case KeyEvent.VK_RIGHT:
                ref.drivers[0].thetaAcc = 0;
                ref.drivers[0].thetaVel = 0;
                break;
            case KeyEvent.VK_DOWN:
            	ref.drivers[0].acc = 0;
                ref.drivers[0].vel = 0;
                break;
            case KeyEvent.VK_A:
            	ref.drivers[1].thetaAcc = 0;
            	ref.drivers[1].thetaVel = 0;
                break;
            case KeyEvent.VK_W:
            	ref.drivers[1].acc = 0;
            	ref.drivers[1].vel = 0;
                break;
            case KeyEvent.VK_D:
                ref.drivers[1].thetaAcc = 0;
                ref.drivers[1].thetaVel = 0;
                break;
            case KeyEvent.VK_S:
            	ref.drivers[1].acc = 0;
                ref.drivers[1].vel = 0;
                break;
            case KeyEvent.VK_F:
            	ref.drivers[2].thetaAcc = 0;
            	ref.drivers[2].thetaVel = 0;
                break;
            case KeyEvent.VK_T:
            	ref.drivers[2].acc = 0;
            	ref.drivers[2].vel = 0;
                break;
            case KeyEvent.VK_H:
                ref.drivers[2].thetaAcc = 0;
                ref.drivers[2].thetaVel = 0;
                break;
            case KeyEvent.VK_G:
            	ref.drivers[2].acc = 0;
                ref.drivers[2].vel = 0;
                break;
            case KeyEvent.VK_J:
            	ref.drivers[3].thetaAcc = 0;
            	ref.drivers[3].thetaVel = 0;
                break;
            case KeyEvent.VK_I:
            	ref.drivers[3].acc = 0;
            	ref.drivers[3].vel = 0;
                break;
            case KeyEvent.VK_L:
                ref.drivers[3].thetaAcc = 0;
                ref.drivers[3].thetaVel = 0;
                break;
            case KeyEvent.VK_K:
            	ref.drivers[3].acc = 0;
                ref.drivers[3].vel = 0;
                break;
        }
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}

}
