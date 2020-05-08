package Assignment;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q11toolsqa {
    @Test
    public void alert() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) wd;

        wd.get("https://demoqa.com/automation-practice-form/");

        wd.manage().window().maximize();

        Thread.sleep(5000);
        String A = wd.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/fieldset/div[2]/a/strong")).getText();
        System.out.println(A);
        Assert.assertEquals(A, "Partial Link Test");
        String B = wd.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/fieldset/div[5]/a/strong")).getText();
        System.out.println(B);
        Assert.assertEquals(B, "Link Test");
        js.executeScript("window.scrollBy(0,500)");
        wd.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Ram");
        Thread.sleep(5000);
        wd.findElement(By.id("lastname")).sendKeys("Bahadur");
        Thread.sleep(5000);
        wd.findElement(By.id("sex-0")).click();
        Thread.sleep(2000);
        wd.findElement(By.id("exp-4")).click();
        Thread.sleep(2000);
        DateFormat Datef=new SimpleDateFormat("MM/dd/yyyy");
        Date date1=new Date();
        String date=Datef.format(date1);
        wd.findElement(By.id("datepicker")).sendKeys(date);
        Thread.sleep(2000);
        wd.findElement(By.id("profession-0")).click();
        wd.findElement(By.id("profession-1")).click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
        String C = wd.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/fieldset/div[25]/a")).getText();
        System.out.println(C);
        Assert.assertEquals(C, "Selenium Automation Hybrid Framework");
        String D = wd.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/fieldset/div[26]/a")).getText();
        System.out.println(D);
        Assert.assertEquals(D, "Test File to Download");
        Thread.sleep(2000);
        wd.findElement(By.id("tool-0")).click();
        wd.findElement(By.id("tool-2")).click();
        Thread.sleep(2000);
        Select Drp=new Select(wd.findElement(By.id("continents")));
        Drp.selectByVisibleText("North America");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"continentsmultiple\"]/option[2]")).click();
        Thread.sleep(2000);
       // wd.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();
        wd.findElement(By.xpath("//*[@id=\"selenium_commands\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,300)");
        var List=wd.findElements(By.className("button"));
        int num=List.size();
        System.out.println(num);
        Assert.assertEquals(num,4);
        wd.findElement(By.id("submit2")).click();
        Thread.sleep(5000);
        var List1=wd.findElements(By.id("beverages"));
        int num1=List.size();
        System.out.println(num1);
        Assert.assertEquals(num1,4);
        Thread.sleep(5000);

        wd.quit();
    }
}
