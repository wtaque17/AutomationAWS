package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;


public class Main {

    @Test
    public  void test() throws InterruptedException{

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.manage().window().maximize();

        WebElement login = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        login.click();

        WebElement sign_in = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
        sign_in.click();

        WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
        name.sendKeys("username");

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("username7878.88@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
        password.sendKeys("875658?=)(/8");

        WebElement password_check = driver.findElement(By.xpath("//input[@id='ap_password_check']"));
        password_check.sendKeys("875658?=)(/8");

        WebElement create = driver.findElement(By.xpath("//input[@id='continue']"));
        create.click();



        //
    }
}