package Assignment;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1tiTle {
    @Test
    public void Title() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com");
        wd.manage().window().maximize();
            Thread.sleep(1000);

        String Title = "My Store";
        String title = wd.getTitle();
        System.out.println(title);
        Assert.assertEquals(Title,title);

        wd.quit();

    }
}
