package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartDateEndDateFunction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.manage().windows().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 // Find the start date input field and select a date
	        WebElement startDateInput = driver.findElement(By.id("start-date"));
	        startDateInput.sendKeys("2023-04-15");

	        // Find the end date input field and select a date
	        WebElement endDateInput = driver.findElement(By.id("end-date"));
	        endDateInput.sendKeys("2023-04-18");

	        // Verify that the start date and end date have been selected correctly
	        String selectedStartDate = startDateInput.getAttribute("value");
	        String selectedEndDate = endDateInput.getAttribute("value");
	        if (selectedStartDate.equals("2023-04-15") && selectedEndDate.equals("2023-04-18")) {
	            System.out.println("Start date and end date selection test passed!");
	        } else {
	            System.out.println("Start date and end date selection test failed.");
	        }

	        // Close the browser
	        driver.quit();
	}

}
