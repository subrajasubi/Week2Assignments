package week1.day1;

import java.io.IOException;

public class ReverseEvenWords {
	public static void main(String[] args) throws IOException, InterruptedException {

		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		

		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 
	*/
		String text = "I am a software tester";
		
		 String[] words = text.split(" ");
		    
		    for (int i = 0; i < words.length; i++) 
		    {
		    	if(i % 2 == 1) 
		    	{
		    		for (int j = words[i].length()-1; j >= 0; j--) 
		    		{
						System.out.print(words[i].charAt(j));
					}
		    		System.out.print(" ");
		    	}
		    	else
		    	{
		    		System.out.print(words[i]+" ");
		    	}
		    }	    
		

      }}
		
		
		
		

