package Assignment;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3cart {
    @Test
    public void CartSum() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com");
        wd.manage().window().maximize();

    String Carte="Cart (empty)";
        String Cart=wd.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).getText();
        wd.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
//        System.out.println(Cart);
        String cartsummary="Your shopping cart is empty.";
        String CartSummary=wd.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
        Assert.assertEquals(Carte,Cart);
        Assert.assertEquals(cartsummary,CartSummary);

        wd.quit();
        }

}
