package com.excelsiorsoft.grid.traverse;

class Grid { 

    /**
     * Calculates a count of paths from top leftmost to bottom rightmost cell 
     * 
     * @param row number of rows in a grid
     * @param column number of columns in a grid
     * @return count of paths
     */
    static int numberOfPaths(int row, int column) 
    { 
    	int seed = 1;
        int[] buffer = new int[column]; 
        buffer[0] = seed; 
  
        for (int r = 0; r < row; r++) { 
            for (int c = seed/*init*/; c < column; c++) { 
            	//accumulate previous step's value in current cell
                buffer[c] += buffer[c - 1]; 
            } 
        } 
  
        return buffer[column - seed]; 
    } 
  
    // Driver program to test above function 
    public static void main(String args[]) 
    { 
    	System.out.println("2x2 -> "+ numberOfPaths(2, 2)); 
    	System.out.println("2x3 -> "+ numberOfPaths(2, 3)); 
        System.out.println("2x4 -> "+ numberOfPaths(2, 4)); 
    } 
} 

