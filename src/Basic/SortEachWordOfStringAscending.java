package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class SortEachWordOfStringAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        String input = "java is lang";

	        String[] words = input.split(" ");

	        for (String word : words) {
	            char[] ch = word.toCharArray();
	            Arrays.sort(ch); 
	            String s = new String(ch);
	            System.out.print(s + " ");
	        }

	}

}
