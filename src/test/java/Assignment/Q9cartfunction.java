package Assignment;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Q9cartfunction {
    @Test
    public void CartF() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) wd;

        wd.get("http://automationpractice.com");

        wd.manage().window().maximize();

        Thread.sleep(5000);
        wd.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
        js.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(5000);
        wd.findElements(By.className("product-image-container")).get(5).click();
        Thread.sleep(5000);
        wd.switchTo().frame(0);
        wd.findElement(By.className("icon-plus")).click();
        Thread.sleep(2000);
        wd.findElement(By.className("icon-plus")).click();
        Thread.sleep(2000);
        Select drp=new Select(wd.findElement(By.xpath("//*[@id=\"group_1\"]")));
        drp.selectByVisibleText("L");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
        Thread.sleep(5000);
        String size=wd.findElement(By.id("layer_cart_product_attributes")).getText();
        Assert.assertTrue(size.contains("L"));
        String quantity=wd.findElement(By.id("layer_cart_product_quantity")).getText();
        Assert.assertTrue(quantity.contains("3"));
        String total=wd.findElement(By.id("layer_cart_product_price")).getText();
        Assert.assertTrue(total.contains("49.20"));
        wd.findElement(By.className("cross")).click();
        Thread.sleep(5000);
        wd.quit();
    }
}
