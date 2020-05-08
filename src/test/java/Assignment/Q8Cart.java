package Assignment;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8Cart {
    @Test
    public void AddToCart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) wd;

        wd.get("http://automationpractice.com");

        wd.manage().window().maximize();

        wd.findElements(By.className("product-image-container")).get(3).click();
        Thread.sleep(3000);
        wd.switchTo().frame(1);
        Thread.sleep(3000);
        //wd.switchTo().defaultContent();
        wd.findElement(By.cssSelector(".buttons_bottom_block.no-print")).click();
        Thread.sleep(3000);
        //ver
        // . the product..
        wd.findElement(By.cssSelector(".btn.btn-default.button.button-medium")).click();
        Thread.sleep(3000);
        int no=Integer.parseInt(wd.findElement(By.cssSelector(".shopping_cart .ajax_cart_quantity")).getText());
        Assert.assertEquals(1,no);

        wd.quit();
    }
}
