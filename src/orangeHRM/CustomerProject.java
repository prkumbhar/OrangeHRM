package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerProject {

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
	        
	     // Navigate to the customer project info page
	        WebElement customerProjectInfoLink = driver.findElement(By.xpath("//a[text()='Customer Project Info']"));
	        customerProjectInfoLink.click();

	        // Verify that the customer project info page is displayed
	        WebElement customerProjectInfoPage = driver.findElement(By.xpath("//h1[text()='Customer Project Info']"));
	        if (customerProjectInfoPage.isDisplayed()) {
	            System.out.println("Customer Project Info page is accessible.");
	        } else {
	            System.out.println("Customer Project Info page is not accessible.");
	            driver.quit();
	            return;
	        }

	        // Click on the 'Edit' button for a specific customer project
	        WebElement editButton = driver.findElement(By.xpath("//button[@class='edit-button'][1]")); // Replace with the appropriate locator for the 'Edit' button
	        editButton.click();

	        // Update the customer project info by modifying the input fields
	        WebElement projectNameField = driver.findElement(By.id("projectName"));
	        projectNameField.clear(); // Clear the existing value
	        projectNameField.sendKeys("Updated Project Name"); // Replace with the desired updated value

	        WebElement projectCodeField = driver.findElement(By.id("projectCode"));
	        projectCodeField.clear(); // Clear the existing value
	        projectCodeField.sendKeys("PRJ002"); // Replace with the desired updated value

	        // Click on the 'Save' button to save the changes
	        WebElement saveButton = driver.findElement(By.xpath("//button[text()='Save']"));
	        saveButton.click();

	        // Verify that the changes are saved by checking for success message or updated values
	        WebElement successMessage = driver.findElement(By.xpath("//div[@class='success-message']"));
	        if (successMessage.isDisplayed()) {
	            System.out.println("Customer Project Info updated successfully.");

	            // Close the browser
	            driver.quit();

	}

}
