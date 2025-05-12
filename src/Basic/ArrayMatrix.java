package Basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayMatrix {
	
	public static void main(String[] args) {
		
		List<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
        row1.add(2);
        row1.add(3);
        
        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        
        List<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);
        
        for(int i=0; i<matrix.size(); i++) {
        	List<Integer> rows = matrix.get(i);
        	for(int j=0; j<rows.size(); j++) {
        		System.out.print(rows.get(j) + " ");
        	}
        	System.out.println();
        }
        
        for (List<Integer> rows : matrix) {
        	System.out.print("[");
            for (int row : rows) {
                System.out.print(row + " ");
            }
            System.out.println("]");
        }
        
        
        System.out.println("----------------------------------------------------------------------");
		
		int[][][] arr = {
	            { {1, 2}, {3, 4} },
	            { {5, 6}, {7, 8} },
	            { {9, 10}, {11, 12} }
	        };
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Line " + (i + 1) + ":- ");
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}

}
