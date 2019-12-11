//TODO    Провести тестирование по таким пунктам:
//        1. в разделе Распродажи проверить на трех товарах есть ли в карточке товара акционная цена
//        Для этого, рандомно, на первой страничке выбрать товар, провалиться в карточку товара и проверить наличие цены
//        Так для 3-х товаров (выбор количества проверяемых товаров сделать гибким)

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.*;
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


        WebElement menu = driver.findElement(By.id("menu"));
        menu.findElement(By.cssSelector("[href=\"/index.php/component/virtuemart/view/category/category_id/8/s/rasprodazha\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30, 500);

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("item__link")));
    }

    @Test
    public void openShues() {
        driver.get("https://www.perlinka.ua");


        WebElement menu = driver.findElement(By.id("menu"));
        menu.findElement(By.cssSelector("[href=\"/index.php/component/virtuemart/view/category/category_id/8/s/rasprodazha\"]")).click();

        List<WebElement> listOfElements = driver.findElements(By.cssSelector("[class=\"item item__discont\"]"));
        for (int i = 0; i<1; i++) {
            WebElement s = listOfElements.get(3);
            s.click();
            //driver.findElement(By.cssSelector("[class=\"item item__discont\"]")).click();
        }




        // driver.findElement(By.tagName("div")).click();
        //driver.findElement(By.className("item__link")).findElements(By.tagName("div"));

        //driver.quit();
    }
//    WebDriverWait wait = new WebDriverWait(driver, 30, 500);
//
//      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("item__link")));


}



