package Assignment;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4foter {
    WebDriver wd = new ChromeDriver();
    @Test
    public void forFooter() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd.get("http://automationpractice.com");
        wd.manage().window().maximize();

        List<String> footers = new ArrayList<>(Arrays.asList("My orders", "My credit slips", "My addresses", "My personal info"));

        List<String> actualArray = new ArrayList<>();

       var eFooter= wd.findElements(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li"));
        for( var footer : eFooter) {
            actualArray.add(footer.getText());
        }
        Assert.assertEquals(footers,actualArray);

        wd.quit();
    }
}