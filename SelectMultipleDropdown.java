package assignmentWeek4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMultipleDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement index = driver.findElement(By.id("dropdown1"));
		Select sec = new Select(index);
		sec.selectByIndex(1);
		WebElement text = driver.findElement(By.name("dropdown2"));
		Select sec1 = new Select(text);
		sec1.selectByVisibleText("Appium");
		WebElement value = driver.findElement(By.id("dropdown3"));
		Select sec2 = new Select(value);
		sec2.selectByValue("2");
		List<WebElement> ele = driver.findElements(By.xpath("//select[@class='dropdown']/option"));
		int size = ele.size();
		System.out.println(size);
		driver.findElement(By.xpath("//div[@class='example'][5]//select")).sendKeys("Loadrunner");
		
		WebElement dd = driver.findElement(By.xpath("//div[@class='example'][6]//select"));
		Select dd1= new Select(dd);
		List<WebElement> options = dd1.getOptions();
		for (int i = 0; i <=options.size()-1; i++) {
			options.get(i).click();
			
		}
		List<String> list = new ArrayList<String>();
		for (WebElement each : options) {
			String text3= each.getText();
			list.add(text3);
		}
	   System.out.println(list);
	}

}
