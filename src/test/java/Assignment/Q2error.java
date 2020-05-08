package Assignment;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2error {
    @Test
    public void Saree() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com");
        wd.manage().window().maximize();

        wd.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("saree");
        wd.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
      String msg=  wd.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span")).getText();
      String message="0 results have been found.";
        Assert.assertEquals(msg,message);

        wd.quit();
    }
}
