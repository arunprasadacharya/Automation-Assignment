package Assignment;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Q13ScrnShoot {

    @Test
    public void scrnshoot() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver wd=new ChromeDriver();
        //Open Browser
        wd.get("http://www.gmail.com");
        //Maximize Browser
        wd.manage().window().maximize();
        //Wait for 5 sec
        Thread.sleep(5000);
        WebElement emailElement=wd.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        String email="qatesting00567@gmail.com";
        emailElement.sendKeys(email);
        TakesScreenshot scrShot =((TakesScreenshot)wd);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(SrcFile, new File("C:\\Users\\thisi\\Documents\\Automation.java\\scrnsht\\img1.png"));

        wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        Thread.sleep(10000);
        wd.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Test@123");
        File SrcFile1=scrShot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(SrcFile1, new File("C:\\Users\\thisi\\Documents\\Automation.java\\scrnsht\\img2.png"));
        wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        Thread.sleep(10000);
        File SrcFile2=scrShot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(SrcFile2, new File("C:\\Users\\thisi\\Documents\\Automation.java\\scrnsht\\img3.jpeg"));
        //Close Browser
        wd.quit();

    }
}

