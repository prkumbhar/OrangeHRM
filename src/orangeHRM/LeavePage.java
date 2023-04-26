package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LeavePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.manage().windows().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 WebElement username = driver.findElement(By.id("txtUsername"));
	        WebElement password = driver.findElement(By.id("txtPassword"));
	        username.sendKeys("Admin");
	        password.sendKeys("admin123");
	        
	        // Click on the login button
	        driver.findElement(By.id("btnLogin")).click();
	        
	        // Navigate to the assign leave page
	        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	        driver.findElement(By.id("menu_leave_assignLeave")).click();
	        
	        // Select employee name
	        WebElement empName = driver.findElement(By.id("assignleave_txtEmployee_empName"));
	        empName.sendKeys("priya k");
	        
	        // Select leave type
	        WebElement leaveType = driver.findElement(By.id("assignleave_txtLeaveType"));
	        leaveType.sendKeys("personal");
	        
	        // Select leave period
	        WebElement fromDate = driver.findElement(By.id("assignleave_txtFromDate"));
	        WebElement toDate = driver.findElement(By.id("assignleave_txtToDate"));
	        fromDate.sendKeys("2023-04-11");
	        toDate.sendKeys("2023-04-12");
	        
	        // Click on the assign button
	        driver.findElement(By.id("assignBtn")).click();
	        
	        // Close the browser
	        driver.quit();
	}

}
