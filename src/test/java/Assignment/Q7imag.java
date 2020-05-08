package Assignment;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7imag {
    @Test
    public void ImageHandle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) wd;
        wd.get("http://automationpractice.com");
        wd.manage().window().maximize();
        Thread.sleep(3000);

        wd.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
        js.executeScript("window.scrollBy(0,945)");
        Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"list\"]/a/i")).click();
        js.executeScript("window.scrollBy(0,1195)");
        Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div/div[1]/div/a[2]/span")).click();
        Thread.sleep(3000);
        wd.switchTo().frame(0);
        Thread.sleep(3000);
        wd.findElement(By.id("bigpic")).click();
        Thread.sleep(3000);
        wd.findElement(By.id("bigpic")).click();
        Thread.sleep(2000);
        wd.findElement(By.cssSelector(".fancybox-nav.fancybox-next")).click();
        Thread.sleep(2000);
        wd.findElement(By.cssSelector(".fancybox-nav.fancybox-next")).click();
        Thread.sleep(2000);
        wd.findElement(By.cssSelector(".fancybox-nav.fancybox-next")).click();
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/a")).click();
        Thread.sleep(5000);

        wd.quit();

    }
}
