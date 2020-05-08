package Assignment;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q12dgdrp {
    @Test
    public void openChromebrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) wd;

        wd.get("http://demo.guru99.com/test/drag_drop.html");

        wd.manage().window().maximize();
        Thread.sleep(5000);
        WebElement from1 = wd.findElement(By.id("credit2"));
        WebElement to1 = wd.findElement(By.id("bank"));

        Actions act = new Actions(wd);
        act.dragAndDrop(from1, to1).build().perform();
        Thread.sleep(5000);
        var dbmv1=wd.findElement(By.id("t7")).getText();
        var cdmv1=wd.findElement(By.id("t8")).getText();
        String zero="0";
        String Five="5000";

        Assert.assertEquals(zero,dbmv1);
        Assert.assertEquals(zero,cdmv1);

        WebElement from2 = wd.findElement(By.id("fourth"));
        WebElement to2 = wd.findElement(By.id("amt7"));
        act.dragAndDrop(from2, to2).build().perform();
        Thread.sleep(5000);
        var dbmv2=wd.findElement(By.id("t7")).getText();
        var cdmv2=wd.findElement(By.id("t8")).getText();
        Assert.assertEquals(Five,dbmv2);
        Assert.assertEquals(zero,cdmv2);

        WebElement from3 = wd.findElement(By.id("credit1"));
        WebElement to3 = wd.findElement(By.id("loan"));
        act.dragAndDrop(from3, to3).build().perform();
        Thread.sleep(5000);
        var dbmv3=wd.findElement(By.id("t7")).getText();
        var cdmv3=wd.findElement(By.id("t8")).getText();
        Assert.assertEquals(Five,dbmv3);
        Assert.assertEquals(zero,cdmv3);

        WebElement from4 = wd.findElement(By.id("fourth"));
        WebElement to4 = wd.findElement(By.id("amt8"));
        act.dragAndDrop(from4, to4).build().perform();
        Thread.sleep(5000);

        var dbmv4=wd.findElement(By.id("t7")).getText();
        var cdmv4=wd.findElement(By.id("t8")).getText();
        Assert.assertEquals(Five,dbmv4);
        Assert.assertEquals(Five,cdmv4);

        var prf=wd.findElement(By.id("equal")).getText();
        var perf="Perfect!";
        Assert.assertEquals(perf,prf);

        wd.quit();
    }
}
