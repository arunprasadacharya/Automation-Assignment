package Assignment;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q6Scroll {
    @Test
    public void Scroll() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) wd;//typecast
        //Open Browser
        wd.get("http://automationpractice.com");
        //Maximize Browser
        wd.manage().window().maximize();
        //Wait for 5 sec
        Thread.sleep(5000);

        wd.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
        js.executeScript("window.scrollBy(0,1500)");
        WebElement Slider=wd.findElement(By.xpath("//*[@id='layered_price_slider']/a[1]"));
//        Point point=Slider.getLocation();
//        int x=point.getX();
//        int y=point.getY();
//        System.out.println(x+","+y);
        Actions actions=new Actions(wd);
       actions.dragAndDropBy(Slider,245,0).build().perform();
       String Actual=wd.findElement(By.id("layered_price_range")).getText();
       String Expected="$53.00 - $53.00";
        Assert.assertEquals(Expected,Actual);

        wd.quit();
            }
}
