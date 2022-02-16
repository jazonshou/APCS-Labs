import java.util.*;
import java.io.*; 

public class MatrixSumming
{
    private int[][] m = {{1, 2, 3, 4, 5}, 
                         {6, 7, 8, 9, 0}, 
                         {6, 7, 1, 2, 5}, 
                         {6, 7, 8, 9, 0}, 
                         {5, 4, 3, 2, 1}};

    public int sum( int r, int c )
    {
        int val = 0;
        if(r >= 0 && r < m.length && c >= 0 && c < m[r].length) {
            val += m[r][c];
        }
        if(r-1 >= 0 && r-1 < m.length && c >= 0 && c < m[r-1].length) {
            val += m[r-1][c];
        }
        if(r >= 0 && r < m.length && c-1 >= 0 && c-1 < m[r].length) {
            val += m[r][c-1];
        }
        if(r+1 >= 0 && r+1 < m.length && c >= 0 && c < m[r+1].length) {
            val += m[r+1][c];
        }
        if(r >= 0 && r < m.length && c+1 >= 0 && c+1 < m[r].length) {
            val += m[r][c+1];
        }
        if(r-1 >= 0 && r-1 < m.length && c-1 >= 0 && c-1 < m[r-1].length) {
            val += m[r-1][c-1];
        }
        if(r+1 >= 0 && r+1 < m.length && c+1 >= 0 && c+1 < m[r+1].length) {
            val += m[r+1][c+1];
        }
        if(r-1 >= 0 && r-1 < m.length && c+1 >= 0 && c+1 < m[r-1].length) {
            val += m[r-1][c+1];
        }
        if(r+1 >= 0 && r+1 < m.length && c-1 >= 0 && c-1 < m[r+1].length) {
            val += m[r+1][c-1];
        }
    	return val;
    }

    public String toString()
    {
        String out = "";
    	for(int r = 0; r < m.length; r++) {
            for(int c = 0; c < m[r].length; c++) {
                out += m[r][c] + " ";
            }
            out += "\n";
        }
        return out;
    }
}
