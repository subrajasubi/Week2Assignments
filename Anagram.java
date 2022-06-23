package week1.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Anagram {
	public static void main(String[] args) throws IOException, InterruptedException {

		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String text1 = "stops";
		String text2 = "potss"; 
		if(text1.length()==text2.length()){
			System.out.println("Length are equal");
		}
		else {
			System.out.println("Length are not equal");
		}
		char[] ch = text1.toCharArray();
		char[] ch2 = text2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch2);
		if(Arrays.equals(ch, ch2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
		
		
		
		

       
      }}
		
		
		
		

