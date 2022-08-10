package week8;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] grid = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        System.out.println("Original grid:");
        for(int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
        System.out.println("Modified image: ");

        floodFill((grid), 1, 0, 3);
        for(int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void floodFill(int[][] grid, int sRow, int sCol, int newColor) {
        if(grid == null || grid.length == 0 || grid[sRow][sCol] == newColor) return;
        dfsFill(grid, sRow, sCol, grid[sRow][sCol], newColor);
    }

    public static void dfsFill(int[][] grid, int i, int j, int color, int newColor) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] !=color) return;

        if(grid[i][j] == color) {
            grid[i][j] = newColor;
        }
        dfsFill(grid, i + 1, j, color, newColor);
        dfsFill(grid, i - 1, j, color, newColor);
        dfsFill(grid, i, j + 1, color, newColor);
        dfsFill(grid, i, j - 1, color, newColor);
    }
}
