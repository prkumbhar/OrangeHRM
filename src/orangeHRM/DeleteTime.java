package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.manage().windows().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		// Find the timesheet delete button by its ID or other suitable locator
	        WebElement deleteButton = driver.findElement(By.id("deleteButton"));

	        // Click on the delete button to delete the time entry
	        deleteButton.click();

	        // Find the confirmation modal dialog by its ID or other suitable locator
	        WebElement confirmDialog = driver.findElement(By.id("confirmDialog"));

	        // Find the confirm delete button within the modal dialog by its ID or other suitable locator
	        WebElement confirmDeleteButton = confirmDialog.findElement(By.id("confirmDeleteButton"));

	        // Click on the confirm delete button to confirm the deletion
	        confirmDeleteButton.click();

	        // Find the timesheet view mode element by its ID or other suitable locator
	        WebElement viewModeElement = driver.findElement(By.id("viewModeElement"));

	        // Verify that the time entry has been deleted and is no longer displayed in the timesheet
	        if (viewModeElement.getText().isEmpty()) {
	            System.out.println("Time entry deleted successfully from timesheet.");
	        } else {
	            System.out.println("Failed to delete time entry from timesheet.");
	        }

	        // Close the browser 
	        driver.close();
	}

}
