package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfAttendanceRecord {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().windows().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		// Enter the username and password for the admin user
	        WebElement usernameField = driver.findElement(By.id("txtUsername"));
	        usernameField.sendKeys("admin");
	        WebElement passwordField = driver.findElement(By.id("txtPassword"));
	        passwordField.sendKeys("admin123");
	        
	        // Click on the login button
	        WebElement loginButton = driver.findElement(By.id("btnLogin"));
	        loginButton.click();

		        // Navigate to the web page where the self attendance record is located
		        driver.get("https://example.com/attendance");

		         WebElement attendanceTable = driver.findElement(By.id("attendanceTable"));

		        // Check if the self attendance record element is displayed on the page
		        if (selfAttendanceRecord.isDisplayed()) {
		            System.out.println("Self attendance record is displayed.");
		        } else {
		            System.out.println("Self attendance record is not displayed.");
		        }

		        // Close the browser window
		        driver.quit();
		
	}

}
