//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
        super(x,y);
        speed = 5;
	}

	public Ammo(int x, int y, int s)
	{
		//add code
        super(x,y);
        speed = s;
	}

	public void setSpeed(int s)
	{
	   //add code
       speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
        window.setColor(new Color(255, 255, 0));
        window.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
        if(direction.equals("UP")) {
            super.setY(super.getY() - speed);
        } else if(direction.equals("DOWN")) {
            super.setY(super.getY() + speed);
        } else if(direction.equals("LEFT")) {
            super.setX(super.getX() - speed);
        } else {
            super.setX(super.getX() + speed);
        }
	}

	public String toString()
	{
		return "";
	}
}
