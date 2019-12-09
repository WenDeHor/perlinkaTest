import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shues {
    WebDriver webDriver;

    public Shues(WebDriver driver) {
        this.webDriver = driver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
