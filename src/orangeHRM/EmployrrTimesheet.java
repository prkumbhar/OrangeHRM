package orangeHRM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EmployrrTimesheet {

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
	        
	     // Navigate to the web page where the employee timesheet is located
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");

	        // Check if the timesheet is displayed on the page
	        if (driver.getPageSource().contains("Employee Timesheet")) {
	            System.out.println("Employee timesheet is displayed.");
	        } else {
	            System.out.println("Employee timesheet is not displayed.");
	        }

	        // Close the browser window
	        driver.quit();
	   
	        
	}

}
