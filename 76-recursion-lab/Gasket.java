//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class Gasket extends Canvas implements Runnable
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Gasket()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLUE);
		window.setFont(new Font("ARIAL",Font.BOLD,24));
		window.drawString("Sierpinski's Gasket", 25, 50);

		gasket(window, (WIDTH-10)/2, 20, WIDTH-40, HEIGHT-20, 40, HEIGHT-20);
	}

	public void gasket(Graphics window, int x1, int y1, int x2, int y2, int x3, int y3)
	{
		//base case goes here
        if(x2-x1 > 1) {
			//make a random color here
            var red = (int)(Math.random()*255);
            var green = (int)(Math.random()*255);
            var blue = (int)(Math.random()*255);
            window.setColor(new Color(red, green, blue));
			//draw lines to make a triangle or use fillPolygon
            window.drawLine(x1, y1, x2, y2);
            window.drawLine(x2, y2, x3, y3);
            window.drawLine(x3, y3, x1, y1);
			//make some recursive calls
            var leftMidX = (x1+x3)/2;
            var leftMidY = (y2+y1)/2;
            var rightMidX = (x2+x1)/2;
            var rightMidY = (y2+y1)/2;
            var bottomMidX = (x2+x3)/2;
            var bottomMidY = y2;
            gasket(window, x1, y1, rightMidX, rightMidY, leftMidX, leftMidY);
            gasket(window, rightMidX, rightMidY, x2, y2, bottomMidX, bottomMidY);
            gasket(window, leftMidX, leftMidY, bottomMidX, bottomMidY, x3, y3);
        }
	}

	public void run()
	{
		try {
		  	Thread.currentThread().sleep(3);
		}
		catch(Exception e)
		{
		}
	}
}