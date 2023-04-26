package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AddProject {

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
	     // Navigate to the add project page
	        WebElement addProjectLink = driver.findElement(By.xpath("//a[text()='Add Project']"));
	        addProjectLink.click();

	        // Verify that the add project page is displayed
	        WebElement addProjectPage = driver.findElement(By.xpath("//h1[text()='Add Project']"));
	        if (addProjectPage.isDisplayed()) {
	            System.out.println("Add Project page is accessible.");
	        } else {
	            System.out.println("Add Project page is not accessible.");
	            driver.quit();
	            return;
	        }

	        // Enter project details
	        WebElement projectNameField = driver.findElement(By.id("projectName")); 
	        projectNameField.sendKeys("ACME ltd"); // Replace with the actual project name
	        WebElement projectDescriptionField = driver.findElement(By.id("projectDescription")); 
	        projectDescriptionField.sendKeys("Leading appera manufacturing chain"); 

	        // Click on the submit button to add the project
	        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
	        submitButton.click();

	        // Verify that the project is added by checking for success message or presence of added project in the project list
	        WebElement successMessage = driver.findElement(By.xpath("//div[@class='success-message']")); 
	        if (successMessage.isDisplayed()) {
	            System.out.println("Project added successfully.");
	        } else {
	            WebElement addedProject = driver.findElement(By.xpath("//a[text()='Project 1']")); // Replace with the appropriate locator for the added project
	            if (addedProject.isDisplayed()) {
	                System.out.println("Project added successfully.");
	            } else {
	                System.out.println("Project add failed.");
	            }
	        }

	        // Close the browser
	        driver.quit();
	}

}
