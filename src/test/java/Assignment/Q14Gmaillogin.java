package Assignment;

import lib.ExcelDataConfig;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Q14Gmaillogin {
    WebDriver wd;
    @Test(dataProvider="gmaillogin")
    public void Login(String email,String password) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
       wd = new ChromeDriver();
      wd.get("http://www.gmail.com");
      wd.manage().window().maximize();
      Thread.sleep(5000);
       WebElement emailElement=wd.findElement(By.xpath("//*[@id=\"identifierId\"]"));
       emailElement.sendKeys(email);
        Thread.sleep(5000);
       WebElement emailnext=wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span"));
       emailnext.click();
        Thread.sleep(10000);
       WebElement pswElement=wd.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
       pswElement.sendKeys(password);
        Thread.sleep(5000);
       WebElement pswnext=wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span"));
       pswnext.click();
        Thread.sleep(10000);
        Assert.assertTrue(wd.getTitle().contains("Inbox"));
        }
       @AfterMethod
    public void teardown(){
    wd.quit();
       }
       @DataProvider(name="gmaillogin")
    public Object[][] passData(){
           ExcelDataConfig Excel = new ExcelDataConfig("C:\\Users\\thisi\\Desktop\\source.xlsx");
            int rows=Excel.getRowCount(0);
            Object[][] data=new Object[rows][2];
           for (int i=0;i<rows;i++)
           {
               data[i][0]=Excel.getData(0,i,0);
               data[i][1]=Excel.getData(0,i,1);

           }
           return data;
       }
    }
