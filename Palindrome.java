package week1.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Palindrome {
	public static void main(String[] args) throws IOException, InterruptedException {

		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 * 
		 */
		 String str = "madam";
		 String rev = "";
		 String org = str;
		 for (int i = str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);
		}
		 if(org.equals(rev)) {
			 System.out.println(rev + " Palindrome ");
		 }
		 else {
			 System.out.println(rev  + " Not Palindrome ");
		 }
		 
      }}
		
		
		
		

