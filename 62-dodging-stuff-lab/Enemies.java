//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Font;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.ArrayList;


public class Enemies 
{
	private ArrayList<Enemy> enemies;
	private Person guy;
    private final int[] enemySpeeds = new int[] {10, 20};
    private final int topPose = 160;
    private final int bottomPose = 500;
    private final int width = 16 * 50;
    private final int enterZone = 100;
	
	public Enemies(Person p)
	{
		enemies = new ArrayList<Enemy>();
		guy = p;		
	}
	
	// DRAW AND COLLISION METHOD
	public void drawAndCollision(Graphics2D g) throws IOException
	{
        
		// ADD ENEMIES
        addEnemy();
        while(enemies.size() > 10) {
            enemies.remove(enemies.size()-1);
        }

		// REMOVE ENEMIES THAT GO OUT OF BOUND
		for(int i = 0; i < enemies.size(); i++) {
            if(enemies.get(i).getX() < 0 || enemies.get(i).getX() > width || enemies.get(i).getY() < topPose || enemies.get(i).getY() > bottomPose) {
                enemies.remove(i);
            }
        }
		// GO THROUGH THE LIST OF ENEMIES AND CALL THEIR draw() and move() method and check if their collide with guy if so then call the GAMEOVER() METHOD
		for(Enemy enemy : enemies) {
            enemy.draw(g);
            enemy.move();
            if(guy.collide(enemy.getX(), enemy.getY())) {
                GAMEOVER(g);
            }
        }

		// IF THE PLAYER REACHES THE GRASS ON THE BOTTOM SIDE CALL THE VICTORY() method	
        if(guy.getY() > bottomPose) {
            VICTORY(g);
        }	
	}
	
	public void GAMEOVER(Graphics2D g)
	{
		Game.RUNNING = false;
		Font f = new Font("Dialog", Font.PLAIN, 24);
		g.setFont(f);
		g.drawString("GAME OVER!", 400, 300);
	}
	
	public void VICTORY(Graphics2D g)
	{
		Font f = new Font("Dialog", Font.PLAIN, 24);
		g.setFont(f);
		g.drawString("VICTORY!", 400, 300);
		Game.RUNNING = false;
	}
	
	// ADDS AN ENEMY TO THE ENEMY LIST
	public void addEnemy() throws IOException
	{		
        int xPose = 0;
        int yPose = topPose + (int)(Math.random() * (bottomPose-topPose));
        int speed = enemySpeeds[0] + (int)(Math.random() * (enemySpeeds[1] - enemySpeeds[0]));
        Enemy.Direction dir = Enemy.Direction.LEFT;

        switch((int)(Math.random() * 2)) {
            case 0: 
            xPose = (int)(Math.random() * enterZone);
            dir = Enemy.Direction.RIGHT;
            break;
            
            case 1: 
            xPose = (int)(Math.random() * enterZone) + (width - enterZone);
            dir = Enemy.Direction.LEFT;
            break;
        }
        enemies.add(new Enemy(xPose, yPose, speed, dir));
	}
	
	// RETURN HOW MANY ENEMIES THERE ARE
	public int numEnemies()
	{
		return enemies.size();
	}
}
