package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionEx {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harsha Patil\\Downloads\\geckodriver-v0.31.0-win64(1)\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.in/");
        // maximize the window
        driver.manage().window().maximize();
        Actions builder = new Actions(driver);

        // double click

        WebElement sell = driver.findElement(By.linkText("Sell"));
        Thread.sleep(2000);
        builder.doubleClick(sell);
       // driver.navigate().back();
        Thread.sleep(3000);

        // context click -right

        WebElement Mobiles  = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
        Thread.sleep(3000);
        builder.contextClick(Mobiles);
        Thread.sleep(6000);

        WebElement locale = driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[1]/span[1]/span[2]/span[1]"));
        builder.moveToElement(locale).perform();
        System.out.println("Locale selection to be done");
       // Thread.sleep(6000);

       // WebElement hindi = driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-icp']/div[2]/a[2]/span[1]/span[1]"));
       // hindi.click();




    }

}
