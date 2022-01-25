//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Ground 
{
	private ArrayList<Image> tiles;
    private final int SCREEN_WIDTH = 16;
	
	public Ground() throws IOException
	{
		//point the tiles at new array list
		tiles = new ArrayList<Image> ();
		//add in each of the images for the grass.gif, gtoroad.gif, road.gif, rtograss.gif
		tiles.add(ImageIO.read(new File("grass.gif")));
        tiles.add(ImageIO.read(new File("gtoroad.gif")));
        tiles.add(ImageIO.read(new File("road.gif")));
        tiles.add(ImageIO.read(new File("rtograss.gif")));
	}
	
	public void drawGround(Graphics2D g)
	{
		//draw the ground on the screen
        for(int j = 0; j < 2 * 50; j += 50) {
            for(int i = 0; i < SCREEN_WIDTH * 50; i += 50) {
                g.drawImage(tiles.get(0), i, j, null);
            }
        }
        for(int i = 0; i < SCREEN_WIDTH * 50; i += 50) {
            g.drawImage(tiles.get(1), i, 50 * 2, null);
        }
        for(int j = 3 * 50; j < 10 * 50; j += 50) {
            for(int i = 0; i < SCREEN_WIDTH * 50; i += 50) {
                g.drawImage(tiles.get(2), i, j, null);
            }
        }
        for(int i = 0; i < SCREEN_WIDTH * 50; i += 50) {
            g.drawImage(tiles.get(3), i, 50 * 10, null);
        }
        for(int i = 0; i < SCREEN_WIDTH * 50; i += 50) {
            g.drawImage(tiles.get(0), i, 50 * 11, null);
        }
	}	
}