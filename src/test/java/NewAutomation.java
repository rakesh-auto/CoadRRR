import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver,crome,driver","src/Browser/chromedriver.exe");
      WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().fullscreen();
    }
}
