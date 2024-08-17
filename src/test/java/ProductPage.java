import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductPage {
    WebDriver driver;
    @BeforeMethod
    public void Initialization() {
        System.setProperty("webdriver,crome,driver","src/Browser/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
    }


    @Test
    public void tc01(){
        WebElement signInBtn= driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        signInBtn.click();
        String succesMassege= driver.findElement(By.xpath("//h2[text()='Login to your account']")).getText();

        Assert.assertEquals(succesMassege,"Login to your account");







    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
