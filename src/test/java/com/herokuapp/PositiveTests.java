package com.herokuapp;

import com.sun.org.apache.bcel.internal.classfile.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utility.Sleep;

public class PositiveTests {

    public static final String URL = "http://the-internet.herokuapp.com/login";
    Sleep sleep = new Sleep();

    @Test
    public void loginTest() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.tagName("button"));
    //    WebElement logoutButton = driver.findElement(By.linkText("Logout"));
    //    WebElement logoutButton = driver.findElement(By.xpath("");
    //    WebElement successMessage = driver.findElement(By.cssSelector("#flash"));
        username.click();
        username.sendKeys("Hello");

        sleep.sleep(3000);
        driver.quit();
    }

}
