//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Enemy 
{
    public static enum Direction {
        LEFT, RIGHT;
    }

	private Image enemy;
	private int x,y,speed;
    private Direction dir;
	
	public Enemy(int x, int y, int speed, Direction dir) throws IOException
	{
		this.x=x;
		this.y=y;
		this.speed=speed;
        this.dir = dir;
		enemy = ImageIO.read(new File("enemy.gif"));
		
	}
	
	public Image getEnemy() {
		return enemy;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSpeed() {
		return speed;
	}

	public void move()
	{
        switch((int)(Math.random() * 2)) {
            case 0: 
            y += speed;
            if(dir == Direction.LEFT) {
                x -= speed;
            } else {
                x += speed;
            }
            break;

            case 1: 
            y -= speed;
            if(dir == Direction.LEFT) {
                x -= speed;
            } else {
                x += speed;
            }
            break;
        }
	}
	
	public void draw(Graphics2D g)
	{
		g.drawImage(enemy, x, y, null);
	}
}
