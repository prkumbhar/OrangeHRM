package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTime {

	public static void main(String[] args) {
		
		
		        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

				 WebDriver driver = new ChromeDriver();
				 driver.manage().windows().maximize();
				 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		        // Find the timesheet edit button by its ID or other suitable locator
		        WebElement editButton = driver.findElement(By.id("editButton"));

		        // Click on the edit button to enable editing mode
		        editButton.click();

		        // Find the time input field by its ID or other suitable locator
		        WebElement timeInput = driver.findElement(By.id("timeInput"));

		        // Clear the existing value in the time input field
		        timeInput.clear();

		        // Enter a new time value in the time input field
		        String newTime = "10:30 AM";
		        timeInput.sendKeys(newTime);

		        // Find the save button by its ID or other suitable locator
		        WebElement saveButton = driver.findElement(By.id("saveButton"));

		        // Click on the save button to save the edited time
		        saveButton.click();

		        // Find the timesheet view mode element by its ID or other suitable locator
		        WebElement viewModeElement = driver.findElement(By.id("viewModeElement"));

		        // Verify that the edited time value is displayed in the timesheet
		        if (viewModeElement.getText().equals(newTime)) {
		            System.out.println("Time edited successfully in timesheet.");
		        } else {
		            System.out.println("Failed to edit time in timesheet.");
		        }

		        // Close the browser 
		        driver.close();
		
	}

}
