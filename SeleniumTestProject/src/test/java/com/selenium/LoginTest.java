package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        // ✅ Correct path to the actual chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91993\\myfirst\\chromedriver-win64\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // ✅ Open the local HTML file
        driver.get("file:///C:/Users/91993/myfirst/SeleniumTestProject/index.html");
    }

    @Test
    public void testLogin() {
        // ✅ Assuming these IDs exist in index.html
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login"));

        username.sendKeys("testuser");
        password.sendKeys("password123");
        loginButton.click();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
