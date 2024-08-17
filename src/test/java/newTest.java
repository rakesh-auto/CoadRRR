import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import javax.swing.plaf.PanelUI;

public class newTest {
    WebDriver driver;
    @BeforeMethod
    public void Initialization() {
        System.setProperty("webdriver,crome,driver","src/Browser/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyTheUserNameAndPassword() {

        WebElement userName = driver.findElement(By.id("user-name"));
        WebElement userPassword = driver.findElement(By.id("password"));
        WebElement submitBtn = driver.findElement(By.id("login-button"));
        userName.sendKeys("standard_user");
        userPassword.sendKeys("secret_sauce");
        submitBtn.click();
String logoText=driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();

        Assert.assertEquals(logoText,"Swag Labs");


    }
    @Test
    public void verifyTheUserNameAndWrongPassword() {

        WebElement userName = driver.findElement(By.id("user-name"));
        WebElement userPassword = driver.findElement(By.id("password"));
        WebElement submitBtn = driver.findElement(By.id("login-button"));
        userName.sendKeys("standard_user");
        userPassword.sendKeys("secuce");
        submitBtn.click();
       String logoText=driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
       Assert.assertEquals(logoText,"Swa Labs");


}

@AfterMethod
    public void tearDown(){
        driver.close();
}
}

