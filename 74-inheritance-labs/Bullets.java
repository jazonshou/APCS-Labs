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

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
        ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
        ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
        for(Ammo item : ammo) {
            item.draw(window);
        }
	}

	public void moveEmAll()
	{
        for(Ammo item : ammo) {
            item.move("UP");
        }
	}

	public void cleanEmUp()
	{
        for(Ammo item : ammo) {
            if(item.getY() < 0) {
                ammo.remove(item);
            } 
        }
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return ammo.toString();
	}
}
