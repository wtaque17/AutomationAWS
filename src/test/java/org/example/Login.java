package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;


public class Login{

    @Test
    public  void test() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.manage().window().maximize();

        //login
        WebElement login = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        login.click();

        WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
        username.sendKeys("username7878.88@gmail.com");

        WebElement contin = driver.findElement(By.xpath("//input[@id='continue']"));
        contin.click();

        WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
        password.sendKeys("875658?=)(/8");

        WebElement login_btn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        login_btn.click();

        //search an article
        WebElement search_amazon = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search_amazon.sendKeys("cama para perros");

        WebElement search_amazon_btn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        search_amazon_btn.click();






    }
}
