import java.util.ArrayList;
import java.util.Arrays;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
        grid = new String[rows][cols];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                grid[i][j] = vals[(int)(Math.random() * vals.length)];
            }
        }
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
        String max = "";
        int prevMax = 0;
        for(int i = 0; i < vals.length; i++) {
            if(countVals(vals[i]) > prevMax) {
                prevMax = countVals(vals[i]);
                max = vals[i];
            }
        }
		return max;
	}

	//returns a count of how many times val occurs in the matrix
	public int countVals( String val )
	{
        int cnt = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j].equals(val)) {
                    cnt++;
                }
            }
        }
		return cnt;
	}

	//display the grid
	public String toString()
	{
		String output = "";
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                output += grid[i][j] + " ";
            }
            output += "\n";
        }
		return output;
	}
}