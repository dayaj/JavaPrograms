package Chapter1;

import java.util.ArrayList;

/*
 * Write a method such that in a M*N matrix, if an element is 0,
 * its entire row and column is set to 0
 * read question - 3:36
 * coding begin - 4:41
 * coding end - 4:53
*/

/*    
1 2 3 4
5 6 0 8
0 1 2 3
4 5 6 7
*/

public class Exercise7 {

	  public static void main(String[] args) {
		Exercise7 obj = new Exercise7(); 
	    int[][] m = {{1,2,3,4},{5,6,0,8,},{0,1,2,3},{4,5,6,7}};
	    System.out.println("Input");
	    for(int i = 0; i < m.length; i++) {
	      for(int j = 0; j < m[i].length; j++) {
	        System.out.print(m[i][j]);    
	      }
	      System.out.println();
	    }
	    obj.makeZero(m);
	    System.out.println("\nOutput");
	    for(int i = 0; i < m.length; i++) {
	      for(int j = 0; j < m[i].length; j++) {
	        System.out.print(m[i][j]);    
	      }
	      System.out.println();
	    }
	  }
	  
	  public int[][] makeZero(int[][] m) {
	    ArrayList<Integer> row = new ArrayList<Integer>();
	    ArrayList<Integer> col = new ArrayList<Integer>();
	    int numRows = m.length;
	    int numCols = m[0].length;
	    for(int i = 0; i < numRows; i++) {
	      for(int j = 0; j < numCols; j++) {
	        if(m[i][j] == 0) {
	          row.add(i);
	          col.add(j);
	        }   
	      }
	    }
	    
	    for(int k = 0; k < row.size(); k++) {
	      int rowNum = row.get(k);
	      for(int j = 0; j < numCols; j++) {
	        m[rowNum][j] = 0;     
	      }
	    }
	    
	    for(int k = 0; k < col.size(); k++) {
	      int colNum = col.get(k);
	      for(int j = 0; j < numRows; j++) {
	        m[j][colNum] = 0;     
	      }
	    }
	    return m;
	  }
}
