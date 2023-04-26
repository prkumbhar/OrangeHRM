package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AddEntitlementForMultipleEmp {

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
		        
		        //// Navigate to the leave entitlement page
		        Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/addLeaveEntitlement");
		        
		        // Loop through the list of employees for whom you want to add leave entitlement
		        String[] employees = {"employee1", "employee2", "employee3"};
		        for (String employee : employees) {
		            // Find and click the "Add Leave Entitlement" button
		            WebElement addLeaveEntitlementButton = driver.findElement(By.id("addLeaveEntitlementButton"));
		            addLeaveEntitlementButton.click();

		            // Find and fill in the employee name and leave entitlement details
		            WebElement employeeField = driver.findElement(By.id("employeeField"));
		            WebElement leaveTypeField = driver.findElement(By.id("leaveTypeField"));
		            WebElement leaveEntitlementField = driver.findElement(By.id("leaveEntitlementField"));
		            employeeField.sendKeys(employee);
		            leaveTypeField.sendKeys("annual leave");
		            leaveEntitlementField.sendKeys("10");

		            // Click the "Save" button
		            WebElement saveButton = driver.findElement(By.id("saveButton"));
		            saveButton.click();

		            // Verify that the leave entitlement was added successfully
		            WebElement successMessage = driver.findElement(By.id("successMessage"));
		            String successMessageText = successMessage.getText();
		            if (successMessageText.contains("Leave entitlement added successfully")) {
		                System.out.println("Leave entitlement added for multiple employee: " + employee);
		            } else {
		                System.out.println("Failed to add leave entitlement for multiple employee: " + employee);
		            }

		            // Wait for a brief moment before proceeding to the next employee
		            try {
		                Thread.sleep(1000);
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }

		        // Close the browser window
		        driver.quit();
	}

}
