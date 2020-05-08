package Assignment;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Q5emailverf {
    @Test
    public void foremail() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com");
        wd.manage().window().maximize();

        wd.findElement(By.id("newsletter-input")).sendKeys("ayhoo.com");
        wd.findElement(By.xpath("//*[@id=\"newsletter_block_left\"]/div/form/div/button")).click();
        String Actual=wd.findElement(By.xpath("//*[@id=\"columns\"]/p")).getText();
        String Expected="Newsletter : Invalid email address.";
        Assert.assertEquals(Actual,Expected);
        wd.findElement(By.id("newsletter-input")).sendKeys("abcde@yhoo.com");
        wd.findElement(By.xpath("//*[@id=\"newsletter_block_left\"]/div/form/div/button")).click();
        String ActualNxt=wd.findElement(By.xpath("//*[@id=\"columns\"]/p")).getText();
        String Expectednxt="Newsletter : You have successfully subscribed to this newsletter.";
        Assert.assertEquals(ActualNxt,Expectednxt);
//        boolean alreadyRegistered=true; //change here, the flag
//        if(alreadyRegistered==false) {
//            Assert.assertEquals(wd.findElement(By.cssSelector(".alert.alert-sucess")).getText(),
//                    "Newsletter : You have successfully subscribed to this newsletter.");
//        }
//        else {
//            Assert.assertEquals(wd.findElement(By.cssSelector(".alert.alert-danger")).getText(),
//                    "Newsletter : This email address is already registered.");
//        }
        wd.quit();
    }
}
