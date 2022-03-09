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
        for(int row = 0; row < grid.length; row++) 
        {
            for(int col = 0; col < grid[row].length; col++) 
            {
                grid[row][col] = new Thing(
                    typeList[(int)(Math.random() * typeList.length)], 
                    nameList[(int)(Math.random() * nameList.length)], 
                    Math.random() * 35);
            }
        }
	}

	public int setTrappedToNull( )
	{
        int cnt = 0;
        for(int r = 0; r < grid.length; r++) 
        {
            for(int c = 0; c < grid[r].length; c++) 
            {
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
        if(grid[r][c].getType().equals("tree") || grid[r][c].getType().equals("rock")) 
        {
            return false;
        }
        // loop around and check if it's in bounds --> then check what it is
        int cnt = 0;
        for(int row = r-1; row <= r+1; row++) 
        {
            for(int col = c-1; col <= c+1; col++) 
            {
                if(!inBounds(row, col) || grid[row][col] == null) 
                {
                    continue;
                }

                if(grid[row][col].getType().equals("tree") || grid[row][col].getType().equals("rock")) 
                {
                    if(grid[row][col].getSize() > 10) 
                    {
                        cnt++;
                    }
                }
            }
        }

		return cnt > 5;
	}

	private boolean inBounds( int r, int c)
	{
        if(r >= 0 && r < grid.length) 
        {
            if(c >= 0 && c < grid[0].length) 
            {
                return true;
            }
        }
		return false;
	}


	public String toString()
	{
        String out = "";

		for(int row = 0; row < grid.length; row++) 
        {
            for(int col = 0; col < grid[row].length; col++) 
            {
                out += grid[row][col] == null ? "null\t" : grid[row][col].toString() + "\t";
            }
            out += "\n";
        }
        return out;
    }
}