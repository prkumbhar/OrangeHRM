package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalTime;

public class PunchOutTime {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.manage().windows().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		        // Find the punch-in and punch-out time elements by their IDs or other suitable locators
		        WebElement punchInElement = driver.findElement(By.id("punchInTime"));
		        WebElement punchOutElement = driver.findElement(By.id("punchOutTime"));

		        // Get the text values of the punch-in and punch-out times
		        String punchInTime = punchInElement.getText();
		        String punchOutTime = punchOutElement.getText();

		        // Parse the punch-in and punch-out times as LocalTime objects
		        LocalTime punchIn = LocalTime.parse(punchInTime);
		        LocalTime punchOut = LocalTime.parse(punchOutTime);

		        // Verify that punch-out time is later than punch-in time
		        if (punchOut.isAfter(punchIn)) {
		            System.out.println("Punch-out time is valid.");
		        } else {
		            System.out.println("Punch-out time is invalid.");
		        }

		        // Close the browser 
		        driver.close();

	}

}
