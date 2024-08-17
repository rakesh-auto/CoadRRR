import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AutoTest {
    WebDriver driver;
    @BeforeMethod
    public void initialization(){
        System.setProperty("webdriver,crome,driver","src/Browser/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @Test
    public void tc01() throws InterruptedException {
        WebElement categoryWomenBtn= driver.findElement(By.xpath("//div[@id='accordian']//div[1]//div[1]//h4[1][normalize-space()='Women']"));
        List<WebElement> dressBtn = driver.findElements(By.xpath("//div[@id='Women']//div//ul//child::li"));

        categoryWomenBtn.click();
        Thread.sleep(3000);
        for(WebElement ele:dressBtn){
            if (ele.getText().trim().equalsIgnoreCase("Tops"));
            ele.click();
        }


    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
