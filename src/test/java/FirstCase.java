//TODO    Провести тестирование по таким пунктам:
//        1. в разделе Распродажи проверить на трех товарах есть ли в карточке товара акционная цена
//        Для этого, рандомно, на первой страничке выбрать товар, провалиться в карточку товара и проверить наличие цены
//        Так для 3-х товаров (выбор количества проверяемых товаров сделать гибким)

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class FirstCase extends WebDriverSetingss {

    @Test
    public void open() {
        driver.get("https://www.perlinka.ua/index.php/component/virtuemart/view/category/category_id/8/s/rasprodazha");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Распродажа детской обуви в Одессе, Киеве - доставка по Украине > заказать в интернет-магазине | Perlinka"));
    }

    @Test
    public void sales() {
        driver.get("https://www.perlinka.ua");
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu")));
        WebElement menu = driver.findElement(By.id("menu"));
        menu.findElement(By.cssSelector("[href=\"/index.php/component/virtuemart/view/category/category_id/8/s/rasprodazha\"]")).click();

       //driver.findElement(By.id("items-list clearfix")).click();
//        int idproduct = 5000;
//        Random random = new Random();
//        int i = random.nextInt(10);
//        int idP = idproduct;
//        String url = ;

      driver.findElement(By.cssSelector("[href=\"/index.php/component/virtuemart/view/productdetails/virtuemart_product_id/5004/demisezonnye_botinki_iz_nubuka,_na_lipuchkah\"]")).click();


//        WebElement botom = driver.findElement(By.cssSelector("items-list clearfix"));
//        botom.findElement(By.id(url)).click();
//
//        String title = driver.findElement(By.cssSelector("item-details__old-price")).getText();


        // WebElement heder = driver.findElement(By.id("[href=\"/index.php/component/virtuemart/view/category/category_id/8/s/rasprodazha\"]"));
        //heder.findElement(By.cssSelector("[href=\"/index.php/component/virtuemart/view/category/category_id/8/s/rasprodazha\"]")).click();


        //driver.findElement(By.className("[class=\"item item__discont\"]")).click();

        // String title = driver.findElement(By.className("[class=\"item item__discont\"]")).getText();

//        Assert.assertEquals(title, "item-details__old-price");


        // driver.findElement(By.cssSelector("href=\"/index.php/component/virtuemart/view/productdetails/virtuemart_product_id/5005/demisezonnye_botinki_na_rebristoy_podoshve\""));

        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
//        driver.findElement(By.cssSelector(url));
//
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // WebElement title = driver.findElement(By.cssSelector("[item-details__old-price]"));
        //String title = driver.getTitle();

        //Assert.assertTrue(title.equals("[item-details__old-price]"));

    }
}



