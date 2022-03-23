//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class AlienHorde
{
	private List<Alien> aliens;
    private long timeCnt;
    private int movePhase;

	public AlienHorde(int size)
	{
        aliens = new ArrayList<Alien> (size);
        movePhase = 0;
	}

	public void add(Alien al)
	{
        aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
        for(Alien item : aliens) {
            item.draw(window);
        }
	}

	public void moveEmAll()
	{
        timeCnt++;
        if((timeCnt %= 250) == 0) {
            movePhase++;
            movePhase %= 4;
            switch(movePhase) {
                case 0:
                    for(Alien alien : aliens) {
                        alien.move("LEFT");
                    }
                    break;
                case 1:
                    for(Alien alien : aliens) {
                        alien.move("DOWN");
                    }
                    break;
                case 2:
                    for(Alien alien : aliens) {
                        alien.move("RIGHT");
                    }
                    break;
                case 3:
                    for(Alien alien : aliens) {
                        alien.move("DOWN");
                    }
                    break;
            }
        }
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
        for(Ammo bullet : shots) {
            for(Alien alien : aliens) {
                if(Util.checkCollision(alien.getX(), alien.getY(), alien.getWidth(), alien.getHeight(),
                                       bullet.getX(), bullet.getY(), bullet.getWidth(), bullet.getHeight()))
                {
                    aliens.remove(alien);
                    shots.remove(bullet);
                }
            }
        }
	}

    public List<Alien> getList() {
        return aliens;
    }

	public String toString()
	{
		return "hola chicos";
	}
}
