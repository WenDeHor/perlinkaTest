import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class WebDriverSetingss {
    public static WebDriver driver = null;

    @BeforeTest
    public void before() {
        System.setProperty("webdriver.chrome.driver", "F:\\FATHER\\JAVA\\perlinka\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void after() {
        driver.quit();
    }
}
