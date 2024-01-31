package seleniumAutoTest;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BOA_LoginFunctionalityTest {

	public static void main(String[] args) {
		//1. Instantiating webDriver
		
		System.setProperty("webDriver.chrome.driver","C:\\upskill");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");				//Navigate to webSite.
		driver.manage().window().maximize();						//Maximizing the browser window
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);//Manage timeouts implicitlyWait
		
		driver.findElement(By.xpath("//*[@id=\"onlineId1\"]")).sendKeys("abcd@gmail.com");//Finding Element of userName by.xPath
		driver.findElement(By.cssSelector("#passcode1")).sendKeys("abcd12345");			  //Finding Element of password by.cssSelector
		driver.findElement(By.xpath("//*[@id=\"signIn\"]/span[1]")).click();			  //Finding Element of LogIn by.xpath
		
		String URL=driver.getCurrentUrl();
		System.out.println("The URL of the application is: " + URL);
		
		String title=driver.getTitle();
		System.out.println("The title of application is: " +title  );
		
		//driver.close();
		driver.quit();
		System.out.println("The Test Successfully Completed! (With Negetive Credential)");

	}
}
