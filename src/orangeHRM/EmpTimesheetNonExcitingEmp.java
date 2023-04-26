package orangeHRM;

public class EmpTimesheetNonExcitingEmp {

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
	     // Navigate to the web page where the employee timesheet is located
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");
	        
	     // Enter the employee name of a non-existing employee in the appropriate input field
	        driver.findElement(By.id("employeename")).sendKeys("maxwell");

	        // Click the button to view the timesheet
	        driver.findElement(By.id("submit")).click();

	        // Check if an error message indicating that the employee does not exist is displayed
	        WebElement errorMessage = driver.findElement(By.className("error-message"));

	        if (errorMessage.isDisplayed() && errorMessage.getText().contains("Employee does not exist")) {
	            System.out.println("Error message indicating non-existing employee is displayed.");
	        } else {
	            System.out.println("Error message indicating non-existing employee is not displayed.");
	        }

	        // Close the browser 
	        driver.quit();
	}

}
