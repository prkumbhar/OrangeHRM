package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RejectLeaveApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.manage().windows().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		// Enter the login credentials and click the login button
	        driver.findElement(By.id("username")).sendKeys("Admin");
	        driver.findElement(By.id("password")).sendKeys("admin123");
	        driver.findElement(By.id("login-button")).click();


	        // Enter the reason for rejecting the leave application
	        driver.findElement(By.id("reject-reason")).sendKeys("Not enough coverage");

	        // Click the reject button
	        driver.findElement(By.id("reject-button")).click();

	        // Verify that the leave application was rejected
	        String message = driver.findElement(By.id("message")).getText();
	        if (message.equals("Leave application rejected.")) {
	            System.out.println("Leave application was successfully rejected.");
	        } else {
	            System.out.println("Leave application rejection failed.");
	        }

	        // Close the browser
	        driver.quit();
		 
	}

}
