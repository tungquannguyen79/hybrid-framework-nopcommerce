package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	String projectPath = System.getProperty("user.dir");
	private WebDriver driver;
// Chứa những hàm dùng chung cho tầng Testcase
	protected WebDriver getBrowserDriver(String browserName) {
		if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			throw new RuntimeException("Browser name invalid");
		}
		return driver;

	}
}
