import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchingTicket {
    @Test
    public void searchTicket () throws InterruptedException {
        if(System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
        }else{
            System.setProperty("webdriver.chrome.driver", "/Users/reinhart/Documents/chromedriver/chromedriver");
        }
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
        driver.navigate().to("https://www.traveloka.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[text()='Flights' and @dir='auto']")).click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));

        //click and fill depature input text
        wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//input[@data-testid='airport-input-departure']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//input[@data-testid='airport-input-departure']"))).sendKeys("Balikpapan");
        wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//span[contains(text(),'BPN')]"))).click();


        //click and fill input text
        wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//input[@data-testid='airport-input-destination']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//input[@data-testid='airport-input-destination']"))).sendKeys("airport-input-destination");
        wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//span[contains(text(),'JKTA')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//div[text()='Search Flights']"))).click();
        Thread.sleep(3000);
        driver.close();

    }
}
