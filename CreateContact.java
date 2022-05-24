package week1.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) throws IOException, InterruptedException {

            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.get("http://leaftaps.com/opentaps/control/login");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
            driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
            driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
            driver.findElement(By.xpath("//a[text()='Contacts']")).click();
            driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
            driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Subraja");
            driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Sivathanu");
            driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Subi");
            driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("S");
            driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Softwaretesting");
            driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Testing");
            driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("subrajasubi@gmail.com");
            WebElement dd = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
            Select sec = new Select(dd);
            sec.selectByVisibleText("New York");
            driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
            driver.findElement(By.xpath("//a[text()='Edit']")).click();
            driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
            driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("test");
            driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
            System.out.println(driver.getTitle());
            driver.close();
      
    	
		
	
      
      }}
		
		
		
		

