//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class Forest
{
	private Thing[][] grid;

	public Forest(int rows, int cols)
	{
		final String[] typeList = "cat dog tree rock".split(" ");
		final String[] nameList = "a b c d e f g h i j k l m n o p q r t s u v w x y z".split(" ");
		
		//load stuff into the grid
        grid = new Thing[rows][cols];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                grid[i][j] = new Thing(
                    typeList[(int)(Math.random() * typeList.length)], 
                    nameList[(int)(Math.random() * nameList.length)], 
                    Math.random() * 35);
            }
        }
	}

	public int setTrappedToNull( )
	{
        int cnt = 0;
        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[r].length; c++) {
                if(isTrapped(r, c) && !(grid[r][c].getType().equals("tree") || grid[r][c].getType().equals("rock"))) {
                    grid[r][c] = null;
                    cnt++;
                }
            }
        }
		return cnt;
	}
	
	  //if location ! a rock && 
	  //is surrounded by > 5 trees or rocks larger than 10
	public boolean isTrapped( int r, int c)
	{
        if(grid[r][c].getType().equals("tree") || grid[r][c].getType().equals("rock")) {
            return false;
        }
        // loop around and check if it's in bounds --> then check what it is
        int cnt = 0;
        for(int i = r-1; i <= r+1; i++) {
            for(int j = c-1; j <= c+1; j++) {
                if(!inBounds(i, j) || grid[i][j] == null) {
                    continue;
                }
                if(grid[i][j].getType().equals("tree") || grid[i][j].getType().equals("rock")) {
                    if(grid[i][j].getSize() > 10) {
                        cnt++;
                    }
                }
            }
        }
		return cnt > 5;
	}

	private boolean inBounds( int r, int c)
	{
		return (r >= 0 && r < grid.length) && (c >= 0 && c < grid[0].length);
	}


	public String toString()
	{
        String out = "";
		for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                out += grid[i][j].toString() + "\t";
            }
            out += "\n";
        }
        return out;
    }
}


