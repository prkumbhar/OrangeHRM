package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WorkWeekFunction {

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
	        
	     // Navigate to the work week settings page
	        WebElement adminMenu = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
	        adminMenu.click();
	        WebElement timeMenu = driver.findElement(By.xpath("//a[@id='menu_admin_time_viewTimeModule']"));
	        timeMenu.click();
	        WebElement workWeekMenu = driver.findElement(By.xpath("//a[@id='menu_admin_defineWorkWeek']"));
	        workWeekMenu.click();
	        
	        // Verify that the work week settings page is displayed
	        WebElement pageTitle = driver.findElement(By.xpath("//h1[text()='Define Work Week']"));
	        if (pageTitle.isDisplayed()) {
	            System.out.println("Work Week Settings page is accessible.");
	        } else {
	            System.out.println("Work Week Settings page is not accessible.");
	        }
	        
	        // Close the browser
	        driver.quit();
	}

}
