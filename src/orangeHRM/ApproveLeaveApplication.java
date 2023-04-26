package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApproveLeaveApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.manage().windows().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 // Enter the login credentials
		 driver.findElement(By.id("username")).sendKeys("Admin");
	        driver.findElement(By.id("password")).sendKeys("admin123");
	        driver.findElement(By.id("login-btn")).click();

	     // Verify that the manager has approved the leave application
	        String status = driver.findElement(By.id("leave-status")).getText();
	        if (status.equals("Approved")) {
	            System.out.println("Manager has approved the leave application");
	        }
	        else {
	       
	            System.out.println("Manager has not approved the leave application");
	        }

	        // Close the browser window
	        driver.quit();
	}

}
