package week1.day1;

import java.io.IOException;

public class FindTypes {
	public static void main(String[] args) throws IOException, InterruptedException {
		// Here is the input
				

				// Here is what the count you need to find
				
				// Build the logic to find the count of each
				/* Pseudo Code:
					a) Convert the String to character array
					b) Traverse through each character (using loop)
					c) Find if the given character is what type using (if)
							i)  Character.isLetter
							ii) Character.isDigit
							iii)Character.isSpaceChar
							iv) else -> consider as special character
				*/
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] charTestArray = test.toCharArray();
		for(int i=0; i<charTestArray.length; i++) {
			if(Character.isLetter(charTestArray[i])) {
				letter++;
			}else if(Character.isDigit(charTestArray[i])){
				num++;
			}else if(Character.isSpaceChar(charTestArray[i])){
				space++;
			}else {
				specialChar++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
      }}
		
		
		
		

