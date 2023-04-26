package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttendanceReport {

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
	        
	     // Verify that the login is successful by checking the presence of the dashboard page
	        WebElement dashboardPage = driver.findElement(By.xpath("//h1[text()='Dashboard']"));
	        if (dashboardPage.isDisplayed()) {
	            System.out.println("Login successful.");
	        } else {
	            System.out.println("Login failed.");
	            driver.quit();
	            return;
	        }

	        // Navigate to the attendance report page
	        WebElement attendanceReportLink = driver.findElement(By.xpath("//a[text()='Attendance Reports']"));
	        attendanceReportLink.click();

	        // Verify that the attendance report page is displayed
	        WebElement attendanceReportPage = driver.findElement(By.xpath("//h1[text()='Attendance Reports']"));
	        if (attendanceReportPage.isDisplayed()) {
	            System.out.println("Attendance Report page is accessible.");
	        } else {
	            System.out.println("Attendance Report page is not accessible.");
	            driver.quit();
	            return;
	        }

	        // View an attendance report by selecting a date range and clicking on the 'View Report' button
	        WebElement fromDateField = driver.findElement(By.id("fromDate"));
	        fromDateField.sendKeys("2023-01-01"); 
	        WebElement toDateField = driver.findElement(By.id("toDate"));
	        toDateField.sendKeys("2023-04-12"); 
	        WebElement viewReportButton = driver.findElement(By.xpath("//button[text()='View Report']"));
	        viewReportButton.click();

	        // Verify that the report is displayed by checking the presence of the report data
	        WebElement reportData = driver.findElement(By.xpath("//table[@id='reportData']"));
	        if (reportData.isDisplayed()) {
	            System.out.println("Attendance Report viewed successfully.");
	        } else {
	            System.out.println("Attendance Report viewing failed.");
	        }
	        
	        // Close the browser
	        driver.quit();
	}

}
