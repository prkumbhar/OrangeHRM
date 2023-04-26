package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddLeaveEntitlement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.manage().windows().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		        
		        // Enter the login credentials and click the login button
		        driver.findElement(By.id("username")).sendKeys("admin");
		        driver.findElement(By.id("password")).sendKeys("admin123");
		        driver.findElement(By.id("login-button")).click
		        
		        //// Navigate to the leave entitlement page
		        Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/addLeaveEntitlement")

		        // Select the leave type
		        driver.findElement(By.id("leave-type")).sendKeys("Annual Leave");

		        // Enter the entitlement amount
		        driver.findElement(By.id("entitlement")).sendKeys("20");

		        // Click the save button
		        driver.findElement(By.id("save-button")).click();

		        // Verify that the leave entitlement was added successfully
		        String message = driver.findElement(By.id("message")).getText();
		        if (message.equals("Leave entitlement added successfully.")) {
		            System.out.println("Leave entitlement was successfully added.");
		        } else {
		            System.out.println("Leave entitlement addition failed.");
		        }

		        // Close the browser
		        driver.quit();
		    
	}	

}	


