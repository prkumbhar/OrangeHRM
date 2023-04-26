package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ProjectReport {

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
	        
	        // Navigate to the project report page
	        WebElement projectReportLink = driver.findElement(By.xpath("//a[text()='Project Reports']"));
	        projectReportLink.click();

	        // Verify that the project report page is displayed
	        WebElement projectReportPage = driver.findElement(By.xpath("//h1[text()='Project Reports']"));
	        if (projectReportPage.isDisplayed()) {
	            System.out.println("Project Report page is accessible.");
	        } else {
	            System.out.println("Project Report page is not accessible.");
	            driver.quit();
	            return;
	        }

	        // View a project report by selecting a project and clicking on the 'View Report' button
	        WebElement projectDropdown = driver.findElement(By.xpath("//select[@id='project']"));
	        projectDropdown.sendKeys("Project A"); // Replace with the desired project name
	        WebElement viewReportButton = driver.findElement(By.xpath("//button[text()='View Report']"));
	        viewReportButton.click();

	        // Verify that the report is displayed by checking the presence of the report data
	        WebElement reportData = driver.findElement(By.xpath("//table[@id='reportData']"));
	        if (reportData.isDisplayed()) {
	            System.out.println("Project Report viewed successfully.");
	        } else {
	            System.out.println("Project Report viewing failed.");
	        }

	        // Close the browser
	        driver.quit();

	}

}
