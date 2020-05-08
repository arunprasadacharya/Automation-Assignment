package Assignment;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10Alert {
    @Test
    public void alert() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) wd;

        wd.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver");

        wd.manage().window().maximize();

        Thread.sleep(5000);
        wd.findElement(By.id("cookie_action_close_header")).click();
//        wd.switchTo().window("childwindow");
//        wd.close();

        wd.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
        Thread.sleep(5000);
        Alert alert=wd.switchTo().alert();
        String alertmsg=wd.switchTo().alert().getText();
        System.out.println(alertmsg);
        alert.accept();
        Assert.assertEquals("A simple Alert",alertmsg);
        Thread.sleep(3000);
        //*[@id="content"]/p[7]/button
        wd.findElement(By.xpath("//*[@id=\"cp_id_fbcbd-1\"]/div[2]/div/div[2]/img")).click();
        Thread.sleep(10000);
        wd.findElement(By.xpath("//*[@id=\"content\"]/p[7]/button")).click();
        Thread.sleep(2000);
        Alert alert1=wd.switchTo().alert();
        String alert1msg=wd.switchTo().alert().getText();
        System.out.println(alert1msg);
        alert1.dismiss();
        Assert.assertEquals("Confirm pop up with OK and Cancel button",alert1msg);
        Thread.sleep(10000);
        wd.findElement(By.xpath("//*[@id=\"content\"]/p[10]/button")).click();
        Alert alert2=wd.switchTo().alert();
        String alert2msg=wd.switchTo().alert().getText();
        System.out.println(alert2msg);
        wd.switchTo().alert().sendKeys("Yes");
        Thread.sleep(5000);
        alert2.accept();
        Assert.assertEquals("Do you like toolsqa?",alert2msg);
        wd.quit();
    }

}
