package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.manage().windows().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 WebElement username = driver.findElement(By.id("txtUsername"));
	      username.sendKeys("admin");
	      WebElement password = driver.findElement(By.id("txtPassword"));
	      password.sendKeys("admin123");

	   // Find the login button and click it
	      WebElement loginButton = driver.findElement(By.id("btnLogin"));
	      loginButton.click();
	      
	      // Verify that the user is logged in by checking the title of the page
	      String expectedTitle = "OrangeHRM";
	      String actualTitle = driver.getTitle();
	      if (expectedTitle.equals(actualTitle)) {
	         System.out.println("Login successful!");
	      } else {
	         System.out.println("Login failed.");
	      }
	      
	      // Close the browser
	      driver.close();
	}

}
