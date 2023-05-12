import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchingTicket {
    @Test
    public void searchTicket (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
        driver.navigate().to("https://www.traveloka.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[text()='Flights' and @dir='auto']")).click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//input[data-testid=\"airport-input-departure\"]"))).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Jakarta (CGK)')]"))).findElement(By.xpath("//*[contains(text(), 'Jakarta (CGK)')]")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Origin']"))).findElement(By.xpath("//input[@placeholder='Origin']")).click();
       // driver.findElement(By.xpath("//input[@placeholder='Origin']")).sendKeys("Jakarta");
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body//div[@id='__next']//div[@class='css-1dbjc4n r-18u37iz r-kzbkwu']//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n']//div[1]//div[1]//div[1]//div[1]"))).findElements(By.xpath("//body//div[@id='__next']//div[@class='css-1dbjc4n r-18u37iz r-kzbkwu']//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n']//div[1]//div[1]//div[1]//div[1]"));

        driver.close();

    }
}
