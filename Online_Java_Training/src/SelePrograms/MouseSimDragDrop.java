package SelePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimDragDrop {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		// switching frame
		driver.switchTo().frame(0);
		
		// Draggable Web Element
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		// Dropabble Web Element 
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		// Drag and drop using action class
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
				
	
	}

}
