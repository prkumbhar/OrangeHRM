package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectLeaveType {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 

		         // Find and fill in the username and password fields
		         WebElement usernameField = driver.findElement(By.id("username"));
		         WebElement passwordField = driver.findElement(By.id("password"));
		         usernameField.sendKeys("admin");
		         passwordField.sendKeys("admin123");

		         // Click the login button
		         WebElement loginButton = driver.findElement(By.id("loginButton"));
		         loginButton.click();

		         // Navigate to the leave application page
		         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");

		         // Find and fill in the employee name, leave type, and other details
		         WebElement employeeField = driver.findElement(By.id("employeeField"));
		         WebElement leaveTypeField = driver.findElement(By.id("leaveTypeField"));
		         WebElement startDateField = driver.findElement(By.id("startDateField"));
		         WebElement endDateField = driver.findElement(By.id("endDateField"));
		         WebElement reasonField = driver.findElement(By.id("reasonField"));
		         employeeField.sendKeys("priya k");
		         leaveTypeField.sendKeys("annual leave");
		         startDateField.sendKeys("2023-04-11");
		         endDateField.sendKeys("2023-04-12");
		         reasonField.sendKeys("Vacation");

		         // Click the "Apply" button
		         WebElement applyButton = driver.findElement(By.id("applyButton"));
		         applyButton.click();

		         // Verify that the leave application was successful
		         WebElement successMessage = driver.findElement(By.id("successMessage"));
		         String successMessageText = successMessage.getText();
		         if (successMessageText.contains("Leave applied successfully")) {
		             System.out.println("Leave applied successfully with correct leave type");
		         } else {
		             System.out.println("Failed to apply leave with correct leave type");
		         }

		         // Close the browser window
		         driver.quit();
		 
	}

}
