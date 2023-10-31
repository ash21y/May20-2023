package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome exe files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chromedriver.chromium.org/downloads");
	}

	

}
