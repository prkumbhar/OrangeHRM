package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PunchInTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.manage().windows().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		        // Find and fill in the username and password fields
		        WebElement usernameField = driver.findElement(By.id("username"));
		        WebElement passwordField = driver.findElement(By.id("password"));
		        usernameField.sendKeys("Admin");
		        passwordField.sendKeys("admin123");
		        
		        // Click the login button
		        WebElement loginButton = driver.findElement(By.id("loginButton"));
		        loginButton.click();
		        
		     // Navigate to the employee dashboard page
		        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");

		        // Find and click the "View Punch-in Time" link
		        WebElement viewPunchInTimeLink = driver.findElement(By.linkText("View Punch-in Time"));
		        viewPunchInTimeLink.click();

		        // Verify that the punch-in time is displayed for the specific employee
		        WebElement punchInTimeElement = driver.findElement(By.id("punchInTime"));
		        String punchInTime = punchInTimeElement.getText();
		        if (!punchInTime.isEmpty()) {
		            System.out.println("Punch-in time for employee is: " + punchInTime);
		        } else {
		            System.out.println("Failed to retrieve punch-in time for employee");
		        }

		        // Close the browser 
		        driver.quit();
	}

}
