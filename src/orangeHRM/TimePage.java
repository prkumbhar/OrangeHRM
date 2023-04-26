package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimePage {

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

		        // Navigate to the timesheet page
		        driver.get("https://yourwebsite.com/timesheet");

		        // Find and fill in the employee name
		        WebElement employeeField = driver.findElement(By.id("employeeField"));
		        employeeField.sendKeys("employee1");

		        // Click the "Search" button
		        WebElement searchButton = driver.findElement(By.id("searchButton"));
		        searchButton.click();

		        // Verify that the timesheet is displayed for the specific employee
		        WebElement timesheetTable = driver.findElement(By.id("timesheetTable"));
		        if (timesheetTable.isDisplayed()) {
		            System.out.println("Timesheet displayed successfully for employee1");
		        } else {
		            System.out.println("Failed to display timesheet for employee1");
		        }

		        // Close the browser 
		        driver.quit();

	}

}
