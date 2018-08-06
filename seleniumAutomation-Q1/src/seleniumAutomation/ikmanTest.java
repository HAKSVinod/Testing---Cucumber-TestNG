package seleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ikmanTest {
	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "F:\\UCSC\\3rd year\\SCS 3107\\assignment\\3/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
